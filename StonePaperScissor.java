import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class StonePaperScissor {
	JFrame f;  
	JButton b1,b2,b3;
	JLabel l1,l2,l3,compchoice,yourchoice;  
	String u;
	StonePaperScissor()
	{
		f=new JFrame();//creating instance of JFrame  
		b1=new JButton("Stone");
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
	             u="Stone";
	             result();
	        }  
	    });  
		b2=new JButton("Paper");
		b2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				u="Paper";
				result();
	        }  
	    }); 
		b3=new JButton("Scissor"); 
		b3.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				u="Scissor";
				result();
	        }  
	    }); 
		b1.setBounds(270,300,100, 40);  
		b2.setBounds(170,300,100, 40);  
		b3.setBounds(70,300,100, 40);  		          
		f.add(b1);//adding button in JFrame  
		f.add(b2);//adding button in JFrame  
		f.add(b3);//adding button in JFrame  
		
		 l1=new JLabel("Comp chose");  
		    l1.setBounds(200,70, 100,30);  
		    compchoice=new JLabel("");  
		    compchoice.setBounds(200,100, 100,30);
		    yourchoice=new JLabel("");  
		    l3=new JLabel("You chose");  
		    l3.setBounds(200,150, 100,30);  
		    yourchoice.setBounds(200,180, 100,30); 
		    l2=new JLabel("Result");  
		    l2.setBounds(200,220, 100,30);  
		    f.add(l1); f.add(l2); f.add(l3);f.add(compchoice); f.add(yourchoice);
		f.setSize(500,400);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible
	} 
	
	public void result()
	{
		String[] comp= {"Stone", "Paper", "Scissor"};
		int rnd = new Random().nextInt(comp.length);
		
		compchoice.setText(comp[rnd]);
		yourchoice.setText(u);
		
		if(u.equals(comp[rnd])) {
			l2.setText("Tie");
		}
		else if(u.equals("Stone")) {if(comp[rnd].equals("Paper")) {l2.setText("You lose");} else{l2.setText("You Win");}}
		else if(u.equals("Paper")) {if(comp[rnd].equals("Scissor")) {l2.setText("You lose");} else{l2.setText("You Win");}}
		else if(u.equals("Scissor")) {if(comp[rnd].equals("Stone")) {l2.setText("You lose");} else{l2.setText("You Win");}}
	}
	public static void main(String[] args) {
		new StonePaperScissor();

	}

}
