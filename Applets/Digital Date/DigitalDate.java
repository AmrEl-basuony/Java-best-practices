import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class DigitalDate extends java.applet.Applet implements Runnable{
	Thread th;
	Date date = new Date();
	public void init(){
		th=new Thread(this);
		th.start();
	}
	public void paint(Graphics g) {
		g.drawString(date.toString(),getWidth()/2,getHeight()/2);
	}
	public void run(){
		while(true){
			repaint();
			date = new Date();
			try{
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}