package assignments.assignment1.basic;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.event.MouseInputAdapter;

public class SequenceTile extends JComponent {

	private static final long serialVersionUID = 2516851011912978902L;
	private String val;
	private int width;
	private int height;
	private int arc;
	private int index;
	private OrderingGameBoard board;
	private Color color;
	
	public SequenceTile(int val, int x, int y, int width, int height, int arc, Color color, OrderingGameBoard board, int index) {
		this.val = val+"";
		this.width = width;
		this.height = height;
		this.arc = arc;
		this.color = color;
		this.board = board;

		// this determines where the tile is drawn
		this.setBounds(x,y,width,height);
		this.index = index;
		
		// add a behavior to the tile when clicked
		addMouseListeners();
	}
	
	public void paintComponent(final Graphics g) {
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		super.paintComponent(g);
		g.setColor(color);
		g.fillRoundRect(0,0,width,height,arc,arc);
		g.fillRect(20,5,330,25);
		g.setColor(Color.WHITE);
		g.setFont(new Font("SansSerif", Font.PLAIN, Math.min(width,  height)/2));
        g.drawString(val,width/2-g.getFontMetrics().stringWidth(val)/2,2*height/3);
	}
	
	// adds a behavior to the tile when an event occurs
	public void addMouseListeners() {
		
		// add a listener for when a mouse is clicked, which listens for an event to
		// happen before executing some code
		this.addMouseListener(new MouseInputAdapter() {
			@Override
			// we use mouseReleased event because it is more accurate in detecting mouse clicks
			public void mouseReleased(MouseEvent e) {
				// if the clicked tile is a valid move, then remove the tile and redraw the board
				if (board.game.isValidIndex(index)){
					board.game.remove(index);
					board.repaint();
				}
			}
		});
	}
	
}
