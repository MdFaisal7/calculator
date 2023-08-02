package calculator_pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class cal implements ActionListener {
	JTextField t1,t2,t3;
	void window()
	{
		JFrame jf=new JFrame();
		jf.setTitle("CALCULATOR");
		jf.setSize(600, 400);
		
		JLabel j1=new JLabel("1St Number: ");
				j1.setBounds(100, 100, 100, 20);
				jf.add(j1);

				t1=new JTextField();
				t1.setBounds(225, 100,80, 20);
				jf.add(t1);
				
				JLabel j2=new JLabel("2nd Number: ");
				j2.setBounds(100, 150, 100, 20);
				jf.add(j2);
				
				t2=new JTextField();
				t2.setBounds(225, 150,80, 20);
				jf.add(t2);
				
				JLabel j3=new JLabel("Result: ");
				j3.setBounds(100, 250, 100, 20);
				jf.add(j3);

				t3=new JTextField();
				t3.setBounds(220, 250,80, 20);
				jf.add(t3);
				
				
				JButton jb1= new JButton("+");
				  jb1.setBounds(125,200, 50, 20);
				  jf.add(jb1);
				 jb1.addActionListener(this);
				  
				  JButton jb2= new JButton("-");
				  jb2.setBounds(225,200, 50, 20);
				  jf.add(jb2);
				  jb2.addActionListener(this);
				  
				  JButton jb3= new JButton("*");
				  jb3.setBounds(325,200, 50, 20);
				  jf.add(jb3);
				  jb3.addActionListener(this);
				  
				  JButton jb4= new JButton("/");
				  jb4.setBounds(425,200, 50, 20);
				  jf.add(jb4);
				  jb4.addActionListener(this);
				  
				  
				  JButton jb5= new JButton("Clear");
				  jb5.setBounds(100,325, 70, 35);
				  jf.add(jb5);
				  jb5.addActionListener(this);
				  
				  JButton jb6= new JButton("Exit");
				  jb6.setBounds(200,325, 70, 35);
				  jf.add(jb6);
				  jb6.addActionListener(this);

				  
				  
				  
				  jf.setLayout(null);
				  jf.setVisible(true);
	}
	public static void main (String arg [])
	{
		cal ob2=new cal();
		ob2.window();
	}
	public void actionPerformed(ActionEvent e)
    {
    	//double a,b,c;

		int a =Integer.parseInt(t1.getText());
    	System.out.println(a);
    	
   
    	int b=Integer.parseInt(t2.getText());
    	System.out.println(b);
    	
    	System.out.println(e.getActionCommand());
    	
    	
    	if(e.getActionCommand().equals("+"))
    	{
    		int c=a+b;
    		t3.setText(String.valueOf(c));
    	}
    	
    	else if(e.getActionCommand().equals("-"))
    	{
    		int c=a-b;
    		t3.setText(String.valueOf(c));
    	}
    	
    	else if(e.getActionCommand().equals("*"))
    	{
    		int c=a*b;
    		t3.setText(String.valueOf(c));
    	}
    	
    	else if(e.getActionCommand().equals("/"))
    	{
    		int c=a/b;
    		t3.setText(String.valueOf(c));
    	}
    	else if(e.getActionCommand().equals("Clear"))
    	{
    		t1.setText("");
    		t2.setText("");
    		t3.setText("");
    	}
    	else if(e.getActionCommand().equals("Exit"))
    	{
    		System.exit(0);//exit karne ke liye ek function hain (System.exit(0))
    	}
    }

}
