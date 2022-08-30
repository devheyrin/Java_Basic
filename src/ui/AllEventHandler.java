package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

class AllEventHandler
          implements ActionListener, ComponentListener, MouseMotionListener, 
           MouseListener, MouseWheelListener, KeyListener, TextListener, 
           FocusListener, ItemListener,  AdjustmentListener, WindowListener, 
           WindowFocusListener, WindowStateListener, ContainerListener 
{
	// ActionListener의 메서드
	public void actionPerformed(ActionEvent ae) {}

	// ComponentListener의 메서드
	public void componentMoved(ComponentEvent ae) {}
	public void componentHidden(ComponentEvent ae) {}
	public void componentResized(ComponentEvent ae) {}
	public void componentShown(ComponentEvent ae) {}

	// MouseMotionListener의 메서드
	public void mouseDragged(MouseEvent me) {}
	public void mouseMoved(MouseEvent me) {}

	// MouseListener의 메서드
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	public void mouseClicked(MouseEvent me) {}

	// MouseWheelListener의 메서드
	public void mouseWheelMoved(MouseWheelEvent e) {}
	
	// KeyListener의 메서드
	public void keyPressed(KeyEvent ke) {}
	public void keyReleased(KeyEvent ke) {}
	public void keyTyped(KeyEvent ke) {}
	
	// TextListener의 메서드
	public void textValueChanged(TextEvent te) {}
	
	// FocusListener의 메서드
	public void focusGained(FocusEvent fe) {}
	public void focusLost(FocusEvent fe) {}
	
	// ItemListener의 메서드
	public void itemStateChanged(ItemEvent ie) {}
	
	// AdjustmentListener의 메서드
	public void adjustmentValueChanged(AdjustmentEvent ae) {}
	
	// WindowListener의 메서드
	public void windowClosing(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowActivated(WindowEvent we) {}
	public void windowDeactivated(WindowEvent we) {}
	
	// WindowFocusListener의 메서드
	public void windowGainedFocus(WindowEvent e) {}
	public void windowLostFocus(WindowEvent e) {}
	
	// WindowStateListener의 메서드
	public void windowStateChanged(WindowEvent e) {}
	
	// ContainerListener의 메서드
	public void componentAdded(ContainerEvent ce) {}
	public void componentRemoved(ContainerEvent ce) {}
} // End of EventHandler class