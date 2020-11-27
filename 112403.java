package kk;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

    public class jj {
        JPanel myPanel = new JPanel();
        JLabel aa= new JLabel();
        JLabel bb = new JLabel();
        JFrame frame = new JFrame("窗口");
        int x=150,y=150;
        //    构造方法;
        public jj () {
            myPanel.setLayout(null);
            aa.setBounds(x,y,200,200);
            aa.setIcon(new ImageIcon("src/fj.jpg"));
            myPanel.add(aa);
            bb.setBounds(0,0,512,720);
            bb.setIcon(new ImageIcon("src/fj.jpg"));
            myPanel.add(bb);

            frame.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    super.keyPressed(e);
                    if(e.getKeyCode()==KeyEvent.VK_DOWN){
                        y=y+20;
                        aa.setBounds(x,y,200,200);
                    }
                    if(e.getKeyCode()==KeyEvent.VK_UP){
                        y=y-20;
                        aa.setBounds(x,y,200,200);
                    }
                    if(e.getKeyCode()==KeyEvent.VK_LEFT){
                        x=x-20;
                        aa.setBounds(x,y,200,200);
                    }
                    if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                        x=x+20;
                        aa.setBounds(x,y,200,200);
                    }
                }
            });
        }

        //显示常规方法
        void go() {
            myPanel.setLayout(null);
            frame.setContentPane(myPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(100, 100, 512, 720);
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            new jj().go();
        }
    }

