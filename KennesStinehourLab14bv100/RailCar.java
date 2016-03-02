// RailCar.java
// This is the <RailCar> class that is the 
// super class for other train classes.
// Used for KennesStinehourLab14bv100.java



import java.awt.*;


public class RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public RailCar(Color cC, int xP, int yP)
	{
		carColor = cC;
		xPos = xP;
		yPos = yP;
	}

	public void drawCar(Graphics g)
	{
      drawContainer(g);
      drawRailWheels(g);
      drawLink(g);
	}
   
   private void drawContainer(Graphics g)
   {
   	g.setColor(carColor);
   	g.fillRect(xPos,yPos,150,100);
   }
   
   private void drawRailWheels(Graphics g)
   {
   	g.setColor(Color.black);
		g.fillOval(xPos+5,yPos+75,50,50);
		g.fillOval(xPos+95,yPos+75,50,50);  
	}
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.black);
      g.fillRect(xPos-25,yPos+80,25,5);
   } 
}

