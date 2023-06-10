import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class front extends JFrame {
    private ImageIcon ic,im,imb1,imb2;
    private Container c;
    private JLabel l1;
    private JTextField t1,t2,t3;
    private Font f1;
    private JButton b1,b2;
    private Cursor cu;
    front(){
        cons();
    }

    public void cons(){
        c =this.getContentPane();
        c.setLayout(null);

        f1 = new Font("Arial",Font.BOLD,25);

        ic = new ImageIcon(getClass().getResource("a1.png"));
        this.setIconImage(ic.getImage());

        im = new ImageIcon(getClass().getResource("img.png"));
        l1 = new JLabel("",im,JLabel.CENTER);
        l1.setBounds(0,0,750,500);
        c.add(l1);

        b1 = new JButton("ENTER");
        b1.setBounds(20,340,120,30);
        b1.setFont(f1);
        b1.setBackground(Color.WHITE);

        c.add(b1);
        b2 = new JButton("EXIT");
        b2.setBounds(160,340,100,30);
        b2.setFont(f1);
        b2.setBackground(Color.WHITE);
        c.add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=1;

                if (n == (1)){
                    JOptionPane.showMessageDialog(null,"you are welcome !!!","Message",JOptionPane.INFORMATION_MESSAGE);
                    Calculation ca = new Calculation();
                    ca.setVisible(true);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int op=JOptionPane.showConfirmDialog(null,"are you want to EXIT???","Alart",JOptionPane.YES_NO_OPTION);
                if (op == JOptionPane.YES_OPTION){dispose();}
            }
        });
    }
    public static void main(String[] args) {
        front f = new front();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400,100,750,500);
        f.setTitle("TIME-TABLE OF NAMAJ");
        f.setResizable(false);
    }

}
