package graphic;

import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;

public class DrawImage extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -815788520207662195L;
    Image img;

    public DrawImage() {
        URL imgUrl = DrawImage.class.getResource("../images/img.jpg");// 获取图片资源的路?
        img = Toolkit.getDefaultToolkit().getImage(imgUrl); // 获取图片资源
        this.setSize(440, 300); // 设置窗体大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
        add(new CanvasPanel()); // 设置窗体面板为绘图面板对?
        this.setTitle("绘图图片"); // 设置窗体标题
    }

    public static void main(String[] args) {
        new DrawImage().setVisible(true);
    }

    class CanvasPanel extends Canvas {
        /**
         *
         */
        private static final long serialVersionUID = 6231413538537931506L;

        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(img, 0, 0, this); // 显示图片
        }
    }
}