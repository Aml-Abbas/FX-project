import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui5 extends JFrame {
    private JList left;
    private JList right;
    private JButton moveButton;
    private static String[] food={"beacon","wings","ham","beef","more bacon"};

    public Gui5() {
        super("the title");
        setLayout(new FlowLayout());
        left= new JList(food);
        left.setVisibleRowCount(3);
        left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(left));
        moveButton= new JButton("move -->");
        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                right.setListData(left.getSelectedValues());
            }
        });
        add(moveButton);
        right= new JList();
        right.setVisibleRowCount(3);
        right.setFixedCellHeight(30);
        right.setFixedCellWidth(50);
        right.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(right));
    }

}
