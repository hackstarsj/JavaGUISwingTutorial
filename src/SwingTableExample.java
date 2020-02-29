import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Vector;

public class SwingTableExample {
    public static void main(String args[]){
        System.out.println("=============Java GUI Swing Table=================");


        JFrame frame=new JFrame("Java Swing Table");
        frame.setSize(500,500);


        //Panel Code
        JPanel jPanel=new JPanel();
        BoxLayout verticalLayout=new BoxLayout(jPanel,BoxLayout.Y_AXIS);
        jPanel.setLayout(verticalLayout);
        frame.add(jPanel);



        //Label
        JLabel static_data_label=new JLabel("Static Data Table");
        static_data_label.setAlignmentX(JLabel.CENTER);
        static_data_label.setBackground(Color.BLACK);
        static_data_label.setForeground(Color.WHITE);
        static_data_label.setOpaque(true);
        EmptyBorder emptyBorder=new EmptyBorder(20,20,20,20);
        static_data_label.setBorder(emptyBorder);
        jPanel.add(static_data_label);

        //Data and Column
        String column[]={"Name","Email","Age"};
        String data[][]={
                {"Rahul","rahul@gmail.com","30"},
                {"Vishal","vishal@gmail.com","31"},
                {"Aman","aman@gmail.com","29"}
        };

        //table
        JTable jTable=new JTable(data,column);

        JScrollPane jScrollPane=new JScrollPane();
        jScrollPane.getViewport().add(jTable);
        jPanel.add(jScrollPane);

        //Label
        JLabel dynamic_data=new JLabel("Dynamic Data Table");
        dynamic_data.setAlignmentX(JLabel.CENTER);
        dynamic_data.setBackground(Color.BLACK);
        dynamic_data.setForeground(Color.WHITE);
        dynamic_data.setOpaque(true);
        EmptyBorder emptyBorder2=new EmptyBorder(20,20,20,20);
        dynamic_data.setBorder(emptyBorder2);
        jPanel.add(dynamic_data);

        DefaultTableModel table_data=new DefaultTableModel();
        for (int i=0;i<30;i++){
            if(i==0){
                table_data.addColumn("ID");
                table_data.addColumn("Name");
                table_data.addColumn("Email");
                table_data.addColumn("Age");
            }
            else{
                Vector row=new Vector();
                row.add(""+i);
                row.add("Rahul "+i);
                row.add("Rahul"+i+"@gmail.com");
                row.add("2"+i);
                table_data.addRow(row);
            }
        }


        //Dynamic Table With Data
        JTable table2=new JTable();
        table2.setModel(table_data);
        JScrollPane jScrollPane1=new JScrollPane();
        jScrollPane1.getViewport().add(table2);


        jPanel.add(jScrollPane1);

        //Showing Csv Data in Table
        //Label
        JLabel csv_data_label=new JLabel("CSV Data Table");
        csv_data_label.setAlignmentX(JLabel.CENTER);
        csv_data_label.setBackground(Color.BLACK);
        csv_data_label.setForeground(Color.WHITE);
        csv_data_label.setOpaque(true);
        EmptyBorder emptyBorder3=new EmptyBorder(20,20,20,20);
        csv_data_label.setBorder(emptyBorder3);
        jPanel.add(csv_data_label);

        //Parsing CSV Data
        File csv_file=new File("dummy.csv");
        DefaultTableModel csv_data=new DefaultTableModel();

        try{

            int start=0;
            InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(csv_file));
            CSVParser csvParser= CSVFormat.DEFAULT.parse(inputStreamReader);
            for(CSVRecord csvRecord:csvParser){
                if(start==0){
                    start=1;
                    csv_data.addColumn(csvRecord.get(0));
                    csv_data.addColumn(csvRecord.get(1));
                    csv_data.addColumn(csvRecord.get(2));
                    csv_data.addColumn(csvRecord.get(3));
                }
                else{
                    Vector row=new Vector();
                    row.add(csvRecord.get(0));
                    row.add(csvRecord.get(1));
                    row.add(csvRecord.get(2));
                    row.add(csvRecord.get(3));
                    csv_data.addRow(row);
                }
            }

        }
        catch (Exception e){
            System.out.println("Error in Parsing CSV File");
        }

        JTable jTable1=new JTable();
        jTable1.setModel(csv_data);
        JScrollPane jScrollPane2=new JScrollPane();
        jScrollPane2.getViewport().add(jTable1);

        jPanel.add(jScrollPane2);

        //Table Listener
        jTable1.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tableModelEvent) {
                System.out.println("Row : "+jTable1.getSelectedRow()+" | Column : "+jTable1.getSelectedColumn()+" | Current Value : "+jTable1.getValueAt(jTable1.getSelectedRow(),jTable1.getSelectedColumn()).toString());
            }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
