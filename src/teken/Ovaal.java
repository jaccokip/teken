package teken;

import java.awt.Graphics;

public class Ovaal extends Figuur {
	
	   public void draw(Graphics g) { 
	      g.drawOval(x1, y1, x2-x1, y2-y1);
	 }
}