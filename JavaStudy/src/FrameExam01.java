import javax.swing.*;
import java.awt.*;

public class FrameExam01 extends JFrame{
    FrameExam01(){
        Container panel = getContentPane();
        JButton b1 = new JButton("계속");
        JButton b2 = new JButton("취소");
        JButton b3 = new JButton("종료");

        panel.setBackground(Color.PINK);
        panel.setLayout(new FlowLayout());
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);


        this.setTitle("title");
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        FrameExam01 f = new FrameExam01();
    }
}
