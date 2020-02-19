import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String args[]){
        System.out.println("=====================Java GUI Tutorial=================");

        JFrame jFrame=new JFrame("Window Title");
        jFrame.setSize(300,300);

        //Adding Layout
        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,10,10);
        jFrame.setLayout(flowLayout);

        //Adding Label into Frame

        for(int i=0;i<20;i++){
            JLabel jLabel=new JLabel("Label "+i);

            //Adding Padding and Border Both
            LineBorder lineBorder=new LineBorder(Color.RED,3);
            EmptyBorder emptyBorder=new EmptyBorder(10,10,10,10);
            jLabel.setBorder(new CompoundBorder(lineBorder,emptyBorder));

            //Setting Background and Foregroud Color
            jLabel.setBackground(Color.WHITE);
            jLabel.setOpaque(true);
            jLabel.setForeground(Color.RED);

            //Setting Font Size and Font
            Font font=new Font("serif",Font.BOLD+Font.ITALIC,20);
            jLabel.setFont(font);


            jFrame.add(jLabel);


        }

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
