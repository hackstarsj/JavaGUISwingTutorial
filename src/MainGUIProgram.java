import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUIProgram {
    public static void main(String args[]){
        System.out.println("===============JAVA SWING GUI PROGRAM====================");

        JFrame jFrame=new JFrame("Java GUI SWING PROGRAM");
        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
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
        jFrame.add(flowLayoutButton);

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
        jFrame.add(gridlayoutbutton);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(flowLayout);
        jFrame.setVisible(true);
    }
}
