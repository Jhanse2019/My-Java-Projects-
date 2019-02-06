import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class letsBuild extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 @ Override
 public void paintComponent(Graphics g) {
	 int dx = -0;

//variable
	 
	 g.setColor(new Color(135, 206, 235));
	 //color for sky
	 //Dimensions of sky
	 g.fillRect(0, 0, 400, 400);
	 g.setColor(new Color(49,99,0));
	 //color for grass
	 //dimensions of grass
	 g.fillRect(0, 200-dx, 400, 150-dx);
	 g.setColor(Color.BLACK);
	 //color of castle
	 //dimensions of castle
	 g.fillRect(50, 50+dx+dx, 275, 250);
	 g.setColor(new Color(135,206,235));
	 //color of sky again
	 // dimensions of sky again
	 g.fillRect(125,50+dx,130, 100);
	 g.fillRect(75, 50+dx, 25, 25);
	 g.fillRect(277, 50+dx, 25, 25);
	 g.setColor(Color.BLUE);
	 //color of water
	 //dimensions of water
	 g.fillRect(0, 325, 400, 25);
	 g.setColor(Color.ORANGE);
	 //color of door
	 //dimensions of door
	 g.fillOval(175, 250+dx+dx, 30, 50);
	 //banner
	 g.drawString("Josh's Castle", 150, 200);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame window = new JFrame();
	window.setContentPane(new letsBuild());;
	window.setSize(400, 400);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	//jframe!

	}

}
