import java.util.Vector;

import processing.core.PApplet;
import processing.core.PFont;

public class Game extends PApplet {
	
	private static final long serialVersionUID = 1L;
	
	private Vector<Bubble> bubbles;
	private PFont font;
	private int cont;
	private int userScore;
	
	/**
	 * 
	 */
	@Override
	public void setup() {
		size(800, 600);
		bubbles = new Vector<Bubble>();
		font = createFont("Jokerman", 24);
		textFont(font);
		textAlign(CENTER);
		cont = 0;
		userScore = 0;
		noCursor();
	}
	
	/**
	 * 
	 */
	@Override
	public void draw() {
		background(255);
		
		// Creacion de burbujas
		if(cont == 60) {
			cont = 0;
			float p = random(0, 1);
			if(p >= 0.3) {
				Bubble b = createBubble();
				bubbles.add(b);
			}
		}
		else {
			cont += 1;
		}
		
		//Logica del comportamiento y dibujo de las burbujas
		int n = bubbles.size();
		Bubble b;
		for(int i = 0;i < n;i += 1) {
			b = bubbles.elementAt(i);
			b.setPosX(b.getPosX() + b.getvX());
			b.setPosY(b.getPosY() + b.getvY());
			if(b.getPosX() <= 0 || b.getPosX() >= width) {
				b.togglevX();
			}
			if(b.getPosY() <= 0 || b.getPosY() >= height) {
				b.togglevY();
			}
			fill(b.getrColor(), b.getgColor(), b.getbColor());
			ellipse(b.getPosX(), b.getPosY(), b.getD(), b.getD());
		}
		
		//Dibujo del puntaje
		fill(0);
		text("" + userScore, width / 2, 30);
		
		// Dibujo de la mira
		noFill();
		ellipse(mouseX, mouseY, 30, 30);
		ellipse(mouseX, mouseY, 15, 15);
		line(mouseX - 30, mouseY, mouseX + 30, mouseY);
		line(mouseX, mouseY - 30, mouseX, mouseY + 30);
	}
	
	/**
	 * 
	 */
	@Override
	public void mousePressed() {
		for(int i = 0;i < bubbles.size();i += 1) {
			Bubble b = bubbles.elementAt(i);
			if(mouseX >= b.getPosX() - (b.getD() / 2) && mouseX <= b.getPosX() + (b.getD() / 2)) {
				if(mouseY >= b.getPosY() - (b.getD() / 2) && mouseY <= b.getPosY() + (b.getD() / 2)) {
					userScore += b.getScore();
					bubbles.remove(i);
					i -= 1;
				}
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Bubble createBubble() {
		int posX = (int)random(10, width - 10);
		int posY = (int)random(10, height - 10);
		int type = ((int)random(0, 3)) + 1;
		Bubble b = new Bubble(posX, posY, type);
		return b;
	}

}
