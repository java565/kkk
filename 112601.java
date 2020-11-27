import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_score=new JLabel();
    int score1=0,score2=0,score3=0,score=0;
    //构造方法
    public App() {
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX()<50 && e.getY()<300){
                    score1=0;
                    score=score1+score2+score3;
                    label_score.setText(String.valueOf(score));

                }
            }
        });

    }
    //显示窗体方法
    void go(){
     java.net.URL imgURL = App.class.getResource("img/background.jpg");
     label_background.setIcon(new ImageIcon(imgURL));
     label_background.setBounds(0,0,1000,800);
     myPanel.add(label_score);
     myPanel.add(label_background);


        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
