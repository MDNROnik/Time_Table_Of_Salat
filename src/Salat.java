import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

public class Salat extends JFrame {
    private ImageIcon ic,im,imb1,imb2;
    private Container c;
    private Font f1;
    private JLabel l1,l2,l3;
    private JCheckBox ck1,ck2,ck3,ck4,ck5;
    private JButton b1,b2,b3;
    private JTextArea t1;
    private Cursor cur;

    Salat(){
        con();
    }

    public void con(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(400,100,750,500);
        this.setTitle("TIME-TABLE OF NAMAJ");
        this.setResizable(false);

        c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        f1 = new Font("Arial",Font.BOLD,20);
        cur = new Cursor(Cursor.HAND_CURSOR);

        ic = new ImageIcon(getClass().getResource("a1.png"));
        this.setIconImage(ic.getImage());

        im = new ImageIcon(getClass().getResource("i3.jpg"));

        l1 = new JLabel("",im,JLabel.CENTER);
        l1.setBounds(375,0,375,500);
        c.add(l1);

        l2 = new JLabel("Which Namaj have you Adaya?");
        l2.setBounds(4,00,365,100);
        l2.setFont(f1);
        c.add(l2);

        ck1=new JCheckBox("FAJR");
        ck1.setBounds(4,60,90,30);
        ck1.setBackground(null);
        ck1.setFont(f1);
        c.add(ck1);

        ck2=new JCheckBox("ZUHAR");
        ck2.setBounds(4,90,120,30);
        ck2.setBackground(null);
        ck2.setFont(f1);
        c.add(ck2);

        ck3=new JCheckBox("ASAR");
        ck3.setBounds(4,120,90,30);
        ck3.setBackground(null);
        ck3.setFont(f1);
        c.add(ck3);

        ck4=new JCheckBox("MAGHRIB");
        ck4.setBounds(4,150,120,30);
        ck4.setBackground(null);
        ck4.setFont(f1);
        c.add(ck4);

        ck5=new JCheckBox("ISHA");
        ck5.setBounds(4,180,90,30);
        ck5.setBackground(null);
        ck5.setFont(f1);
        c.add(ck5);

        b1 = new JButton("SEE");
        b1.setBounds(10,220,120,30);
        b1.setFont(f1);
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);
        b1.setCursor(cur);
        c.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(10,400,120,30);
        b2.setFont(f1);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setCursor(cur);
        c.add(b2);

        b3 = new JButton("EXIT");
        b3.setBounds(150,400,120,30);
        b3.setFont(f1);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setCursor(cur);
        c.add(b3);

        t1 = new JTextArea();
        t1.setBounds(10,250,350,140);
        t1.setFont(f1);
        t1.setBackground(null);
        c.add(t1);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");

                if (ck1.isSelected()){
                }
                else{
                t1.append("Your FAJR Namaj Are KOJA Now"+"\n");
                }

                if (ck2.isSelected()){
                }
                else{
                    t1.append("Your ZUHAR Namaj Are KOJA Now"+"\n");
                }

                if (ck3.isSelected()){
                }
                else{
                    t1.append("Your ASAR Namaj Are KOJA Now"+"\n");
                }
                if (ck4.isSelected()){
                }
                else{
                    t1.append("Your MAGHRIB Namaj Are KOJA Now"+"\n");
                }
                if (ck5.isSelected()){
                }
                else{
                    t1.append("Your ISHA Namaj Are KOJA Now"+"\n");
                }
                if (ck1.isSelected() && ck2.isSelected() && ck3.isSelected() && ck4.isSelected() && ck5.isSelected()){
                    t1.append("You Have None Namaj Have To Aday");
                }
                else{
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int op=JOptionPane.showConfirmDialog(null,"are you want to back???","Alart",JOptionPane.YES_NO_OPTION);
                if (op == JOptionPane.YES_OPTION){dispose();}
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    int op=JOptionPane.showConfirmDialog(null,"are you want to EXIT???","Alart",JOptionPane.YES_NO_OPTION);
                    if (op == JOptionPane.YES_OPTION){System.exit(0);}
                }
            }
        });


    }

    public static void main(String[] args) {
        Salat f = new Salat();
        f.setVisible(true);

    }
}
