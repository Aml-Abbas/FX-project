import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui7 extends JFrame {
    private String details;
    private JLabel statusBar;

    public Gui7(){
        super("title");
        statusBar= new JLabel("this is default");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());

    }
    private class MouseClass extends MouseAdapter {
        //överride bara metoder som vi vill implementera
        @Override
        public void mouseClicked(MouseEvent e) {
            details= String.format("u clicked %d ", e.getClickCount());
            if (e.isMetaDown()){
                details+="with right mouse button";
            } else if(e.isAltDown()){
                details+=" with center mouse button";
            }else {
                details+="with left mouse button";
            }
            statusBar.setText(details);
        }

    }
}
