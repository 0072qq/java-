import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
public class ballgame2 extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image ball = Toolkit.getDefaultToolkit().getImage("img/ball.jpg");
	Image desk =Toolkit.getDefaultToolkit().getImage("img/fail.jpg");

	double x=40;
	double y=250;
	double degree=3.14/3;
	//画窗口的方法
	public void paint(Graphics g){
		System.out.println("窗口被画了一次");
		g.drawImage(desk,1,1,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);
		
		if(y>500 || y<40){
			degree= -degree;
		}
		if(x>760 || x<40){
			degree=3.14 -degree;
		}
	}
		
		
	
	
	void launchFrame(){
		setSize(856,580);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口
		while(true){
			repaint();
			try{
				Thread.sleep(40);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args){
		ballgame2 game=new ballgame2();
		game.launchFrame();
	}
}