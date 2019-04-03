package event;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class UIPanelTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -7014574240472451106L;

    public UIPanelTest() {
        Container c = getContentPane();
        // 将整个容器设置为2?1列的网格布局
        c.setLayout(new GridLayout(2, 1, 10, 10));
        // 初始化一个面板，设置1?3列的网格布局
        JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
        p1.add(new JButton("1")); // 在面板中添加按钮
        p1.add(new JButton("2")); // 在面板中添加按钮
        p1.add(new JButton("3")); // 在面板中添加按钮
        p2.add(new JButton("4")); // 在面板中添加按钮
        p2.add(new JButton("5")); // 在面板中添加按钮
        p3.add(new JButton("6")); // 在面板中添加按钮
        p3.add(new JButton("7")); // 在面板中添加按钮
        p4.add(new JButton("8")); // 在面板中添加按钮
        p4.add(new JButton("9")); // 在面板中添加按钮
        c.add(p1); // 在容器中添加面板
        c.add(p2); // 在容器中添加面板
        c.add(p3); // 在容器中添加面板
        c.add(p4); // 在容器中添加面板
        setTitle("在这个窗体中使用了面?");
        setSize(420, 250);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UIPanelTest();
    }
}
