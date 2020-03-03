import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTabExample {
    public static void main(String args[]){
        System.out.println("===============Swing TAB Example====================");

        JFrame jFrame=new JFrame("TAB Example");
        jFrame.setSize(400,400);


        //Changing TAB Head Padding
        UIManager.put("TabbedPane.tabInsets",new Insets(25,25,25,25));
        //Changing Active Tab Color
        UIManager.put("TabbedPane.selected",Color.ORANGE);
        JTabbedPane tabbedPane=new JTabbedPane();

        //First Tab Item
        JPanel firstpanel=new JPanel();
        GridLayout gridLayout=new GridLayout(2,1);
        firstpanel.setLayout(gridLayout);
        //Adding Item in First Tab
        JTextArea jTextArea=new JTextArea();
        firstpanel.add(jTextArea);
        JButton submit=new JButton("Show Data");
        firstpanel.add(submit);


        //Second Tab Item
        JPanel secondPanel=new JPanel();
        GridLayout gridLayout2=new GridLayout(2,1);
        secondPanel.setLayout(gridLayout2);
        JTextArea jTextArea2=new JTextArea();
        secondPanel.add(jTextArea2);
        JButton submit2=new JButton("Show Data");
        secondPanel.add(submit2);



        //Third Tab Item
        JPanel thirdPanel=new JPanel();
        GridLayout gridLayout3=new GridLayout(2,1);
        thirdPanel.setLayout(gridLayout3);
        JTextArea jTextArea3=new JTextArea();
        thirdPanel.add(jTextArea3);
        JButton submit3=new JButton("Show Data");
        thirdPanel.add(submit3);

        submit3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Tab 3 Value is : "+jTextArea3.getText());
            }
        });

        submit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Tab 2 Value is : "+jTextArea2.getText());
            }
        });

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Tab 1 Value is : "+jTextArea.getText());
            }
        });


        //TAB With ICON
        ImageIcon imageIcon=new ImageIcon("whatsapp_icon.png");
        tabbedPane.addTab("First",imageIcon,firstpanel,"Tooltip Text");


        tabbedPane.add("Second",secondPanel);
        tabbedPane.add("Third",thirdPanel);

        //Changing Tab Header to Left
        //tabbedPane.setTabPlacement(SwingConstants.LEFT);

        //Changing Tab Header to Right
        //tabbedPane.setTabPlacement(SwingConstants.RIGHT);

        //Changing Tab Header to Bottom


        //Changing  all Color of Tab Header
        tabbedPane.setBackground(Color.WHITE);
        tabbedPane.setForeground(Color.BLACK);


        //Setting Custom Tab Header
        JPanel tabheader=new JPanel();
        BoxLayout boxLayout=new BoxLayout(tabheader,BoxLayout.X_AXIS);
        tabheader.setLayout(boxLayout);
        tabheader.setBackground(Color.WHITE);
        JLabel jLabel=new JLabel("Text ");
        jLabel.setBackground(Color.WHITE);
        jLabel.setForeground(Color.BLACK);
        jLabel.setOpaque(true);
        JButton button=new JButton(" X ");
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setBorder(new EmptyBorder(3,3,3,3));
        tabheader.add(jLabel);
        tabheader.add(button);

        tabbedPane.setTabComponentAt(1,tabheader);




        //Setting Default Active Tab
        tabbedPane.setSelectedIndex(2);

        //tabbedPane.setTabPlacement(SwingConstants.BOTTOM);

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("Active Tab Position : "+tabbedPane.getSelectedIndex());



                //Reseting all Tab Color
                for(int i=0;i<tabbedPane.getTabCount();i++){
                    tabbedPane.setBackgroundAt(i,Color.WHITE);
                    tabbedPane.setForegroundAt(i,Color.BLACK);
                }

                int pos=tabbedPane.getSelectedIndex();
                tabbedPane.setForegroundAt(pos,Color.WHITE);
                if(pos==1){
                    jLabel.setBackground(Color.ORANGE);
                    tabheader.setBackground(Color.ORANGE);
                    button.setBackground(Color.ORANGE);
                }
                else {
                    jLabel.setBackground(Color.WHITE);
                    tabheader.setBackground(Color.WHITE);
                    button.setBackground(Color.WHITE);
                }

            }
        });

        jFrame.add(tabbedPane);
        jFrame.setVisible(true);

    }
}
