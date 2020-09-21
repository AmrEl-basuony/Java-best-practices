import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import java.awt.Point;

public class DrawLines extends Applet implements MouseMotionListener, MouseListener,Runnable {
    private Point startPoint, endPoint;
    Thread t;
    Vector<Integer> svx=new Vector<Integer>();
    Vector<Integer> svy=new Vector<Integer>();
    Vector<Integer> evx=new Vector<Integer>();
    Vector<Integer> evy=new Vector<Integer>();
    public void init(){    
        this.addMouseMotionListener(this);
        addMouseListener(this);
    }
    public void start(){
        t = new Thread(this);
        t.start();
    }
    public void paint(Graphics g){
        if (startPoint != null && endPoint != null){
            try{
                for(int i=0;i<svx.size();i++){
                    g.drawLine(svx.get(i),svy.get(i), evx.get(i),evy.get(i));  
                }
            }catch(java.lang.NullPointerException ex){
                ex.printStackTrace();
            }
        }
    }
    public void run(){
        try{
                Thread.sleep(100);
            }catch(Exception ex){
                ex.printStackTrace();
            }
    }
    public void mouseDragged(MouseEvent e){endPoint = e.getPoint();}
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        startPoint = e.getPoint();
        endPoint = e.getPoint();
        svx.add(startPoint.x);
        svy.add(startPoint.y);
        repaint();
    }
    public void mouseReleased(MouseEvent e){
        svx.add(endPoint.x);
        evy.add(endPoint.y);
        repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}