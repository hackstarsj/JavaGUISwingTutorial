import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainGUIProgram {
    public static void main(String args[]){
        System.out.println("===============JAVA SWING GUI PROGRAM====================");

        JFrame jFrame=new JFrame("Java GUI SWING PROGRAM");

        JPanel jPanel=new JPanel();

        BoxLayout flowLayout=new BoxLayout(jPanel,BoxLayout.Y_AXIS);
        jPanel.setLayout(flowLayout);
        jFrame.add(jPanel);

        jFrame.setSize(400,300);

//        Font Object
        Font font=new Font("serif",Font.BOLD,20);

        //Empty Border Object
        EmptyBorder emptyBorder=new EmptyBorder(5,5,5,5);
        //Line Border Object
        LineBorder lineBorder=new LineBorder(Color.RED,5);
        //Compound Border
        CompoundBorder compoundBorder=new CompoundBorder(lineBorder,emptyBorder);



        JButton flowLayoutButton=new JButton("Show Flow Layout Example");
        flowLayoutButton.setBackground(Color.BLACK);
        flowLayoutButton.setForeground(Color.WHITE);
        flowLayoutButton.setFocusPainted(false);
        flowLayoutButton.setBorder(compoundBorder);
        flowLayoutButton.setFont(font);
        flowLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FlowLayoutFrame flowLayoutFrame=new FlowLayoutFrame("Flow Layout Frame Example");
                flowLayoutFrame.setVisible(true);
            }
        });
        jPanel.add(flowLayoutButton);

        JButton gridlayoutbutton=new JButton("Show Grid Layout Example");
        gridlayoutbutton.setBackground(Color.BLACK);
        gridlayoutbutton.setForeground(Color.WHITE);
        gridlayoutbutton.setFont(font);
        gridlayoutbutton.setFocusPainted(false);
        gridlayoutbutton.setBorder(compoundBorder);
        gridlayoutbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                GridLayoutFrame gridLayoutFrame=new GridLayoutFrame("Grid Layout Example");
                gridLayoutFrame.setVisible(true);
            }
        });
        jPanel.add(gridlayoutbutton);


        //Form Button
        JButton formButton=new JButton("Show Form Example");
        formButton.setBackground(Color.BLACK);
        formButton.setForeground(Color.WHITE);
        formButton.setFont(font);
        formButton.setFocusPainted(false);
        formButton.setBorder(compoundBorder);
        formButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                GUIFormExampleWindow formwindow=new GUIFormExampleWindow();
                formwindow.setVisible(true);
            }
        });
        jPanel.add(formButton);


        //Progress Slider Button
        JButton progressslider=new JButton("Show Progress and Slider Example");
        progressslider.setBackground(Color.BLACK);
        progressslider.setForeground(Color.WHITE);
        progressslider.setFont(font);
        progressslider.setFocusPainted(false);
        progressslider.setBorder(compoundBorder);
        progressslider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ProgressBarSliderWindow progressBarSliderWindow=new ProgressBarSliderWindow();
                progressBarSliderWindow.setVisible(true);
            }
        });
        jPanel.add(progressslider);


        //Table Slider Button
        JButton tablebutton=new JButton("Show Table Example");
        tablebutton.setBackground(Color.BLACK);
        tablebutton.setForeground(Color.WHITE);
        tablebutton.setFont(font);
        tablebutton.setFocusPainted(false);
        tablebutton.setBorder(compoundBorder);
        tablebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SwingTableFrame swingTableFrame=new SwingTableFrame();
                swingTableFrame.setVisible(true);
            }
        });
        jPanel.add(tablebutton);

        //Tab Button
        JButton tabbutton=new JButton("Show Tab Example");
        tabbutton.setBackground(Color.BLACK);
        tabbutton.setForeground(Color.WHITE);
        tabbutton.setFont(font);
        tabbutton.setFocusPainted(false);
        tabbutton.setBorder(compoundBorder);
        tabbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SwingTabFrame swingTabFrame=new SwingTabFrame();
                swingTabFrame.setVisible(true);
            }
        });
        jPanel.add(tabbutton);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
