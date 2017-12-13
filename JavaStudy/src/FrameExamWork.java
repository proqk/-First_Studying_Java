import javax.swing.*;
import java.awt.*;

public class FrameExamWork extends JFrame{
    FrameExamWork(){
        Container panel1 = this.getContentPane();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        JButton b6 = new JButton("b6");
        JButton b7 = new JButton("b7");
        JButton b8 = new JButton("b8");

        panel1.setLayout(new BorderLayout());
        panel1.add(panel2, BorderLayout.NORTH);
        panel1.add(panel3, BorderLayout.CENTER);

        panel2.setLayout(new FlowLayout());
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);

        panel3.setLayout(new GridLayout(2,2));
        panel3.add(b5);
        panel3.add(b6);
        panel3.add(b7);
        panel3.add(b8);

        this.setTitle("e");
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        FrameExamWork f = new FrameExamWork();
    }
}
