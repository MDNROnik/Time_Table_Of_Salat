import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Calculation extends JFrame {
    private ImageIcon ic,im,imb1,imb2;
    private Container c;
    private JLabel l1,l2;
    private Font f1;
    private JButton b1,b2,b3;
    private Cursor cur;
    private JComboBox cb;
    private String[] Namaj= {"FAJR","ZUHAR","ASAR","MAGHRIB","ISHA"};
    private JTextArea ta;
    private Calendar cal;
    Calculation(){
        cons();
    }
    public void cons(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(400,100,750,500);
        this.setTitle("TIME-TABLE OF NAMAJ");
        this.setResizable(false);

        c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        f1 = new Font("Arial",Font.BOLD,18);

        cur = new Cursor(Cursor.HAND_CURSOR);

        ic = new ImageIcon(getClass().getResource("a1.png"));
        this.setIconImage(ic.getImage());

        im = new ImageIcon(getClass().getResource("i11.jpg"));
        l1 = new JLabel("",im,JLabel.CENTER);
        l1.setBounds(0,0,375,500);
        c.add(l1);

        l2 = new JLabel("Which Namaj Start Time You Want To know?");
        l2.setBounds(350,10,375,100);
        l2.setForeground(Color.WHITE);
        l2.setFont(f1);
        c.add(l2);

        cb = new JComboBox(Namaj);
        cb.setBounds(450,80,130,40);
        cb.setEditable(true);
        cb.setBackground(Color.BLACK);
        cb.setForeground(Color.WHITE);
        cb.setFont(f1);
        c.add(cb);

        b1 = new JButton("See");
        b1.setBounds(475,140,80,40);
        b1.setFont(f1);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setCursor(cur);
        c.add(b1);

        ta = new JTextArea();
        ta.setBounds(400,200,350,200);
        ta.setFont(f1);
        ta.setBackground(Color.BLACK);
        ta.setForeground(Color.WHITE);
        c.add(ta);

        Calendar cal = Calendar.getInstance();


        b1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
              String s = cb.getSelectedItem().toString();
                int date = cal.get(Calendar.DAY_OF_MONTH);
                int month= cal.get(Calendar.MONTH);
                month++;

                ta.setText("");
                /*FAJR*/
                if (s.equals("FAJR")){
                    int real_hour,real_minite,minite,month_date;
                    double add_minite;
                    if(month==1){
                        month_date=((month*30)-30)+date;
                        add_minite = (4.00 / 31.00)*month_date;
                        minite = ((5 * 60) + 22) + (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("FAJR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                    else if(month < 7 && month >=2) {
                        month_date=((month*30)-60)+date;
                        add_minite = (94.00 / 151.00)*month_date;
                        minite = ((5 * 60) + 24) - (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("FAJR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                    else{
                        month=month-6;
                        month_date=((month*30)-30)+date;
                        add_minite = (91.00 / 183.00)*month_date;
                        minite = ((3 * 60) + 50) + (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("FAJR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                }
                /*ZUHAR*/
                else if (s.equals("ZUHAR")){
                    int real_hour,real_minite,minite,month_date;
                    double add_minite;
                    if(month==1){
                        month_date=((month*30)-30)+date;
                        add_minite = (10.00 / 31.00)*month_date;
                        minite = ((12 * 60) + 06) + (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("ZUHAR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                    else if(month==12){
                        month_date=((month*30)-334)+date;
                        add_minite = (13.00 / 31.00)*month_date;
                        minite = ((11 * 60) + 51) + (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("ZUHAR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                    else if(month==6 || month ==7){
                        month_date=((month*30)-152)+date;
                        add_minite = (8.00 / 61.00)*month_date;
                        minite = ((12 * 60) + 8) + (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("ZUHAR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }

                    else if(month < 6 && month >=2) {
                        month_date=((month*30)-60)+date;
                        add_minite = (17.00 / 121.00)*month_date;
                        minite = ((12 * 60) + 16) - (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("ZUHAR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                    else{
                        month_date=((month*30)-240)+date;
                        add_minite = (17.00 / 122.00)*month_date;
                        minite = ((12 * 60) + 8) - (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("ZUHAR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                }

                /*ASAR*/
                else if (s.equals("ASAR")){
                    int real_hour,real_minite,minite,month_date;
                    double add_minite;
                    if(month<8) {

                        month_date=((month*30)-30)+date;
                        add_minite = (57.00 / 212.00)*month_date;
                        minite = ((3 * 60) + 58) + (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("ASAR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                    else{
                        month=month-7;
                        month_date=((month*30)-30)+date;
                        add_minite = (58.00 / 153.00)*month_date;
                        minite = ((4 * 60) + 59) - (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("ASAR Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                }
                /*MAGHRIB*/
                else if (s.equals("MAGHRIB")){
                    int real_hour,real_minite,minite,month_date;
                    double add_minite;
                    if(month<7) {

                        month_date=((month*30)-30)+date;
                        add_minite = (87.00 / 182.00)*month_date;
                        minite = ((5 * 60) + 27) + (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("MAGHRIB Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                    else{
                        month=month-6;
                        month_date=((month*30)-30)+date;
                        add_minite = (89.00 / 183.00)*month_date;
                        minite = ((6 * 60) + 58) - (int)add_minite;
                        real_hour = minite / 60;
                        real_minite = minite - (real_hour * 60);
                        ta.append("MAGHRIB Start Time == "+real_hour + " : " + real_minite+"\n");
                    }
                }
                /*Esha*/
              else if (s.equals("ISHA")){
                  int real_hour,real_minite,minite,month_date;
                  double add_minite;
                  if(month<7) {

                      month_date=((month*30)-30)+date;
                      add_minite = (91.00 / 182.00)*month_date;
                      minite = ((6 * 60) + 45) + (int)add_minite;
                      real_hour = minite / 60;
                      real_minite = minite - (real_hour * 60);
                      ta.append("ISHA Start Time == "+real_hour + " : " + real_minite+"\n");
                  }
                  else{
                      month=month-6;
                      month_date=((month*30)-30)+date;
                      add_minite = (91.00 / 184.00)*month_date;
                      minite = ((8 * 60) + 20) - (int)add_minite;
                      real_hour = minite / 60;
                      real_minite = minite - (real_hour * 60);
                      ta.append("ISHA Start Time == "+real_hour + " : " + real_minite+"\n");
                  }
                }
            }
        });

        b2 = new JButton("BACK");
        b2.setBounds(410,400,120,30);
        b2.setFont(f1);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setCursor(cur);
        c.add(b2);

        b3 = new JButton("NEXT");
        b3.setBounds(550,400,120,30);
        b3.setFont(f1);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setCursor(cur);
        c.add(b3);

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
                int n=1;

                if (n == (1)){
                    JOptionPane.showMessageDialog(null,"Welcome to next page !!!","Message",JOptionPane.INFORMATION_MESSAGE);
                    Salat salat = new Salat();
                    salat.setVisible(true);
                }
            }
        });

    }
    public static void main(String[] args) {
        Calculation f = new Calculation();
        f.setVisible(true);


    }

}
