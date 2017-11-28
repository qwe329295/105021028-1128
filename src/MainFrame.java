import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private  JLabel lab1=new JLabel("SEVER IP:");
    private  JLabel lab2=new JLabel("10.51.3.69");
    private  JLabel lab3=new JLabel("PORT:");
    private JTextField jtf1=new JTextField();
    private JTextField jtf2=new JTextField();
    private JButton btn1 =new JButton("START");
    private JButton btn2 =new JButton("STOP");
    private JButton btn3 =new JButton("EXIT");
    private JButton btn4 =new JButton("SEND");
    private JButton btn[] =new JButton[9];
    private  JTextArea jta =new JTextArea();
    private  JPanel jpn1 =new JPanel(new GridLayout(7,1,3,3));
    private  JPanel jpn2 =new JPanel(new GridLayout(3,3,3,3));
    private  JPanel jpn3 =new JPanel(new BorderLayout(5,5));
    private  JScrollPane jsp=new JScrollPane(jta);
    private  Container cp;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(200,200,500,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(5,5));
        cp.add(jpn1,BorderLayout.EAST);
        cp.add(jpn2,BorderLayout.CENTER);
        cp.add(jpn3,BorderLayout.SOUTH);

         jpn1.add(lab1);
         jpn1.add(lab2);
         jpn1.add(lab3);
         jpn1.add(jtf1);
         jpn1.add(btn1);
         jpn1.add(btn2);
         jpn1.add(btn3);

         cp.add(jsp,BorderLayout.WEST);
         jsp.setPreferredSize(new Dimension(50,this.getHeight()));

         jpn3.add(jtf2,BorderLayout.CENTER);
         jpn3.add(btn4,BorderLayout.EAST);

        for(int i=0;i<9;i++){
            btn[i]= new JButton();
            jpn2 .add(btn[i])
        }

    }
}
