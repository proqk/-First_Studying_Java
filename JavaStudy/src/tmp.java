import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class tmp extends JFrame implements ActionListener {
    tmp(){
        JPanel jpn = new JPanel();
        JPanel jpn2 = new JPanel();

        Container Panel = this.getContentPane();
        JButton btn1 = new JButton("비1");
        JButton btn2 = new JButton("비2");
        JButton btn3 = new JButton("비3");
        JButton btn4 = new JButton("비4");
        JButton btn5 = new JButton("비5");
        JButton btn6 = new JButton("비6");
        JButton btn7 = new JButton("비7");
        JButton btn8 = new JButton("비8");

        Panel.setBackground(Color.ORANGE);
        Panel.setLayout(new BorderLayout());
        Panel.add(jpn, BorderLayout.NORTH);
        Panel.add(jpn2, BorderLayout.CENTER);

        jpn.setLayout(new FlowLayout());
        jpn.add(btn1);
        jpn.add(btn2);
        jpn.add(btn3);
        jpn.add(btn4);

        jpn2.setLayout(new GridLayout(2,2,5,5));
        jpn2.add(btn5);
        jpn2.add(btn6);
        jpn2.add(btn7);
        jpn2.add(btn8);

        btn8.addActionListener(this);


        this.setTitle("멀티레이아웃 이그잼플 ");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args){
		/*JFrame f = new JFrame();
		f.setTitle("자바자라자라바 ");
		f.setSize(500, 500);
		f.setVisible(true);*/

        tmp e= new tmp();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.exit(0);
    }

}
