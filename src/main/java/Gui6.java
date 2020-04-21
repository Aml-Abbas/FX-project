import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Gui6 extends JFrame {
    private JPanel mousePanel;
    private JLabel statusBar;

    public Gui6() {
        super("the title");

        mousePanel= new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar= new JLabel("default");
        add(statusBar,BorderLayout.SOUTH);
        Handler handler= new Handler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);

    }
    private class Handler implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at %d, %d",e.getX(),e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText("pressed the button");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText("release the button");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText("enter the area");
            mousePanel.setBackground(Color.PINK);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("exit the area");
            mousePanel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText("dragging the mouse");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText("move the mouse");
        }
    }


}
