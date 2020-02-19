import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String args[]){
        System.out.println("====================Java GUI GRIDLayout Example=============");
        JFrame jFrame=new JFrame("Gridlayou Example");
        jFrame.setSize(300,300);

        GridLayout gridLayout=new GridLayout(5,5,10,10);
        jFrame.setLayout(gridLayout);

        for (int i=0;i<20;i++){
            JLabel jLabel=new JLabel("Label "+i);
            jLabel.setHorizontalAlignment(JLabel.CENTER);
            jLabel.setVerticalAlignment(JLabel.CENTER);

            jLabel.setOpaque(true);
            jLabel.setBackground(Color.WHITE);
            jLabel.setForeground(Color.RED);

            jLabel.setBorder(new CompoundBorder(new TitledBorder("Demo Data"),new LineBorder(Color.RED,5)));
            jFrame.add(jLabel);
        }

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
