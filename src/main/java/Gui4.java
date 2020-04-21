import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Gui4 extends JFrame {
    private JList list;
    private static String[] colorNames={"black","blue","red","white","green","pink"};
    private static Color[] colors={Color.BLACK,Color.BLUE,Color.RED,Color.WHITE,Color.GREEN,Color.PINK};

    public Gui4(){
        super("my Window Title");
        setLayout(new FlowLayout());

        list= new JList(colorNames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       // add(list);
        add(new JScrollPane(list));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colors[list.getSelectedIndex()]);
            }
        });
    }
}
