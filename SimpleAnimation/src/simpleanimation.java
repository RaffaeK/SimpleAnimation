import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SimpleAnimation extends JPanel implements ActionListener 
{
	Timer tm = new Timer(5, this);
	int x = 0, velX = 2;
	
	public void paintCompoment(Graphics g) { 	
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(x, 30, 50, 30);
		
		tm.start();
		System.out.println("Halla");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		x = x + velX;
		repaint();
	}

	
	public static void main(String[] args)
	{
		SimpleAnimation sa = new SimpleAnimation();
		JFrame jf= new JFrame();
		jf.setTitle("Simple Animation");
		jf.setSize(600, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(sa);
		
	}
}
	


