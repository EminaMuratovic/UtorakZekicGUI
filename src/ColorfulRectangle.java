import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorfulRectangle {

	public static void main(String[] args) {
		Canvas canvasPanel = new Canvas();
		RepaintListener listener = new RepaintListener(); 
			
		canvasPanel.addMouseListener(listener);
		JFrame mainWindow = new JFrame("Sareni pravougaonik");
		
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(800, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		

	}
	public static class RepaintListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component) (e.getSource());
			source.repaint();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static class Canvas extends JPanel{
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);

			g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
			g.fillRect(10, 10, getWidth()-20, getHeight()-20);
			
			
		}
	}
}
