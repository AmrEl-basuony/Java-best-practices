import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class BouncingBall extends Applet implements Runnable 
{
	int x = 150, y = 50, r=20;   
	int dx = 11, dy = 7;          
	Thread t;
	boolean stopFlag;
	public void start() 
	{
		t = new Thread(this);
		stopFlag=false; 
		t.start();
	}
	public void paint(Graphics g) 
	{
		g.setColor(Color.RED);
		g.fillOval(x-r, y-r, r*2, r*2);
	}
	public void run() 
	{
		while(true)
		{
			if(stopFlag){
				break;
			}
			if ((x - r + dx < 0) || (x + r + dx > bounds().width)) dx = -dx;
			if ((y - r + dy < 0) || (y + r + dy > bounds().height)) dy = -dy;
			x += dx;  y += dy;
			try
			{
				Thread.sleep(100);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			repaint();
		}
	}
	public void stop()
	{
		stopFlag=true;
		t=null;
	}
}
