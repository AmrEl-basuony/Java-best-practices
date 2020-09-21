import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DraggingBall extends Applet implements Runnable{  
	int dx =100 , dy =100 ;          
	Thread t;
	boolean stopFlag;
	Boolean mouseClick;
    public void init(){
   	MouseListener mouseLis=new Mouse();
   	MouseMotionListener mouseMot=new Mouse();
    this.addMouseListener(mouseLis);
    this.addMouseMotionListener(mouseMot);
    }
	public void start(){
		t = new Thread(this);
		stopFlag=false; 
		t.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(dx, dy, 40, 40);
	}
	public void run(){
			try{
				Thread.sleep(100);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
			repaint();
	}
	class Mouse implements MouseListener, MouseMotionListener{
		 public void mousePressed(MouseEvent e){
	        mouseClick = true;
	    }
	    public void mouseReleased(MouseEvent e){
	    	mouseClick = false;
	    }
	    public void mouseEntered(MouseEvent e){}
	    public void mouseExited(MouseEvent e){}
	    public void mouseMoved(MouseEvent e){}
	    public void mouseClicked(MouseEvent e){}
	    public void mouseDragged(MouseEvent e){
	        if (mouseClick){
	            dx = e.getX();
	            dy = e.getY();
	            repaint();
	        }
	    }
	}
}