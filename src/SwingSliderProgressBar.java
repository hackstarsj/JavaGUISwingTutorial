import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SwingSliderProgressBar {
    public static void main(String args[]){
        System.out.println("==================Progressbar and Slider Example======================");

        JFrame jFrame=new JFrame("Progressbar & Slider Example");
        jFrame.setSize(400,400);
        JPanel jPanel=new JPanel();
        jFrame.add(jPanel);

        BoxLayout boxLayout=new BoxLayout(jPanel,BoxLayout.Y_AXIS);
        EmptyBorder emptyBorder=new EmptyBorder(10,10,10,10);
        jPanel.setLayout(boxLayout);
        jPanel.setBorder(emptyBorder);

        JLabel jLabel=new JLabel("Progress Bar and Slider Example");
        jPanel.add(jLabel);

        //Progressbar
        JProgressBar jProgressBar=new JProgressBar();

        //show text progress
        jProgressBar.setStringPainted(true);
        //jProgressBar.setIndeterminate(true);
        jProgressBar.setForeground(Color.GREEN);

        jPanel.add(jProgressBar);


        //Adding Slider
        JSlider jSlider=new JSlider();
        jPanel.add(jSlider);

        //slider listener
        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                jProgressBar.setValue(jSlider.getValue());
                System.out.println("Value of Slider : "+jSlider.getValue());
            }
        });


        //Adding Slider
        JSlider jSlider2=new JSlider();
        jSlider2.setOrientation(JSlider.VERTICAL);
        jPanel.add(jSlider2);

        //Setting Label Value
        jSlider2.setMajorTickSpacing(100);
        jSlider2.setMinorTickSpacing(1);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setPaintTrack(true);
        //Vertical slider listener
        jSlider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("Value of Slider : "+jSlider2.getValue());
            }
        });






        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }
}
