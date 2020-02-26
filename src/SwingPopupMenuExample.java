import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingPopupMenuExample {
    String temp_data="";
    public static void main(String args[]){
        SwingPopupMenuExample swingPopupMenuExample=new SwingPopupMenuExample();
        System.out.println("Popup Menu Example");

        JFrame jFrame=new JFrame("Popup Menu Example");

        JPanel jPanel=new JPanel();
        BoxLayout boxLayout=new BoxLayout(jPanel,BoxLayout.Y_AXIS);
        EmptyBorder emptyBorder=new EmptyBorder(20,20,20,20);
        jPanel.setBorder(emptyBorder);
        jPanel.setLayout(boxLayout);
        jFrame.add(jPanel);

        JTextField simpleinput=new JTextField();
        jPanel.add(simpleinput);

        //Popup menu Code
        JPopupMenu jPopupMenu=new JPopupMenu("Edit");

        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");

        jPopupMenu.add(cut);
        jPopupMenu.add(copy);
        jPopupMenu.add(paste);
        //End Popup Menu Code

        jPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if(SwingUtilities.isRightMouseButton(mouseEvent)){
                    jPopupMenu.show(jPanel,mouseEvent.getX(),mouseEvent.getY());
                }
            }
        });

        //End Popup Code
        //Example Popup menu
        //Popup menu Code
        JPopupMenu jPopupMenu2=new JPopupMenu("Edit");

        JMenuItem cut2=new JMenuItem("Cut");
        JMenuItem copy2=new JMenuItem("Copy");
        JMenuItem paste2=new JMenuItem("Paste");

        jPopupMenu2.add(cut2);
        jPopupMenu2.add(copy2);
        jPopupMenu2.add(paste2);
        //End Popup Menu Code

        simpleinput.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if(SwingUtilities.isRightMouseButton(mouseEvent)){
                    jPopupMenu2.show(simpleinput,mouseEvent.getX(),mouseEvent.getY());
                }
            }
        });

        cut2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                swingPopupMenuExample.temp_data=simpleinput.getText();
                simpleinput.setText("");
            }
        });

        copy2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                swingPopupMenuExample.temp_data=simpleinput.getText();
            }
        });

        paste2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String current_data=simpleinput.getText();
                simpleinput.setText(current_data+""+swingPopupMenuExample.temp_data);
            }
        });
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
