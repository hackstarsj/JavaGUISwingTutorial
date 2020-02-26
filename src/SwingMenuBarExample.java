import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMenuBarExample {
    public static void main(String args[]){
        System.out.println("Menu Bar Example");

        JFrame jFrame=new JFrame("Menu Bar Example");

        JPanel jPanel=new JPanel();
        BoxLayout boxLayout=new BoxLayout(jPanel,BoxLayout.Y_AXIS);
        EmptyBorder emptyBorder=new EmptyBorder(20,20,20,20);
        jPanel.setBorder(emptyBorder);
        jPanel.setLayout(boxLayout);
        jFrame.add(jPanel);

        JLabel simpleLabel=new JLabel("Menu Bar Example");
        jPanel.add(simpleLabel);

        //Menu Bar Code
        JMenuBar jMenuBar=new JMenuBar();

        //Menu
        JMenu menu1=new JMenu("File");
        //Menu Item
        JMenuItem open=new JMenuItem("Open");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem close=new JMenuItem("Close");


        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Open");
            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Close");
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Save");
            }
        });

        menu1.add(open);
        menu1.add(close);
        menu1.add(save);


        //Menu
        JMenu editment=new JMenu("Edit");
        //Menu Item
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");

        //Submenu
        JMenu more=new JMenu("More");
        JMenuItem select=new JMenuItem("Select");
        JMenuItem select_all=new JMenuItem("Select All");

        more.add(select);
        more.add(select_all);

        editment.add(cut);
        editment.add(copy);
        editment.add(paste);
        editment.add(more);

        jMenuBar.add(menu1);
        jMenuBar.add(editment);


        //Setting into jframe
        jFrame.setJMenuBar(jMenuBar);
        //End menu Bar code

        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
