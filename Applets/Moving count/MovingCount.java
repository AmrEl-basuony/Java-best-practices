import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovingCount extends Applet {
	private int count = 0;
	private int xChange;
	private int yChange;
	private int xPos;
	private int yPos;
	public void init(){
		xPos=getWidth()/2;
		yPos=getHeight()/2;
		Button inCounter = new Button("Increament");
		Button deCounter = new Button("Decreament");
		ActionListener inListener=new MyListener();
		ActionListener deListener=new MyListener();
		inCounter.addActionListener(inListener);
		deCounter.addActionListener(deListener);
		this.addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent ke){}
			public void keyPressed(KeyEvent ke){
				if (ke.getKeyCode() == KeyEvent.VK_UP)
				{
					yPos -= 10;
					
				}
				System.out.println("yay");
				repaint();
			}
			public void keyReleased(KeyEvent ke){
				
			}
		});
		//add(inCounter);
		//add(deCounter);	
		//KeyListener key = new MyListener();
		
	}
	public void paint(Graphics g) {
		g.drawString("Your Number is " + count,xPos,yPos);
		//xPos = xPos + xChange;
	}
	class MyListener implements ActionListener ,KeyListener{
		public void actionPerformed(ActionEvent ae){
			String s = ae.getActionCommand();
			if(s.equals("Increament")){
				count++;
			}
			else if(s.equals("Decreament")){
				count--;
			}	
			repaint();
		}
		public void keyTyped(KeyEvent ke){}
		public void keyPressed(KeyEvent ke){
			if (ke.getKeyCode() == KeyEvent.VK_UP)
			{
				yPos += 100;
				
			}
			System.out.println("yay");
			repaint();
		}
		public void keyReleased(KeyEvent ke){
			
		}
	}
}