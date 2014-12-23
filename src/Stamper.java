
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Stamper {

	public static void main(String[] args) {
		
		RepaintListener listener = new RepaintListener(); 
			
		Canvas canvasPanel = new Canvas();
		canvasPanel.setBackground(Color.WHITE);
		
		canvasPanel.addMouseListener(listener);
		canvasPanel.addMouseMotionListener(listener);
		
		JFrame mainWindow = new JFrame("Nesto sta ja znam");
		
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(800, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		

	}
	public static class Canvas extends JPanel{
		
		@Override
		public void paintComponent(Graphics g){
			int colorPickerSize = 30;
			
			g.setColor(Color.RED);
			g.fillRect(colorPickerSize*0, getHeight()-colorPickerSize, colorPickerSize, colorPickerSize);
			
			g.setColor(Color.GREEN);
			g.fillRect(colorPickerSize*1, getHeight()-colorPickerSize, colorPickerSize, colorPickerSize);
			
			g.setColor(Color.BLUE);
			g.fillRect(colorPickerSize*2, getHeight()-colorPickerSize, colorPickerSize, colorPickerSize);
			
		}
	}
	
	public static class RepaintListener implements MouseListener, MouseMotionListener{

		private Color selectedColor = Color.RED;
		@Override
		public void mouseClicked(MouseEvent e) {
			/*Component source = (Component) (e.getSource());
			Graphics g = source.getGraphics();
			g.setColor(new Color((float)Math.random(), (float)Math.random(),(float)Math.random(), (float)Math.random()));
			g.fillOval(e.getX()-25, e.getY()-25, 100, 100);
			*/
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Component source = (Component) (e.getSource());
			Graphics g = source.getGraphics();
			int colorPickerSize = 30;
			if(e.getY() < source.getHeight() - colorPickerSize) {
				if(e.getX() < colorPickerSize) {
					selectedColor = Color.RED;
				}else if( e.getX() < colorPickerSize * 2 ) {
					selectedColor = Color.GREEN;
				} else if(e.getX() < colorPickerSize * 3) {
					selectedColor = Color.BLUE;
				}
			}
			
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

		@Override
		public void mouseDragged(MouseEvent e) {
			Component source = (Component) (e.getSource());
			Graphics g = source.getGraphics();
			g.setColor(selectedColor);
			
			int ovalDiameter = 10;
			g.fillOval(e.getX() - ovalDiameter / 2, e.getY() - ovalDiameter / 2, ovalDiameter, ovalDiameter);
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
			
		}
		
	}
	
	
	}



