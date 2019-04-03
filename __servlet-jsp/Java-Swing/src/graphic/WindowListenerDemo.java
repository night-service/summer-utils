package graphic;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowListenerDemo extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 597304080218532709L;

    public static void main(String args[]) {
        WindowListenerDemo frame = new WindowListenerDemo();
        frame.setVisible(true);
    }

    public WindowListenerDemo() {
        addWindowListener(new MyWindowListener()); // 为窗体添加其他事件监听器
        setTitle("捕获其他窗体事件");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private class MyWindowListener implements WindowListener {
        public void windowActivated(WindowEvent e) { // 窗体被激活时触发
            System.out.println("窗口被激活！");
        }

        public void windowOpened(WindowEvent e) { // 窗体被打?时触?
            System.out.println("窗口被打??");
        }

        public void windowIconified(WindowEvent e) { // 窗体被图标化时触?
            System.out.println("窗口被图标化?");
        }

        public void windowDeiconified(WindowEvent e) { // 窗体被非图标化时触发
            System.out.println("窗口被非图标化！");
        }

        public void windowClosing(WindowEvent e) { // 窗体将要被关闭时触发
            System.out.println("窗口将要被关闭！");
        }

        public void windowDeactivated(WindowEvent e) { // 窗体不再处于?活状态时触发
            System.out.println("窗口不再处于?活状态！");
        }

        public void windowClosed(WindowEvent e) { // 窗体已经被关闭时触发
            System.out.println("窗口已经被关闭！");
        }
    }
}

