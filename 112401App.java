import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class kk {
    JPanel myPanel = new JPanel();
    JLabel label_txt = new JLabel();
    JTextArea textArea_A = new JTextArea();
    JTextArea textArea_B = new JTextArea();

//    构造方法;
    public kk () {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }
        });
    }

    //显示常规方法
    void go() {
        textArea_A.setBounds(100, 100, 300, 300);
        textArea_A.setBackground(Color.blue);
        textArea_B.setBounds(100, 300, 300, 300);
        textArea_B.setBackground(Color.magenta);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("123456789");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 512, 720);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new kk().go();
    }
}
