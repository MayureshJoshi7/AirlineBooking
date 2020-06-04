import javax.swing.*;
import java.awt.*;
import java.awt.event.*;    // importing event package for event listener
class RegForm{
 //Creating Static variables
 static JTextField name_txt ;
 static JRadioButton male;
 static JRadioButton female;
 static JComboBox day;
 static JComboBox month;
 static JComboBox year;
 static JComboBox from;
 static JComboBox to;
 static JCheckBox chkbox;
 static JButton submit_btn;
 static JTextArea output_txtArea;
 
 
 public static void main(String args[])
 {
 /* ---------------------------------- Creating JFrame -------------------------------------------------------- */
 //  Creating a frame using JFrame class	
 JFrame frame=new JFrame("Registration Form Example");  
 frame.setVisible(true);      
 frame.setBounds(200,100,700,600 );    
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 
 // setting background color of Frame. 
 Container c=frame.getContentPane();   
 c.setLayout(null);    
 c.setBackground(Color.yellow);     
 
 /*---------------------------------- Creating JLabel for Heading Text ------------------------------------------- */
 
 Font f=new Font("Arial",Font.BOLD,20);   // Creating font style and size for heading
 
 // creating JLabel for Heading
 JLabel heading_lbl=new JLabel();
 heading_lbl.setBounds(250,5,200,40);
 heading_lbl.setText("<html><font><u><b>Registration Form</b></u></html>"); 
 
 // applying font on  heading Label
 heading_lbl.setFont(f);
 
 /* ----------------------------------- Creating Global Font style for all components ------------------------------ */
 
 Font f1=new Font("Arial",Font.BOLD,14);
 
 /* ----------------------------------- Creating components for Registration details ---------------------------------- */
 
 //  Creating JLabel for Name
 JLabel name_lbl=new JLabel("Name : ");
 name_lbl.setBounds(50,80,100,30); 
 
 // Creating JTextField for Name
 name_txt=new JTextField();
 name_txt.setBounds(180,80,180,30);  

 // Creating JLabel for Gender
 JLabel gender_lbl=new JLabel("Gender : ");
 gender_lbl.setBounds(50,160,150,30);   
 
 // Setting Cursor for components
 Cursor cur=new Cursor(Cursor.HAND_CURSOR); 
 
 // Creating JRadioButton for the Male 
 male=new JRadioButton("Male");
 male.setBounds(180,160,70,30);
 male.setBackground(Color.yellow);
 male.setCursor(cur);
 
 // Creating JRadioButton for the Female
 female=new JRadioButton("Female");
 female.setBounds(280,160,80,30);
 female.setBackground(Color.yellow);
 female.setCursor(cur);
 
 // Creating ButtonGroup for the JRadioButtons
 ButtonGroup gender_grp=new ButtonGroup();
 gender_grp.add(male);    // adding male radio button in the ButtonGroup
 gender_grp.add(female);    // adding female radio button in the ButtonGroup
 
 // Creating JLabel for Date of Departure
 JLabel dob_lbl=new JLabel("Departure Date : ");
 dob_lbl.setBounds(50,200,100,30); 
 
 // Creating JComboBox for the day
 String day_arr[]=new String[31];
 for(int i=1;i<=31;i++)
 day_arr[i-1]=Integer.toString(i); 
 day=new JComboBox(day_arr);
 day.setBounds(180,200,40,30);
 
 // Creating JComboBox for the month
 String month_arr[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec" }; 
 month=new JComboBox(month_arr);
 month.setBounds(230,200,60,30);
 
 // Creating JComboBox for the year	
 String year_arr[]=new String[70];
 for(int i=2018;i<=2020;i++)
 year_arr[i-2018]=Integer.toString(i);
 year=new JComboBox(year_arr);
 year.setBounds(300,200,60,30);
 
 //Creating JComboBox for From
 String from_arr[]={"Mumbai","Bangalore","Hydrabad","Delhi","Pune","Chennai"};
 from=new JComboBox(from_arr);
 from.setBounds(200,250,70,40);

 //Creating JComboBox for To
 String to_arr1[]={"Mumbai","Bangalore","Hydrabad","Delhi","Pune","Chennai"};
 to=new JComboBox(to_arr1);
 to.setBounds(300,250,70,40);

 
     // Creating JCheckBox for the license agreement 
 chkbox=new JCheckBox("I accept the terms and conditions");
 chkbox.setBounds(50,430,300,30);
 chkbox.setBackground(Color.yellow);
 
 // Creating JButton for submit the details
 submit_btn=new JButton("Submit");
 submit_btn.setBounds(180,500,120,40);
 submit_btn.setCursor(cur);  // Applying hand cursor on the button
 
 //  Adding ActionListener on submit button
 submit_btn.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent event){
 submit_action(event); 
 } 
 });
 
 
 // Creating JTextArea for output
 output_txtArea=new JTextArea();
 output_txtArea.setBounds(380,80,260,320);
 
 //  Applying Global Font on all the JLabels	
 name_lbl.setFont(f1);
 gender_lbl.setFont(f1);
 dob_lbl.setFont(f1);

 
 //  Applying Font on all JTextFields, JRadioButtons, JComboBox and JTextArea
 name_txt.setFont(f1);
 male.setFont(f1);
 female.setFont(f1);
 chkbox.setFont(f1);
 submit_btn.setFont(f1);
 output_txtArea.setFont(f1);
 
 // Adding label components to the container 
 c.add(heading_lbl); 
 c.add(name_lbl); 
 c.add(gender_lbl);
 c.add(male);
 c.add(female);
 c.add(dob_lbl);

 
 //  Adding JTextField, JTextArea, JComboBox, JCheckBox, JRadioButton to the container
 c.add(name_txt);
 c.add(name_txt);
 c.add(day);
 c.add(month);
 c.add(year);
 c.add(from);
 c.add(to);
 c.add(chkbox);
 c.add(submit_btn);
 c.add(output_txtArea); 
 }
 
 // Reading value from the Registration Form
 public static void submit_action(ActionEvent event){
 if(chkbox.isSelected()==true)
 {
 String name=name_txt.getText();
 String gender="Male";
 if(female.isSelected()==true)
 gender="Female";
 String day_name=(String)day.getSelectedItem();
 String month_name=(String)month.getSelectedItem();
 String year_name=(String)year.getSelectedItem();
 String from_name=(String)from.getSelectedItem();
 String to_name=(String)to.getSelectedItem();
 
 
 // displaying value in the JTextArea
 output_txtArea.setText("Hello!!\n Name :   " +name + "\n Gender :   "+gender +
                                         "\n Date of Departure :   "+day_name + "  "+month_name + " " +year_name +  "\n From :  " +from_name + "\n  To : "+to_name +"\n ------------Happy Journey!---------------" );
 
 }
 else
 {
 output_txtArea.setText("Please accept the terms and condition");
 }
 
 }
 
}
