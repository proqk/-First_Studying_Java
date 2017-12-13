import javax.swing.*;

public class Components {
    Components() {
        /*체크박스*/
        JCheckBox[] cbgroup = new JCheckBox[3];
        cbgroup[0] = new JCheckBox("1");
        cbgroup[1] = new JCheckBox("2");
        cbgroup[2] = new JCheckBox("3");

        /*라디오박스*/
        JRadioButton[] a = new JRadioButton[2];
        a[0] = new JRadioButton("1",true);
        a[1] = new JRadioButton("2");
        ButtonGroup b = new ButtonGroup();
        b.add(a[0]);
        b.add(a[1]);

        /*라벨*/
        JLabel l = new JLabel("라벨임");

        /*텍스트필드*/
        JTextField jf = new JTextField("기본값",10);

        /*텍스트에리아*/
        JTextArea ja = new JTextArea("기본값",5,10);

        /*리스트*/
        String[] list = {"a","b","c"};
        JList jl = new JList(list);

        /*여러항목*/
        String[] list2 = {"a","b"};
        JComboBox jc = new JComboBox(list2);
        for(int i=0;i<list.length;i++){
            jc.addItem(list2[i]);
        }
    }

    public static void main(String[] args) {
        Components f = new Components();
    }

}
