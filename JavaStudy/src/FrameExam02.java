import javax.swing.*;
import java.awt.*;

public class FrameExam02 extends JFrame{
    FrameExam02(){
        Container panel = this.getContentPane();
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");

        b1.setBounds(20,30,100,50);
        b2.setBounds(40,50,100,50);
        b3.setBounds(60,70,100,50);
        b4.setBounds(80,90,100,50);

        panel.setLayout(null);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FrameExam02 f= new FrameExam02();
    }
}
