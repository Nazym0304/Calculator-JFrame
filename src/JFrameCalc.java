import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JFrameCalc extends JFrame{
	
	double a;
	double b;
	char c;
	calc obj = new calc();
	
	JFrameCalc(){
		setSize(340,370);//super(400,400);
		setBackground(Color.MAGENTA);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		this.setLocationRelativeTo(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(110, 40, 170, 40);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setFont(new Font("Arial", 1, 18));
		tf.setForeground(Color.blue );
		
		JButton C = new JButton("<html><h1>C");
		C.setBackground(new Color(0, 220, 0));
		C.setForeground(Color.white);
		JButton b1 = new JButton("1");
		b1.setBackground(Color.white);
		JButton b2 = new JButton("2");
		b2.setBackground(Color.white);
		JButton b3 = new JButton("3");
		b3.setBackground(Color.white);
		JButton b4 = new JButton("4");
		b4.setBackground(Color.white);
		JButton b5 = new JButton("5");
		b5.setBackground(Color.white);
		JButton b6 = new JButton("6");
		b6.setBackground(Color.white);
		JButton b7 = new JButton("7");
		b7.setBackground(Color.white);
		JButton b8 = new JButton("8");
		b8.setBackground(Color.white);
		JButton b9 = new JButton("9");
		b9.setBackground(Color.white);
		JButton b0 = new JButton("0");
		b0.setBackground(Color.white);
		JButton ac = new JButton("AC");
		ac.setBackground(Color.yellow);
		ac.setForeground(Color.blue);
		
		JButton t = new JButton("."); 
		C.setBounds(50, 40, 50, 40);
		t.setBackground(Color.white);
		b7.setBounds(50, 130, 50, 30);
		b8.setBounds(110, 130, 50, 30);
		b9.setBounds(170, 130, 50, 30);
		b4.setBounds(50, 170, 50, 30);
		b5.setBounds(110, 170, 50, 30);
		b6.setBounds(170, 170, 50, 30);
		b1.setBounds(50, 210, 50, 30);
		b2.setBounds(110, 210, 50, 30);
		b3.setBounds(170, 210, 50, 30);
		b0.setBounds(110, 250, 50, 30);
		ac.setBounds(50, 90, 50, 30);
		t.setBounds(50, 250, 50, 30);	
		
		JButton bolu = new JButton("/");
		bolu.setBackground(Color.yellow);
		bolu.setForeground(Color.blue);
		JButton kobeitu = new JButton("*");
		kobeitu.setBackground(Color.yellow);
		kobeitu.setForeground(Color.blue);
		JButton minus = new JButton("-");
		minus.setBackground(Color.yellow);
		minus.setForeground(Color.blue);
		JButton plus = new JButton("+");
		plus.setBackground(Color.yellow);
		plus.setForeground(Color.blue);
		JButton equal = new JButton("=");
		//equal.setBackground(Color.green);
		JButton percent = new JButton("%");
		percent.setBackground(Color.yellow);
		percent.setForeground(Color.blue);
		JButton kvadrat = new JButton("^2");
		kvadrat.setBackground(Color.yellow);
		kvadrat.setForeground(Color.blue);
		JButton tubir = new JButton("#/");
		tubir.setBackground(Color.yellow);
		tubir.setForeground(Color.blue);
		bolu.setBounds(230, 130, 50, 30);
		kobeitu.setBounds(230, 170, 50, 30);
		plus.setBounds(230, 250, 50, 30);
		minus.setBounds(230, 210, 50, 30);
		equal.setBounds(170, 250, 50, 30);
		equal.setBackground(Color.white);
		percent.setBounds(110, 90, 50, 30);
		kvadrat.setBounds(170, 90, 50, 30);
		tubir.setBounds(230, 90, 50, 30);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"1");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"2");
				
			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"3");
				
			}
			
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"4");
				
			}
			
		});
		
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"5");
				
			}
			
		});
		
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"6");
				
			}
			
		});
		
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"7");
				
			}
			
		});
		
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"8");
				
			}
			
		});
		
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"9");
				
			}
			
		});
		
		b0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"0");
				
			}
			
		});
		
		t.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(tf.getText().length()<10) {
						tf.setText(tf.getText()+"."); }
					else if (tf.getText().isEmpty()) {
						tf.setText("0.");
					}
					else {
						tf.setText(tf.getText() + ".");
					}
				}
			});
		
		ac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//a = Integer.parseInt(tf.getText());
				String s = tf.getText();
				tf.setText("");
				for(int i=0; i<s.length()-1;i++)
				tf.setText(tf.getText()+s.charAt(i));
				
			}
			  
		  });
		
		C.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//a = Integer.parseInt(tf.getText());
				tf.setText("");	
			}
			  
		  });
		
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tf.getText());
				tf.setText("");
				c = '+';
			}
		});
		
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tf.getText());
				tf.setText("");
				c = '-';	
			}
			
		});
		
		kobeitu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tf.getText());
				tf.setText("");
				c = '*';	
			}
			
		});		
		
		bolu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tf.getText());
				tf.setText("");
				c = '/';	
			}
			
		});
		
	    kvadrat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tf.getText());
				a = Math.pow(a,2);
				tf.setText(""+a);
				c = '^';	
			}
			
		});
		
	    tubir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tf.getText());
				a = Math.sqrt(a);
				tf.setText((""+a).substring(0, 10));
				c = '#';
			}
			
		});
		
	    percent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tf.getText());
				a = a/100;
				tf.setText(""+a);
				c = '%';	
			}
			
		});
		
		equal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b = Double.parseDouble(tf.getText());
				if(b-(int)b == 0)
				    tf.setText((int)b+"");
				
				String s = b+"";
				if(c=='+')
					s = obj.plus(a, b)+"";
				if(c=='-')
					s = (double)obj.minus(a, b)+"";
				if(c=='*')
					s = (double)obj.kobeitu(a, b)+"";
				if(c=='/')
					s = (double)obj.bolu(a, b)+"";
				if(c=='%')
					s = (double)obj.percent(a)+"";
				if(c=='^')
					s = (double)obj.kvadrat(a)+"";
				if(c=='#')
					s = (double)obj.tubir(a)+"";
			
				if(s.length()>10)
					s = s.substring(0, 10);
				
				tf.setText(s);
				c=' ';
				a=0;
				b=0;
				}
		});
		
		add(tf);
		add(C);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(ac);
		add(t);
		
		add(bolu);
		add(kobeitu);
		add(minus);
		add(plus);
		add(equal);
		add(percent);
		add(kvadrat);
		add(tubir);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameCalc();
	}

}
