import java.applet.Applet;
import java.awt.Graphics;

public class TextPortal extends java.applet.Applet implements Runnable{
	Thread th;
	int x=0;
	public void init(){
		th=new Thread(this);
		th.start();
	}
	public void paint(Graphics g) {
		g.drawString("Weeeee", x,getHeight()/2);
	}
	public void run(){
		while(true){
			repaint();
			x=x+100;
			if(x>=getWidth()){
				x=0;
			}
			try{
				Thread.sleep(100);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}