package asteroids;

import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ships extends Applet implements Runnable, KeyListener {
	
	 private static final double FPS = 0;

	static final double MISSLE_PROBABILITY = 0.45 / FPS;

	  static final int BIG_POINTS    =  25;     // Points scored for shooting
	  static final int SMALL_POINTS  =  50;     // various objects.
	  static final int UFO_POINTS    = 250;
	  static final int MISSLE_POINTS = 500;

	  // Number of points the must be scored to earn a new ship or to cause the
	  // flying saucer to appear.

	  static final int NEW_SHIP_POINTS = 5000;
	  static final int NEW_UFO_POINTS  = 2750;
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
