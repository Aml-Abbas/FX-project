import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JframEx2 extends JFrame {
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField password;
    private JCheckBox box1;
    private JCheckBox box2;

    public JframEx2(){
    super("the title");
    setLayout(new FlowLayout());

    // default value av 10
    item1= new JTextField(10);
    item1.setFont(new Font("Serif",Font.PLAIN, 14));

    // give u a default text
    item2= new JTextField("enter text here",10);
    item3= new JTextField("uneditable", 20);
    item3.setEditable(false);

    add(item1);
    add(item2);
    add(item3);

    password= new JPasswordField("my password",20);
    add(password);

    box1= new JCheckBox("bold");
    box2= new JCheckBox("italic");
    add(box1);
    add(box2);
        // wait to do somethinf
        // when the user enter text and click enter
    TheHandler handler= new TheHandler();

    item1.addActionListener(handler);
    item2.addActionListener(handler);
    item3.addActionListener(handler);
    password.addActionListener(handler);
    HandlerClass handlerClass= new HandlerClass();
    box1.addItemListener(handlerClass);
    box2.addItemListener(handlerClass);
    }

    private class HandlerClass implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font= null;
            if(box1.isSelected()&&box2.isSelected()){
                font= new Font("Serif", Font.BOLD+Font.ITALIC,14);
            }else if (box1.isSelected()){
                font= new Font("Serif", Font.BOLD,14);
            }else if (box2.isSelected()){
                font= new Font("Serif", Font.ITALIC,14);
            } else {
                    font= new Font("Serif", Font.PLAIN,14);
            }
            item1.setFont(font);
        }
    }

    private  class TheHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s= "";
            if (e.getSource()==item1){
                s= String.format("field 1: %s", e.getActionCommand());
            }
            else if (e.getSource()==item2){
                s= String.format("field 2: %s", e.getActionCommand());
            }
            else if (e.getSource()==item3){
                s= String.format("field 3: %s", e.getActionCommand());
            }
            else if (e.getSource()==password){
                s= String.format("password fiels is: %s", e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null,s);
        }
    }
}
