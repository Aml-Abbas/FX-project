import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Peach extends JPanel {


    public void paintComponent(Graphics g){
        //call superclass method
        super.paintComponent(g);
        this.setBackground(Color.PINK);
        g.setColor(Color.BLACK);
        g.fillRect(25,25,100,50);
       //draw an emty rec
       // g.drawRect(25,25,100,50);

        g.setColor(new Color(190,81,215));
        g.fillRect(200,400,100,40);

        g.setColor(Color.RED);
        g.drawString("Aml Abbas",50,50);

        g.setColor(Color.CYAN);
        g.drawLine(100,100,200,200);

        g.fillOval(10,90,100,30);

        //last param false or true
        g.fill3DRect(10,160,100,50,true);
    }
}
