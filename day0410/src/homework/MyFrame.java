package homework;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class GraphicObject {

	BufferedImage img = null;
	int x = 0, y = 0;

	public GraphicObject(String name) {

		try {

			img = ImageIO.read(new File(name));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public void update() {
	}

	public void draw(Graphics g) {

		g.drawImage(img, x, y, null);
	}

	public void keyPressed(KeyEvent event) {
	}

}

class Missile extends GraphicObject {

	boolean launched = false;

	public Missile(String name) {
		super(name);
		y = -200;
	}

	public void update() {
		if (launched)
			y -= 25;
		if (y < -100)
			launched = false;
	}

	public void keyPressed(KeyEvent event, int x, int y) {

		if (event.getKeyCode() == KeyEvent.VK_SPACE) {
			launched = true;
			this.x = x;
			this.y = y;
		}
	}
}

class Enermy extends GraphicObject {
	int dx = -10;

	boolean isAlive = true;

	public Enermy(String name) {

		super(name);
		x = 500;
		y = 0;
	}

	public void update() {
		if (isAlive) {
			x += dx;

			Random ran = new Random();

			if (x < ran.nextInt(500))
				dx = +10;
			if (x > ran.nextInt(500))
				dx = -10;

		} else {
			x = -200;
			y = -200;
		}
	}

}

class SpaceShip extends GraphicObject {

	public SpaceShip(String name) {
		super(name);
		x = 150;
		y = 350;
	}

	public void keyPressed(KeyEvent event) {

		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}

}

class MyPanel extends JPanel implements KeyListener {

	Enermy enermy;
	SpaceShip SpaceShip;
	Missile missile;

	public MyPanel() {

		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		enermy = new Enermy("img/a02.png");
		SpaceShip = new SpaceShip("img/a01.png");
		missile = new Missile("img/a03.png");

		class MyThread extends Thread {

			public void run() {

				while (true) {

					enermy.update();
					SpaceShip.update();
					missile.update();
					repaint();

					Rectangle r = new Rectangle(enermy.x, enermy.y, enermy.img.getWidth(), enermy.img.getHeight());

					if (r.contains(missile.x, missile.y)) {

						enermy.isAlive = false;
						repaint();

						enermy = new Enermy("img/a02.png");
					}

					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}

			}

		}

		MyThread t = new MyThread();
		t.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		enermy.draw(g);
		SpaceShip.draw(g);
		missile.draw(g);
	}

	public void keyPressed(KeyEvent event) {

		SpaceShip.keyPressed(event);
		missile.keyPressed(event, SpaceShip.x, SpaceShip.y);
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}
}

public class MyFrame extends JFrame {

	public MyFrame() {

		setTitle("My game");
		add(new MyPanel());
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MyFrame();
	}

}
