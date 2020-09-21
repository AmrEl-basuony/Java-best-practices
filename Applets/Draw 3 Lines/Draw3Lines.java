import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Draw3Lines extends Applet implements MouseMotionListener, MouseListener,Runnable {
    private Point startPoint, endPoint;
    private int lineNum=0;
    Thread t;
     Point[] sPointArr=new Point[3];
     Point[] ePointArr=new Point[3];
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
                for(int i=0;i<3;i++){
                    g.drawLine(sPointArr[i].x, sPointArr[i].y, ePointArr[i].x, ePointArr[i].y);   
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
    public void mouseDragged(MouseEvent e){
        endPoint = e.getPoint();
    }
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        startPoint = e.getPoint();
        endPoint = e.getPoint();
        repaint();
    }
    public void mouseReleased(MouseEvent e){
        if(lineNum==0){
            sPointArr[0]=startPoint;
            ePointArr[0]=endPoint;
            lineNum++;
        }else if(lineNum==1){
            sPointArr[1]=startPoint;
            ePointArr[1]=endPoint;
            lineNum++;
        }else if(lineNum==2){
            sPointArr[2]=startPoint;
            ePointArr[2]=endPoint;
            lineNum=0;
        }
        repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}