import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.ref.PhantomReference;

public class Gui3 extends JFrame {
    private JComboBox box;
    private JLabel label;
    private static String[] filename={"1.png","2.png"};
    private Icon[] pics={new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

    public Gui3(){
        super("my Window Title");
        setLayout(new FlowLayout());

        //parameter array som option, put all options in the array
        box= new JComboBox(filename);
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //what item did u select
                if (e.getStateChange()==ItemEvent.SELECTED){
                    //change the label to that icon
                    label.setIcon(pics[box.getSelectedIndex()]);
                }
            }
        });
        add(box);
        label= new JLabel(pics[0]);
        add(label);
    }
}
