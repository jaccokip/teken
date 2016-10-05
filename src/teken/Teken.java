package teken;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Teken extends JFrame implements MouseListener {
	
	//int x1, y1, x2, y2;
	
	List<Figuur> figuren = new ArrayList<>();
	
	//Rechthoek figuur = new Rechthoek();
	Figuur figuur = new Ovaal();
	
	public Teken() {
		// TODO Auto-generated constructor stub
		addMouseListener(this);
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		for (Figuur figuurItem : figuren) {
			figuurItem.draw(g);
		}
	//	g.drawRect(x1, y1, x2, y2);
	}

	public static void main(String[] args) {
		
		Teken teken = new Teken();
		teken.setSize(500, 500);
		teken.setVisible(true);
		teken.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		
		if (event.getButton() == MouseEvent.BUTTON3) {
				figuur = new Rechthoek();
				figuur.x1 = event.getX();
				figuur.y1 = event.getY();
		} else {
		       figuur = new Lijn();
				figuur.x1 = event.getX();
				figuur.y1 = event.getY();
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// TODO Auto-generated method stub
		
		figuur.x2 = event.getX();
		figuur.y2 = event.getY();
		repaint();
		figuren.add(figuur);
		
	}

}
