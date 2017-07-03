package jishiben;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class lianxi extends JFrame
{
	xmb mb=null;
	public static void main(String[] args) {
	  lianxi a=new lianxi();

	}
	public lianxi()
	{
		mb=new xmb();
		this.setTitle("Á·Ï°");
		this.add(mb);
		this.addKeyListener(mb);
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
class xmb extends JPanel implements KeyListener
{	int x=50,y=50;
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			y++;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			y--;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			x--;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			x++;
		}
		this.repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillRect(x, y, 50,50);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}