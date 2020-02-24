import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class GUISwingFormExample {
    public static void main(String args[]){
        System.out.println("======================Java Swing Form Example=================");

        JFrame jFrame=new JFrame("Swing Form Example");
        jFrame.setSize(300,300);

        //Adding Panel With Layout in Default Window
        JPanel jPanel=new JPanel();
        EmptyBorder emptyBorder=new EmptyBorder(10,10,10,10);
        jPanel.setBorder(emptyBorder);
        BoxLayout boxLayout=new BoxLayout(jPanel,BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);
        jFrame.add(jPanel);
        //End panel Code


        //All Input Elements
        JLabel nameLabel=new JLabel("Name : ");
        JTextField nameInput=new JTextField();
        JLabel emailLabel=new JLabel("Email : ");
        JTextField emailInput=new JTextField();
        JLabel passwordLabel=new JLabel("Password : ");
        JPasswordField passwordInput=new JPasswordField();
        JLabel addressLabel=new JLabel("Address : ");
        JTextArea addressInput=new JTextArea();
        //End All input Elements

        //Adding JList Item
        JLabel country=new JLabel("Country");
        String[] countries={"India","US","Africa","Europe","Australia","Pakistan","Sri lanka"};
        JList jList=new JList(countries);
        jList.setAlignmentX(JList.LEFT_ALIGNMENT);
        jList.setSelectedIndex(1);
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                System.out.println("Value and Index : "+jList.getSelectedValue()+" "+jList.getSelectedIndex());
            }
        });
        //End JList Item

        //Check Box Item
        JPanel checkBoxPanel=new JPanel();
        checkBoxPanel.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        BoxLayout horizontalLayout=new BoxLayout(checkBoxPanel,BoxLayout.X_AXIS);
        checkBoxPanel.setLayout(horizontalLayout);

        JLabel label=new JLabel("Skills : ");
        JCheckBox jCheckBox=new JCheckBox("PHP");
        JCheckBox jCheckBox2=new JCheckBox("Java");
        JCheckBox jCheckBox3=new JCheckBox("Python");


        jCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                System.out.println("Is Checked : "+jCheckBox.isSelected());
            }
        });

        jCheckBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                System.out.println("Is Checked : "+jCheckBox2.isSelected());
            }
        });

        jCheckBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                System.out.println("Is Checked : "+jCheckBox3.isSelected());
            }
        });

        checkBoxPanel.add(label);
        checkBoxPanel.add(jCheckBox);
        checkBoxPanel.add(jCheckBox2);
        checkBoxPanel.add(jCheckBox3);
        //End Check Box Item


        //Adding Radio Button
        JPanel agePanel=new JPanel();
        agePanel.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        BoxLayout horizontalLayout2=new BoxLayout(agePanel,BoxLayout.X_AXIS);
        agePanel.setLayout(horizontalLayout2);

        ButtonGroup buttonGroup=new ButtonGroup();

        JLabel jLabel=new JLabel("Sex : ");
        JRadioButton jRadioButton=new JRadioButton("Male");
        JRadioButton jRadioButton1=new JRadioButton("Female");

        jRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                System.out.println("Is male : "+jRadioButton.isSelected());
            }
        });

        jRadioButton1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                System.out.println("Is Female : "+jRadioButton1.isSelected());
            }
        });

        agePanel.add(jLabel);
        agePanel.add(jRadioButton);
        agePanel.add(jRadioButton1);

        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        //End Radio button

        //Dropdown Item Spinner
        JPanel birthDay=new JPanel();
        birthDay.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        BoxLayout boxLayout1=new BoxLayout(birthDay,BoxLayout.X_AXIS);
        birthDay.setLayout(boxLayout1);

        ArrayList<String> day=new ArrayList<>();
        ArrayList<String> month=new ArrayList<>();
        ArrayList<String> year=new ArrayList<>();

        for(int i=1;i<=31;i++){
            day.add(""+i);
        }

        for(int i=1;i<=12;i++){
            month.add(""+i);
        }

        for(int i=1995;i<=2010;i++){
            year.add(""+i);
        }

        JLabel jLabel1=new JLabel("DOB : ");
        JSpinner daySpinner=new JSpinner(new SpinnerListModel(day));
        JSpinner monthSpinner=new JSpinner(new SpinnerListModel(month));
        JSpinner yearSpinner=new JSpinner(new SpinnerListModel(year));

        birthDay.add(jLabel1);
        birthDay.add(daySpinner);
        birthDay.add(monthSpinner);
        birthDay.add(yearSpinner);
        //End DropDown Spinner

        //Adding Button
        JPanel buttonPanel=new JPanel();
        JButton saveButton=new JButton("Show All Data");
        GridLayout boxLayout2=new GridLayout(1,1,5,5);
        buttonPanel.setLayout(boxLayout2);
        buttonPanel.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        buttonPanel.add(saveButton);
        //End Adding Button

        //Aligning Left all Item
        nameLabel.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        nameInput.setAlignmentX(JTextField.LEFT_ALIGNMENT);
        emailLabel.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        emailInput.setAlignmentX(JTextField.LEFT_ALIGNMENT);
        passwordLabel.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        passwordInput.setAlignmentX(JTextField.LEFT_ALIGNMENT);
        addressLabel.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        addressInput.setAlignmentX(JTextArea.LEFT_ALIGNMENT);
        //End Aligning


        //Adding Item into panel
        jPanel.add(nameLabel);
        jPanel.add(nameInput);
        jPanel.add(emailLabel);
        jPanel.add(emailInput);
        jPanel.add(passwordLabel);
        jPanel.add(passwordInput);
        jPanel.add(addressLabel);
        jPanel.add(addressInput);
        jPanel.add(country);
        jPanel.add(jList);
        jPanel.add(checkBoxPanel);
        jPanel.add(agePanel);
        jPanel.add(birthDay);
        jPanel.add(buttonPanel);
        //End Adding Item into Panel



        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Name : "+nameInput.getText());
                System.out.println("Email : "+emailInput.getText());
                System.out.println("Password : "+passwordInput.getText());
                System.out.println("Address : "+addressInput.getText());
                System.out.println("Country : "+jList.getSelectedValue());
                System.out.println("Sex : "+(jRadioButton.isSelected() ? " Male":"Female"));
                System.out.println("Skill : PHP : "+jCheckBox.isSelected() + "Java : "+jCheckBox2.isSelected()+" Python : "+jCheckBox3.isSelected());
                System.out.println("DOB : "+daySpinner.getValue()+"/"+monthSpinner.getValue()+"/"+yearSpinner.getValue());
            }
        });


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
