import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class okno extends JFrame {
    private int count = 0;
    private int count1 = 1;
    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("���� ���?");
    private JLabel metkaDva = new JLabel("");
        class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();
            if(button instanceof JButton){
                count++;
                ((JButton)button).setText("������ " + count + " ���");
            }
        }
    }
 
    public okno(String title)
      {
        super(title);
        SozdatxOkno();
      }
 
    private void SozdatxOkno(){
        
    	JButton button = new JButton(" ����� ����! ");
	JButton button1 = new JButton(" Change size");
        button.setBounds(65,60,150,40);
        button1.setBounds(65,120,150,40);
        button.addActionListener(new PushingListener());
	button1.addActionListener(new ActionListener()
{     public void actionPerformed(ActionEvent e)
        { 
	if(count1 % 2 != 0)
	{
        setSize(500, 500);
	count1++;
}
        }
});
        
        metka.setBounds(15,15,95,30);
        metkaDva.setBounds(15,115,200,30);
        
        fio.setBounds(120, 15, 100, 30);
        
        getContentPane().setLayout(null);
        getContentPane().add(button);
	getContentPane().add(button1);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(fio);
        
        setLocationRelativeTo(null);
      }
}