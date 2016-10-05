package teken;

import java.awt.Graphics;

public class Rechthoek extends Figuur {
	
	public void draw(Graphics g) {
		
		g.drawRect(x1, y1, x2-x1, y2-y1);

	}

}
