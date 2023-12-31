//frame manipulaions Classes and packages
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Font;

//making it look beautiful 
import java.awt.Color;

//events
import java.awt.event.ActionListener;
//import java.sql.Array;
import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane; 
import java.awt.TextField;
import java.util.ArrayDeque;
import java.util.ArrayList;

//optional package
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

class Main{
  static final int INVALID=-1;
  private JFrame frame;
  private JPanel studentPanel,regularPanel,dropoutPanel;
  //forstudent
  private JLabel studentNamelb,dateOfBirthlb,courseNamelb,enrollmentIDlb,dateOfEnrollmentlb1,dateOfEnrollmentlb2,courseDurationlb1,courseDurationlb2,tuitionFeelb;
  

  private JComboBox<String> yearDobComboBox;
  private JComboBox<String> monthDobComboBox;
  private JComboBox<String> dayDobComboBox;

  private JComboBox<String> yearDoeComboBox;
  private JComboBox<String> monthDoeComboBox;
  private JComboBox<String> dayDoeComboBox;
  private JButton addStudentbt,clearStudentButtonbt,displayStudentButtonbt;
  private TextField studentNameTf,courseNametf,enrollmentIdtf,courseDurationtf,tuitionFeetf;
  //storing data of student class in a arraylist
  ArrayList<Student> studental=new ArrayList<>();
  //for regular
  private JLabel numOfModuleslb,numOfCreditHourslb,dayPresentlb,regularEnrollmentIdlb;
  private TextField numOfModulestf,numOfCreditHourstf,numOfDaysPresenttf,regularEnrollmentIdtf;
  private JButton addRegularbt,displayRegularButtonbt,presentPercentageButton,grantCertificatebt,regularClearbt;
  //storing data of regular class in a arraylist
  

  //working with dropoutclass
  private JLabel numOfRemainingModuleslb1,numOfRemainingModuleslb2,numOfMonthsAttendedlb1,numOfMonthsAttendedlb2,dateOfDropoutlb,dropoutEnrollmentIdlb;
  private TextField numOfRemainingModulestf,numOfMonthsAttendedtf,dropoutEnrollmentIdtf;
  
  private JComboBox<String> yearDodComboBox;
  private JComboBox<String> monthDodComboBox;
  private JComboBox<String> dayDodComboBox;
  //ArrayList<Dropout> droupoutal=new ArrayList<>();

 //buttons for dropOutStudent
  private JButton payBillsbt,removeDropoutStudentbt,dropoutDisplaybt,dropoutClearbt,addDropoutbt;




  public Main(){
    try{
     UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(frame,"This OS doesnot support this look");
    }

    frame=new JFrame("college Coursework");
    Toolkit kit=Toolkit.getDefaultToolkit();
    Dimension screenDimension=kit.getScreenSize();
    int screenWidth=screenDimension.width;
    int screenHeight=screenDimension.height;
    frame.setSize(screenWidth,screenHeight-20);


  
    

    //working with studentPanel
    studentPanel=new JPanel();
    studentPanel.setSize(350,600);
    studentPanel.setBackground(new Color(155,66,245));
    studentPanel.setLayout(null);
    studentPanel.setLocation(20,25);
    //studentPanel components

    //StudentName
    studentNamelb=new JLabel("StudentName:");
    studentNamelb.setBounds(10,80,100,20);
    studentNamelb.setFont(new Font("Arial",Font.BOLD,14));
    studentNamelb.setForeground(Color.WHITE);
    studentNameTf=new TextField();
    studentNameTf.setBounds(140,80,120,20);
    studentNameTf.setFont(new Font("Arial",Font.PLAIN,14));
    studentPanel.add(studentNamelb);
    studentPanel.add(studentNameTf);
   
    //Date Of Birth
    dateOfBirthlb=new JLabel("Date Of Birth:");
    dateOfBirthlb.setBounds(10,120,100,20);
    dateOfBirthlb.setFont(new Font("Arial",Font.BOLD,14));
    dateOfBirthlb.setForeground(Color.WHITE);
    studentPanel.add(dateOfBirthlb);
    
    //combobox config 1 date of birth
    yearDobComboBox=new JComboBox<>();
    yearDobComboBox.setBounds(140,120, 60, 20);
    studentPanel.add(yearDobComboBox);
    monthDobComboBox=new JComboBox<>();
    monthDobComboBox=new JComboBox<>();
    monthDobComboBox.setBounds(210, 120, 70, 20);
    studentPanel.add(monthDobComboBox);
    dayDobComboBox=new JComboBox<>();
    dayDobComboBox.setBounds(290,120,60,20);
    studentPanel.add(dayDobComboBox);
    
    //config of all comboBox for date of birth
    ArrayList year=new ArrayList<>();
    String[] years={"Year","1980","1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022","2023"};
    for(String year1:years){
        year.add(year1);
    }
    for(String year1:years){
      yearDobComboBox.addItem(year1);
    }
    ArrayList month=new ArrayList<>();
    String[] months={"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
    for(String month1:months){
        month.add(month1);
    }
    for(String month1:months){
      monthDobComboBox.addItem(month1);
    }
    ArrayList day=new ArrayList<>();
    String[] days={"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    for(String day1:days){
        day.add(day1);
    }
    for(String day1:days){
      dayDobComboBox.addItem(day1);
    }

    //StudentPanel courseName
    courseNamelb=new JLabel("Course Name:");
    courseNamelb.setFont(new Font("Arial",Font.BOLD,14));
    courseNamelb.setForeground(Color.WHITE);
    courseNamelb.setBounds(10, 160,100,20);
    studentPanel.add(courseNamelb);
    courseNametf=new TextField();
    courseNametf.setFont(new Font("Arial",Font.PLAIN,14));
    courseNametf.setBounds(140,160,120,20);
    studentPanel.add(courseNametf);
    
    //studentPanel enrollmentID
    enrollmentIDlb=new JLabel("Enrollment Id:");
    enrollmentIDlb.setFont(new Font("Arial",Font.BOLD,14));
    enrollmentIDlb.setForeground(Color.WHITE);
    enrollmentIDlb.setBounds(10,200,100,20);
    studentPanel.add(enrollmentIDlb);
    enrollmentIdtf=new TextField();
    enrollmentIdtf.setFont(new Font("Arial",Font.PLAIN,14));
    enrollmentIdtf.setBounds(140,200,120,20);
    studentPanel.add(enrollmentIdtf);

    //studentPanel DateOfEnrollment
     dateOfEnrollmentlb1=new JLabel("Date of");
     dateOfEnrollmentlb1.setFont(new Font("Arial",Font.BOLD,14));
     dateOfEnrollmentlb1.setForeground(Color.WHITE);
     dateOfEnrollmentlb1.setBounds(10,240,100,20);
     studentPanel.add(dateOfEnrollmentlb1);
     dateOfEnrollmentlb2=new JLabel("Enrollment:");
     dateOfEnrollmentlb2.setFont(new Font("Arial",Font.BOLD,14));
     dateOfEnrollmentlb2.setForeground(Color.WHITE);
     dateOfEnrollmentlb2.setBounds(10,260,100,20);
     studentPanel.add(dateOfEnrollmentlb2);
     
     //combobox config 1 date of enrollment
     yearDoeComboBox=new JComboBox<>();
     for(String year1:years){
      yearDoeComboBox.addItem(year1);
    }
    yearDoeComboBox.setBounds(140,260, 60, 20);
    studentPanel.add(yearDoeComboBox);
    monthDoeComboBox=new JComboBox<>();
    for(String month1:months){
      monthDoeComboBox.addItem(month1);
    }
    monthDoeComboBox.setBounds(210, 260, 70, 20);
    studentPanel.add(monthDoeComboBox);
    dayDoeComboBox=new JComboBox<>();
    for(String day1:days){
      dayDoeComboBox.addItem(day1);
    }
    dayDoeComboBox.setBounds(290,260,60,20);
    studentPanel.add(dayDoeComboBox);

    //studentPanel courseDurationlb
    courseDurationlb1=new JLabel("Course");
    courseDurationlb1.setFont(new Font("Arial",Font.BOLD,14));
    courseDurationlb1.setForeground(Color.WHITE);
    courseDurationlb1.setBounds(10,300,100,20);
    studentPanel.add(courseDurationlb1);
    courseDurationlb2=new JLabel("Duration:");
    courseDurationlb2.setFont(new Font("Arial",Font.BOLD,14));
    courseDurationlb2.setForeground(Color.WHITE);
    courseDurationlb2.setBounds(10,320,100,20);
    studentPanel.add(courseDurationlb2);
    courseDurationtf=new TextField();
    courseDurationtf.setFont(new Font("Arial",Font.PLAIN,14));
    courseDurationtf.setBounds(140,320,120,20);
    studentPanel.add(courseDurationtf);

    //studentPanel Tuition Feelb
    tuitionFeelb=new JLabel("Tuition Fee:");
    tuitionFeelb.setFont(new Font("Arial",Font.BOLD,14));
    tuitionFeelb.setForeground(Color.WHITE);
    tuitionFeelb.setBounds(10,360,100,20);
    studentPanel.add(tuitionFeelb);
    tuitionFeetf=new TextField();
    tuitionFeetf.setFont(new Font("Arial",Font.PLAIN,14));
    tuitionFeetf.setBounds(140,360,120,20);
    studentPanel.add(tuitionFeetf);
   

    //configuring button in student Panel
    addStudentbt=new JButton("Add Student");
    addStudentbt.setFont(new Font("Arial",Font.BOLD,14));
    addStudentbt.setBounds(10,440,140,20);
    studentPanel.add(addStudentbt);

    clearStudentButtonbt=new JButton("Clear");
    clearStudentButtonbt.setFont(new Font("Arial",Font.BOLD,14));
    clearStudentButtonbt.setBounds(180,440,140,20);
    studentPanel.add(clearStudentButtonbt);
   
    displayStudentButtonbt=new JButton("Display");
    displayStudentButtonbt.setFont(new Font("Arial",Font.BOLD,14));
    displayStudentButtonbt.setBounds(100,480,140,20);
    studentPanel.add(displayStudentButtonbt); 
    displayStudentButtonbt.setVisible(false);



    frame.add(studentPanel);



    
    //working with regularPanel
    regularPanel=new JPanel();
    regularPanel.setSize(350,600);
    regularPanel.setBackground(new Color(155,66,245));
    regularPanel.setLayout(null);
    regularPanel.setLocation(450,25);
    frame.add(regularPanel);
    
    
  
   
    //working with dropoutPanel
    dropoutPanel=new JPanel();
    dropoutPanel.setSize(350,600);
    dropoutPanel.setBackground(new Color(155,66,245));
    dropoutPanel.setLayout(null);
    dropoutPanel.setLocation(875,25);
    frame.add(dropoutPanel);

     //|$$$$$$$$$$$$$$$$$$$$$$$||Action listener||$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$/

    addStudentbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        String studentName=getStudentName();
        if(studentName.equals("")){
            JOptionPane.showMessageDialog(frame,"Give your Coursename");
            return;
      }
        String dataOfBirth=getStudentDateOfBirth();
        if(dataOfBirth==null){
          JOptionPane.showMessageDialog(frame,"Select your date of birth");
          return;
        }
        String courseName=getStudentCourseName();
        if(courseName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your CourseName");
          return;
        }
        int enrollmentId=getStudentEnrollmentId();
        if(enrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select proper enrollment id");
          return;
        }
        String dateOfEnrollment=getStudentDateOfEnrollment();
        if(dateOfEnrollment==null){
          JOptionPane.showMessageDialog(frame,"Select your date of enrollment");
          return;
        }
        int courseDuration=getStudentCourseDuration();
        if(courseDuration==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your Course Duration");
          return;
          }
        int tuitionFee=getStudentTuitionFee();
        if(tuitionFee==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your Tuition Fee");
          return;
        }

        Student s1=new Student(studentName, dataOfBirth, courseName, enrollmentId, dateOfEnrollment, courseDuration, tuitionFee);
        studental.add(s1);
        JOptionPane.showMessageDialog(studentPanel,"Student record successfully recorded");
        displayStudentButtonbt.setVisible(true);
      }  
    });

    displayStudentButtonbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
         // String students = "";
          for(Student object: studental){
              object.display();
          }
          JOptionPane.showMessageDialog(frame,"Details in Terminal");
      }
  });
  
    clearStudentButtonbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        studentNameTf.setText("");
        courseNametf.setText("");
        enrollmentIdtf.setText("");
        courseDurationtf.setText("");
        tuitionFeetf.setText("");
        yearDobComboBox.setSelectedItem("Year");
        monthDobComboBox.setSelectedItem("Month");
        dayDobComboBox.setSelectedItem("Day");
        yearDoeComboBox.setSelectedItem("Year");
        monthDoeComboBox.setSelectedItem("Month");
        dayDoeComboBox.setSelectedItem("Day");
      }
    });
  /////////////////////////////working with regularPanel///////////////////////////////////////////////////////
     
// Components for the regularPanel
          
    //Number of Modules Label and Textfield
    numOfModuleslb=new JLabel("Number of Modules:");
    numOfModuleslb.setBounds(10,80,150,20);
    numOfModuleslb.setFont(new Font("Arial",Font.BOLD,14));
    numOfModuleslb.setForeground(Color.WHITE);
    numOfModulestf=new TextField();
    numOfModulestf.setBounds(190,80,120,20);
    numOfModulestf.setFont(new Font("Arial",Font.PLAIN,14));
    regularPanel.add(numOfModuleslb);
    regularPanel.add(numOfModulestf);

    //Number of Credit Hours Label and Textfield
    numOfCreditHourslb=new JLabel("Number of Credit Hours:");
    numOfCreditHourslb.setBounds(10,120,170,20);
    numOfCreditHourslb.setFont(new Font("Arial",Font.BOLD,14));
    numOfCreditHourslb.setForeground(Color.WHITE);
    numOfCreditHourstf=new TextField();
    numOfCreditHourstf.setBounds(190,120,120,20);
    numOfCreditHourstf.setFont(new Font("Arial",Font.PLAIN,14));
    regularPanel.add(numOfCreditHourslb);
    regularPanel.add(numOfCreditHourstf);


    //Enrollment Id and textField
    regularEnrollmentIdlb=new JLabel("Enrollment Id");
    regularEnrollmentIdlb.setBounds(10,160,170,20);
    regularEnrollmentIdlb.setFont(new Font("Arial",Font.BOLD,14));
    regularEnrollmentIdlb.setForeground(Color.WHITE);
    regularEnrollmentIdtf=new TextField();
    regularEnrollmentIdtf.setBounds(190,160,120,20);
    regularEnrollmentIdtf.setFont(new Font("Arial",Font.PLAIN,14));
    regularPanel.add(regularEnrollmentIdlb);
    regularPanel.add(regularEnrollmentIdtf);


    //Number of Days Present Label and Textfield
    dayPresentlb=new JLabel("Number of Days Present:");
    dayPresentlb.setBounds(10,200,180,20);
    dayPresentlb.setFont(new Font("Arial",Font.BOLD,14));
    dayPresentlb.setForeground(Color.WHITE);
    numOfDaysPresenttf=new TextField();
    numOfDaysPresenttf.setBounds(190,200,120,20);
    numOfDaysPresenttf.setFont(new Font("Arial",Font.PLAIN,14));
    regularPanel.add(dayPresentlb);
    regularPanel.add(numOfDaysPresenttf);

    


    /////////////////////////CONFIG REGULAR BUTTON
    addRegularbt=new JButton("Add Regular");
    addRegularbt.setFont(new Font("Arial",Font.BOLD,14));
    addRegularbt.setBounds(10,250,140,20);
    regularPanel.add(addRegularbt);
    /////////////////////////Config display button
    displayRegularButtonbt=new JButton("Display Regular");
    displayRegularButtonbt.setFont(new Font("Arial",Font.BOLD,14));
    displayRegularButtonbt.setBounds(110,340,170,20);
    displayRegularButtonbt.setVisible(false);
    regularPanel.add(displayRegularButtonbt);
    //////////////////////////Config grantCertficateButton
    grantCertificatebt=new JButton("Grant Certificate");
    grantCertificatebt.setFont(new Font("Arial",Font.BOLD,14));
    grantCertificatebt.setBounds(10,300,140,20);
    regularPanel.add(grantCertificatebt);
    //config presentpercentagebutton
    presentPercentageButton=new JButton("Present Percentage");
    presentPercentageButton.setFont(new Font("Arial",Font.BOLD,14));
    presentPercentageButton.setBounds(170,300,170,20);
    regularPanel.add(presentPercentageButton);
    //config regular Clear button
    regularClearbt=new JButton("Clear");
    regularClearbt.setFont(new Font("Arial",Font.BOLD,14));
    regularClearbt.setBounds(170,250,170,20);
    regularPanel.add(regularClearbt);


    ///////////////////////////////ACTION LISTENER FOR REGULAR CLASS////////////////////////////////////////////////////
    addRegularbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){

        int numOfModules=getRegularNumOfModules();
        if(numOfModules==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact Number Of Modules");
          return;
        }
        int regularEnrollmentIdCheck=getRegularEnrollmentId();
        if(regularEnrollmentIdCheck==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact enrollment Id");
          return;
        }

        int numOfCreditHours1=getRegularNumOfCreditHours();
        if(numOfCreditHours1==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact Number Of Credit Hours");
          return;
        }
        
        double numOfDaysPresent=getRegularDaysPresent();
        if(numOfDaysPresent==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact num of days Present");
          return;
        }
        //////////////////geting values from studentPanel need to make changes here//////////////////////
        String studentName=getStudentName();
        if(studentName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Student Name");
          return;
        }
        String dateOfBirth=getStudentDateOfBirth();
        if(dateOfBirth.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your date of birth");
          return;
        }
        String courseName=getStudentCourseName();
        if(courseName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Course Name");
          return;
        }
        int enrollmentId=getStudentEnrollmentId();
        if(enrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your enrollment Id");
          return;
        }
        String dateOfEnrollment=getStudentDateOfEnrollment();
        if(dateOfEnrollment==null){
          JOptionPane.showMessageDialog(frame,"Select your enrollment date of enrollment");
          return;
        }
        int courseDuration=getStudentCourseDuration();
        if(courseDuration==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your course duration");
          return;
        }
        int tuitionFee=getStudentTuitionFee();
        if(tuitionFee==INVALID){
          JOptionPane.showMessageDialog(frame,"Select a valid tuition fee");
          return;
        }


        Student reg = new Regular(studentName,dateOfBirth,courseName,enrollmentId,dateOfEnrollment,courseDuration,tuitionFee,numOfModules,regularEnrollmentIdCheck,numOfCreditHours1,numOfDaysPresent);
        studental.add(reg);
        boolean checkingunique=checkUniquere(regularEnrollmentIdCheck);
        if(checkingunique==true){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is not unique");
        }
        else if(checkingunique==false){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is unique");
        }
        JOptionPane.showMessageDialog(frame,"Regular student record successfully recorded");
        displayRegularButtonbt.setVisible(true);
        
      
      
      }  
    });
      ////////////////////////display button on regular panel Action LISTENER///////////////////////
      displayRegularButtonbt.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String regularStudent = "";
            for(Student regObject : studental){
                if(regObject instanceof Regular) {
                   ((Regular)regObject).regularDisplay();
                }
            }

            JOptionPane.showMessageDialog(frame, "Details in terminal");
        }
    });

     
    ///////////////////////////////////////////////presentPercentagebuttonactionlistener/////////////////////////////////////////////
    presentPercentageButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        int enrollmentIdCheck2=getRegularEnrollmentId();
        if(enrollmentIdCheck2==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact Number Of Enrollment Id");
          return;
        }
        double daysPresentCheck2=getRegularDaysPresent();
        if(daysPresentCheck2==INVALID){
          JOptionPane.showMessageDialog(frame,"Select valid number of days Present");
        }
  
        boolean found=false;
        for(Student obj:studental){
           if(obj instanceof Regular){
            Regular regularobj=(Regular) obj;
            if(enrollmentIdCheck2==regularobj.getEnrollmentID()){
              char grade=regularobj.getPresentPercentage(daysPresentCheck2);
              found=true;
              JOptionPane.showMessageDialog(frame,grade);
              break;
            }
            else{
              found=false;
            }
           }
          
        }
        if(found==false){
          JOptionPane.showMessageDialog(frame,"Enrollment not found");
        }

      }
    });
    
     
    ////////////////////////////////////////////////////////////////////Grant Certificate Button actionListener/////////////////////////////////
    grantCertificatebt.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        int enrollmentIdCheck2=getRegularEnrollmentId();
        if(enrollmentIdCheck2==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact Number Of Enrollment Id");
          return;
        }
        String courseNameCheck2=getStudentCourseName();
        if(courseNameCheck2.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your CourseName");
          return;
        }
      String dateOfEnrollmentCheck=getStudentDateOfEnrollment();
      if(dateOfEnrollmentCheck==null){
        JOptionPane.showMessageDialog(frame,"Select your date of enrollment");
        return;
      }
      boolean found=false;
        for(Student obj:studental){
           if(obj instanceof Regular){
            Regular regularobj=(Regular) obj;
            if(enrollmentIdCheck2==regularobj.getEnrollmentID()){
              regularobj.grantCertificate(courseNameCheck2,enrollmentIdCheck2,dateOfEnrollmentCheck);
              found=true;
              JOptionPane.showMessageDialog(frame,"Details has been displayed in terminal");
              break;
            }
            else{
              found=false;
            }
           }
          
        }
        if(found==false){
          JOptionPane.showMessageDialog(frame,"Invalid Enrollment id");
        }  
      }
    });
    //////////////////////////////////////CLEAR BUTTON ACTION LISTENER//////////////////////////////////////////////////////////////////\
    regularClearbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        numOfModulestf.setText("");
        numOfCreditHourstf.setText("");
        numOfDaysPresenttf.setText("");
        regularEnrollmentIdtf.setText("");
        yearDoeComboBox.setSelectedItem("Year");
        monthDoeComboBox.setSelectedItem("Month");
        dayDoeComboBox.setSelectedItem("");
      }
    });


    ///////////////////////////////////// WORKING WITH DROPOUT CLASS//////////////////////////////////////////////////////////////
    /* 
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount
    */

    /////////////////numofremainingmodules
    numOfRemainingModuleslb1=new JLabel("Number of Remaining");
    numOfRemainingModuleslb1.setFont(new Font("Arial",Font.BOLD,14));
    numOfRemainingModuleslb1.setForeground(Color.WHITE);
    numOfRemainingModuleslb1.setBounds(10,80,150,20);
    numOfRemainingModuleslb2=new JLabel("Modules:");
    numOfRemainingModuleslb2.setFont(new Font("Arial",Font.BOLD,14));
    numOfRemainingModuleslb2.setForeground(Color.WHITE);
    numOfRemainingModuleslb2.setBounds(10,100,150,20);
    numOfRemainingModulestf=new TextField();
    numOfRemainingModulestf.setFont(new Font("Arial",Font.PLAIN,14));
    numOfRemainingModulestf.setBounds(190,100,120,20);
    dropoutPanel.add(numOfRemainingModuleslb1);
    dropoutPanel.add(numOfRemainingModuleslb2);
    dropoutPanel.add(numOfRemainingModulestf);

    //numofmonthsAttended
    numOfMonthsAttendedlb1=new JLabel("Number Of");
    numOfMonthsAttendedlb1.setFont(new Font("Arial",Font.BOLD,14));
    numOfMonthsAttendedlb1.setForeground(Color.WHITE);
    numOfMonthsAttendedlb1.setBounds(10,140,170,20);
    numOfMonthsAttendedlb2=new JLabel("Months Attended:");
    numOfMonthsAttendedlb2.setFont(new Font("Arial",Font.BOLD,14));
    numOfMonthsAttendedlb2.setForeground(Color.WHITE);
    numOfMonthsAttendedlb2.setBounds(10,160,170,20);
    numOfMonthsAttendedtf=new TextField();
    numOfMonthsAttendedtf.setFont(new Font("Arial",Font.PLAIN,14));
    numOfMonthsAttendedtf.setBounds(190,160,120,20);
    dropoutPanel.add(numOfMonthsAttendedlb1);
    dropoutPanel.add(numOfMonthsAttendedlb2);
    dropoutPanel.add(numOfMonthsAttendedtf);

    //Date of dropout label and combo box
    dateOfDropoutlb=new JLabel("Date Of Dropout:");
    dateOfDropoutlb.setFont(new Font("Arial",Font.BOLD,14));
    dateOfDropoutlb.setForeground(Color.WHITE);
    dateOfDropoutlb.setBounds(10,200,170,20);
    dropoutPanel.add(dateOfDropoutlb);

    //combobox config 1 date of enrollment
     yearDodComboBox=new JComboBox<>();
     for(String year1:years){
      yearDodComboBox.addItem(year1);
    }
    yearDodComboBox.setBounds(140,200, 60, 20);
    dropoutPanel.add(yearDodComboBox);
    monthDodComboBox=new JComboBox<>();
    for(String month1:months){
      monthDodComboBox.addItem(month1);
    }
    monthDodComboBox.setBounds(210, 200, 70, 20);
    dropoutPanel.add(monthDodComboBox);
    dayDodComboBox=new JComboBox<>();
    for(String day1:days){
      dayDodComboBox.addItem(day1);
    }
    dayDodComboBox.setBounds(290,200,60,20);
    dropoutPanel.add(dayDodComboBox);

    
    dropoutEnrollmentIdlb=new JLabel("Enrollment Id:");
    dropoutEnrollmentIdlb.setBounds(10,240,170,20);
    dropoutEnrollmentIdlb.setFont(new Font("Arial",Font.BOLD,14));
    dropoutEnrollmentIdlb.setForeground(Color.WHITE);
    dropoutEnrollmentIdtf=new TextField();
    dropoutEnrollmentIdtf.setBounds(190,240,120,20);
    dropoutEnrollmentIdtf.setFont(new Font("Arial",Font.PLAIN,14));
    dropoutPanel.add(dropoutEnrollmentIdlb);
    dropoutPanel.add(dropoutEnrollmentIdtf);
    

    //configuring button of droupout class

    ////////////////////////CONFIG ADDDROPOUT BUTTON
    addDropoutbt=new JButton("Add Dropout");
    addDropoutbt.setFont(new Font("Arial",Font.BOLD,14));
    addDropoutbt.setBounds(10,320,140,20);
    dropoutPanel.add(addDropoutbt);
    /////////////////////////CONFIG Dropout BUTTON
    payBillsbt=new JButton("pay bills");
    payBillsbt.setFont(new Font("Arial",Font.BOLD,14));
    payBillsbt.setBounds(10,360,140,20);
    dropoutPanel.add(payBillsbt);
    /////////////////////////Config display button
    removeDropoutStudentbt=new JButton("Remove Dropout Std");
    removeDropoutStudentbt.setFont(new Font("Arial",Font.BOLD,14));
    removeDropoutStudentbt.setBounds(170,320,170,20);
    dropoutPanel.add(removeDropoutStudentbt);
    //////////////////////////Config grantCertficateButton
    dropoutDisplaybt=new JButton("Display");
    dropoutDisplaybt.setFont(new Font("Arial",Font.BOLD,14));
    dropoutDisplaybt.setBounds(120,400,140,20);
    dropoutDisplaybt.setVisible(false);
    dropoutPanel.add(dropoutDisplaybt);
    //config clear buttonbutton
    dropoutClearbt=new JButton("Clear");
    dropoutClearbt.setFont(new Font("Arial",Font.BOLD,14));
    dropoutClearbt.setBounds(170,360,170,20);
    dropoutPanel.add(dropoutClearbt);
    

    //////////////////////////////////Dropout class action listener////////////////////////////////////////////////////////
     
    addDropoutbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){

        int numOfRemainingModules=getNumberOfRemainingModules();
        if(numOfRemainingModules==INVALID){
          JOptionPane.showMessageDialog(frame,"Select valid number of remaining modules");
          return;
        }
        int numofMonthsAttended=getNumberOfMonthsAttended();
        if(numofMonthsAttended==INVALID){
          JOptionPane.showMessageDialog(frame,"Select valid number of months attended");
          return;
        }
        
        int dropoutEnrollmentId=getDropoutEnrollmentId();
        if(dropoutEnrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select valid Enrollment Id");
          return;
        }
        
        String dateOfDropout=getDateOfDropout();
        if(dateOfDropout==null){
          JOptionPane.showMessageDialog(frame,"Select date of Dropout");
          return;
        }

        
        String studentName=getStudentName();
        if(studentName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Student Name");
          return;
        }
        
        String dateOfBirth=getStudentDateOfBirth();
        if(dateOfBirth.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your date of birth");
          return;
        }
      
        String courseName=getStudentCourseName();
        if(courseName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Course Name");
          return;
        }
        
        int enrollmentId=getStudentEnrollmentId();
        if(enrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your enrollment Id");
          return;
        }
        
        String dateOfEnrollment=getStudentDateOfEnrollment();
        if(dateOfEnrollment==null){
          JOptionPane.showMessageDialog(frame,"Select your enrollment date of enrollment");
          return;
        }
        
        int courseDuration=getStudentCourseDuration();
        if(courseDuration==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your course duration");
          return;
        }
        
        int tuitionFee=getStudentTuitionFee();
        if(tuitionFee==INVALID){
          JOptionPane.showMessageDialog(frame,"Select a valid tuition fee");
          return;
        }
        
        Student dropoutobj = new Dropout(studentName,dateOfBirth,courseName,enrollmentId,dateOfEnrollment,courseDuration,tuitionFee,numOfRemainingModules,numofMonthsAttended,dropoutEnrollmentId,dateOfDropout);
        studental.add(dropoutobj);
        boolean checkingunique=checkUniquere(dropoutEnrollmentId);
        if(checkingunique==true){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is not unique");
        }
        if(checkingunique==false){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is unique");
        }
        JOptionPane.showMessageDialog(frame,"Dropout student record successfully recorded");
        dropoutDisplaybt.setVisible(true);
      }
    });
    
    payBillsbt.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
        int enrollmentIdCheck3=getDropoutEnrollmentId();
        boolean found=false;
        for(Student obj:studental){
          if(obj instanceof Dropout){
            Dropout drObj=(Dropout) obj;
            if(enrollmentIdCheck3==drObj.getEnrollmentID()){
              found=true;
              drObj.billsPayable();
              JOptionPane.showMessageDialog(frame,"Details in Terminal");
              break;
            }
            else{
              found=false;
            }
          }
     
        }
        if(found==false){
          JOptionPane.showMessageDialog(frame,"Invalid enrollment id");
        }
        

      }
    });
    ///////////////action listener for remove dropout student
    removeDropoutStudentbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        int enrollmentIdCheck3=getDropoutEnrollmentId();
        boolean found=false;
        for(Student objch:studental){
          if(objch instanceof Dropout){
            Dropout dropobj1=(Dropout) objch;
            if(enrollmentIdCheck3==dropobj1.getEnrollmentID()){
              dropobj1.removeDropoutStudent();
              found=true;
              JOptionPane.showMessageDialog(frame,"Details in Terminal");
              break;
            }
            else{
              found=false;
            }
          }
        }
        if(found=false){
          JOptionPane.showMessageDialog(frame,"Invalid Enrollment Id");
        }
      }
    });
   ///////////////action listener for clear dropout student
    dropoutClearbt.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        numOfRemainingModulestf.setText("");
        numOfMonthsAttendedtf.setText("");
        dropoutEnrollmentIdtf.setText("");
         yearDodComboBox.setSelectedItem("Year");
         monthDodComboBox.setSelectedItem("Month");
         dayDodComboBox.setSelectedItem("Day");
         regularEnrollmentIdtf.setText("");
      }
    });
    //config dropout display button
    dropoutDisplaybt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        String dropoutStudent="";
        for(Student stdObject:studental){
          if(stdObject instanceof Dropout){
            Dropout dropObject=(Dropout) stdObject;
              dropObject.display();
          }
        }
        JOptionPane.showMessageDialog(frame,"Details in Terminal");
      }
    });
    //////////////////////////////////PAY BILL OF DROPOUT STUDENT KO ACTION LISTENER////////////////////////////////////////
   frame.setLayout(null);
   frame.getContentPane().setBackground(Color.BLACK);
   frame.setResizable(false);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);

  } 
  //|$$$$$$$$$$$$$$$$$$$$$$$||Getter method for all the components||$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$/
      
     //getter method for name

  
  public String getStudentName(){
      String studentname=studentNameTf.getText();
      if(studentname.equals("")){
          JOptionPane.showMessageDialog(studentPanel,"PLease select your name");
      }
      return studentname;          
  }
  //getter method for date of birth
  public String getStudentDateOfBirth(){
      String year=yearDobComboBox.getSelectedItem().toString();
      String month=monthDobComboBox.getSelectedItem().toString();
      String day=dayDobComboBox.getSelectedItem().toString();
      String dateOfBirth=null;
      //turn it into 
      //if(year.equals("Year")||month.equals("Month")||day.equals("Day")
      if(year.equals("Year")||month.equals("Month")||day.equals("Day")){
          dateOfBirth=null;
      }
      else{
       dateOfBirth=
          year+"\n"+
          month+"\n"+
          day+"\n"
      ;
      }
      return dateOfBirth;
  }
  //getter method for courseName
  public String getStudentCourseName(){
    String studentCourseName=courseNametf.getText();
    if(studentCourseName.equals("")){
      JOptionPane.showMessageDialog(studentPanel,"Select Your CourseName");
    }
    return studentCourseName;
  }
  //getter method for get EnrollmentID
  public int getStudentEnrollmentId(){
    int newStudentEnrollmentId=INVALID;
    String studentenrollmentId=enrollmentIdtf.getText().trim();
    try{
      newStudentEnrollmentId=Integer.parseInt(studentenrollmentId);
      if(newStudentEnrollmentId<=0){
        newStudentEnrollmentId=INVALID;
      }
      else{
        return newStudentEnrollmentId;
      }
    }     
    catch(NumberFormatException e){

    }
    return newStudentEnrollmentId;
  }
  //getter method for dateOfEnrollment
  public String getStudentDateOfEnrollment(){
      String year=yearDoeComboBox.getSelectedItem().toString();
      String month=monthDoeComboBox.getSelectedItem().toString();
      String day=dayDoeComboBox.getSelectedItem().toString();
      String dateOfEnrollment=null;
      //turn it into 
      //if(year.equals("Year")||month.equals("Month")||day.equals("Day")
      if(year.equals("Year")||month.equals("Month")||day.equals("Day")){
          dateOfEnrollment=null;
      }
      else{
       dateOfEnrollment=
          year+"\n"+
          month+"\n"+
          day+"\n"
      ;
      }
      return dateOfEnrollment;
  }
  //getter method for courseDuration
    public int getStudentCourseDuration(){
    int newStudentCourseDuration=INVALID;
    String studentCourseDuration=courseDurationtf.getText().trim();
    try{
      newStudentCourseDuration=Integer.parseInt(studentCourseDuration);
      if(newStudentCourseDuration<=0){
        newStudentCourseDuration=INVALID;
      }
      else{
        return newStudentCourseDuration;
      }
    }     
    catch(NumberFormatException e){

    }
    return newStudentCourseDuration;
  }
  //getter method for tuitionFee
  public int getStudentTuitionFee(){
    int newStudentTuitionFee=INVALID;
    String StudentTuitionFee=tuitionFeetf.getText().trim();
    try{
      newStudentTuitionFee=Integer.parseInt(StudentTuitionFee);
      if(newStudentTuitionFee<=0){
        newStudentTuitionFee=INVALID;
      }
      else{
        return newStudentTuitionFee;
      }
    }     
    catch(NumberFormatException e){

    }
    return newStudentTuitionFee;
  }
  /////////////////////////////working with regularPanel getter methodl///////////////////////////////////////////////////////
  //getter method for numofModules
  public int getRegularNumOfModules(){
    int newRegularNumOfModules=INVALID;
    String regularNumOfModules=numOfModulestf.getText().trim();
    try{
      newRegularNumOfModules=Integer.parseInt(regularNumOfModules);
      if(newRegularNumOfModules<=0){
        newRegularNumOfModules=INVALID;
      }
      else{
        return newRegularNumOfModules;
      }
    }     
    catch(NumberFormatException e){

    }
    return newRegularNumOfModules;
  }
  //getter method for numOfCreditHours
  public int getRegularNumOfCreditHours(){
    int newRegularNumOfCreditHours=INVALID;
    String regularNumOfCreditHours=numOfCreditHourstf.getText().trim();
    try{
      newRegularNumOfCreditHours=Integer.parseInt(regularNumOfCreditHours);
      if(newRegularNumOfCreditHours<=0){
        newRegularNumOfCreditHours=INVALID;
      }
      else{
        return newRegularNumOfCreditHours;
      }
    }     
    catch(NumberFormatException e){

    }
    return newRegularNumOfCreditHours;
  }
  //getter method for regularEnrollmentId
  public int getRegularEnrollmentId(){
    int regularEnrollmentId=INVALID;
    String regularEnrollmentID1=regularEnrollmentIdtf.getText().trim();
    try{
      regularEnrollmentId=Integer.parseInt(regularEnrollmentID1);
      if(regularEnrollmentId<=0){
        regularEnrollmentId=INVALID;
      }
      else{
        return regularEnrollmentId;
      }
    }
    catch(NumberFormatException e){
      //
    }
    return regularEnrollmentId;
  }


  //calculate regular days present
  public int getRegularDaysPresent(){
    int newRegularDaysPresent=INVALID;
    String regularDaysPresent=numOfDaysPresenttf.getText().trim();
    try{
      newRegularDaysPresent=Integer.parseInt(regularDaysPresent);
      if(newRegularDaysPresent<=0){
        newRegularDaysPresent=INVALID;
      }
      else{
        return newRegularDaysPresent;
      }
    }     
    catch(NumberFormatException e){
        
    }
    return newRegularDaysPresent;
  }

  ////////////////////////working with dropoutPanel getter method/////////////////////////////////////////////////////////////////
    public int getNumberOfRemainingModules(){
    int newRemainingModules=INVALID;
    String remainingModules=numOfRemainingModulestf.getText().trim();
    try{
      newRemainingModules=Integer.parseInt(remainingModules);
      if(newRemainingModules<=0){
        newRemainingModules=INVALID;
      }
      else{
        return newRemainingModules;
      }
    }     
    catch(NumberFormatException e){

    }
    return newRemainingModules;
  }
  public int getNumberOfMonthsAttended(){
    int newNumOfMonthsAttended=INVALID;
    String remainingModules=numOfMonthsAttendedtf.getText().trim();
    try{
      newNumOfMonthsAttended=Integer.parseInt(remainingModules);
      if(newNumOfMonthsAttended<=0){
        newNumOfMonthsAttended=INVALID;
      }
      else{
        return newNumOfMonthsAttended;
      }
    }     
    catch(NumberFormatException e){

    }
    return newNumOfMonthsAttended;
  }
  //getter method for dateOfDropout
  public String getDateOfDropout(){
      String year=yearDodComboBox.getSelectedItem().toString();
      String month=monthDodComboBox.getSelectedItem().toString();
      String day=dayDodComboBox.getSelectedItem().toString();
      String dateOfDropout=null;
      //turn it into 
      //if(year.equals("Year")||month.equals("Month")||day.equals("Day")
      if(year.equals("Year")||month.equals("Month")||day.equals("Day")){
          dateOfDropout=null;
      }
      else{
       dateOfDropout=
          year+"\n"+
          month+"\n"+
          day+"\n"
      ;
      }
      return dateOfDropout;
  }
 


  //getter method for dropoutEnrollmentId
  public int getDropoutEnrollmentId(){
    int newDropoutEnrollmentId=INVALID;
    String dropoutEnrollmentId=dropoutEnrollmentIdtf.getText().trim();
    try{
      newDropoutEnrollmentId=Integer.parseInt(dropoutEnrollmentId);
      if(newDropoutEnrollmentId<=0){
        newDropoutEnrollmentId=INVALID;
      }
      else{
        return newDropoutEnrollmentId;
      }
    }
    catch(NumberFormatException e){

    }
    return newDropoutEnrollmentId;
  }
  //creating a method which check uniqueness of the enrollment if for regular 
  public boolean checkUniquere(int eId){
    boolean isUnique=false;
    for(Student stuObj:studental){
      if(stuObj instanceof Regular){
          Regular regObj=(Regular) stuObj;
          if(eId==regObj.getEnrollmentID()){
            isUnique=true;
            break;
          }
      }
    }
    return isUnique;
  }
  //creating a method which check uniqueness of the enrollment if for Dropout
  public boolean checkUniquedrop(int eId){
    boolean isUnique=false;
    for(Student obj:studental){
      if(obj instanceof Dropout){
      Dropout dropObj=(Dropout) obj;
      if(eId==dropObj.getEnrollmentID()){
        isUnique=true;
        break;
      }
     }
    }
    return isUnique;
  }
  


  















   public static void main(String args[]){
    Main object=new Main();
   }
}




//creating Student class
class Student{
  private String studentName;
  private String dateOfBirth;
  private String courseName;
  private int enrollmentId;
  private String dateOfEnrollment;
  private int courseDuration;
  private int tuitionFee;
  public Student(String studentName,String dateOfBirth,String courseName,int enrollmentId,String dateOfEnrollment,int courseDuration,int tuitionFee){
    this.studentName=studentName;
    this.dateOfBirth=dateOfBirth;
    this.courseName=courseName;
    this.enrollmentId=enrollmentId;
    this.dateOfEnrollment=dateOfEnrollment;
    this.courseDuration=courseDuration;
    this.tuitionFee=tuitionFee;
  }
  public String getDateOfBirth(){
    return dateOfBirth;
  }
  public String getStudentName(){
    return studentName;
  }
  public String getDateOfEnrollment(){
    return dateOfEnrollment;
  }
  public int getEnrollmentID(){
    return enrollmentId;
  }
  public int getCourseDuration(){
    return courseDuration;
  }
  public int getTuitionFee(){
    return tuitionFee;
  }

  //setter method
    //creating a setter method to set the value of dateOfBirth
  public void setDateOfBirth(String dateOfBirth)
    {
       this.dateOfBirth=dateOfBirth;
    }
    //creating a setter method to set the value of courseName
  public void setCourseName(String courseName)
    {
       this.courseName=courseName;
    }
     //creating a setter method to set the value of studentName
  public void setStudentName(String studentName)
    {
       this.studentName=studentName;
    }  
    //creating a setter method to set the value of dateOfEnrollment
  public void setDateOfEnrollment(String dateOfEnrollment)
    {
       this.dateOfEnrollment=dateOfEnrollment;
    }
     //creating a setter method to set the value of enrollmentID
  public void setEnrollmentID(int enrollmentID)
    {
      this.enrollmentId=enrollmentID;
    }
    //creating a setter method to set the value of courseDuration
  public void setCourseDuration(int courseDuration)
    {
     this.courseDuration=courseDuration;
    }
  //creating a setter method to set the value of tuitionFee
  public void setTuitionFee(int tuitionFee)
    {
       this.tuitionFee=tuitionFee;
    }


  public void display(){
    System.out.println("Student Name is "+studentName+"\n");
    System.out.println("Date of Birth is "+dateOfBirth+"\n");
    System.out.println("Course Name is "+courseName+"\n");
    System.out.println("Enrollment Id is "+enrollmentId+"\n");
    System.out.println("Date Of Enrollment is "+dateOfEnrollment+"\n");
    System.out.println("Course Duration is "+courseDuration+"\n");
    System.out.println("Tuition Fee is "+tuitionFee+"\n");
  }
}

class Regular extends Student{
  private int numOfModules;
  private int numOfCreditHours;
  private int regularEnrollmentId;
  private double daysPresent;
  private boolean isGrantedScholarship=false;
  
  public Regular(String studentName,String dateOfBirth,String courseName,int enrollmentId,String dateOfEnrollment,int courseDuration,int tuitionFee,int numOfModules,int regularEnrollmentId,int numOfCreditHours,double daysPresent){
    super(studentName,dateOfBirth,courseName,enrollmentId,dateOfEnrollment,courseDuration,tuitionFee);
    setCourseName(courseName);
    setEnrollmentID(enrollmentId);
    setDateOfEnrollment(dateOfEnrollment);
    this.numOfModules=numOfModules; 
    this.numOfCreditHours=numOfCreditHours; 
    this.daysPresent=daysPresent;
    this.regularEnrollmentId=regularEnrollmentId;
    this.isGrantedScholarship=false;
  }
   //creating a getter method to return value of numOfModules
  public int getNumOfModules()
    {
      return numOfModules;
      }
  //creating a getter method to return the value of numOfCreditHours
  public int getNumOfCreditHours()
    {
      return numOfCreditHours;
      }
  //creating a getter method to return the value of daysPresent
  public double getDaysPresent()
    {
      return daysPresent;
      }
  //creating a getter method to return the value of isGrantedScholarhip
  public boolean getIsGrantedScholarship()
    {
      return isGrantedScholarship;
     }

    public char getPresentPercentage(double numOfDaysPresent){
      this.daysPresent=numOfDaysPresent;
      char grade=' ';
      double presentPercentage=(this.daysPresent/30/getCourseDuration()*100);
      if(presentPercentage>=80&&presentPercentage<=100){
        this.isGrantedScholarship=true;
        grade='A';
      }
      else if(presentPercentage>=60&&presentPercentage<=79){
        grade='B';
      }
      else if(presentPercentage>=40&&presentPercentage<=59){
        grade='C';
      }
      else if(presentPercentage>=20&&presentPercentage<=39){
        grade='D';
      }
      else{
        grade='E';
      }

      return grade;
  } 
  public void grantCertificate(String courseName,int enrollmentID,String dateOfEnrollment){
    double presentPercentage=(this.daysPresent/30/getCourseDuration()*100);
    System.out.println("Course Name is "+courseName);
    System.out.println("EnrollmentId is "+enrollmentID);
    System.out.println("Date of enrollment is "+dateOfEnrollment);
    System.out.println("Student has graduated");
    if(isGrantedScholarship==true){
      System.out.println("The scholarship has been granted");
    }
  }
  public void regularDisplay(){
    super.display();
    System.out.println("Number of Modules is "+numOfModules+"\n");
    System.out.println("\nNumber of Credit Hours is "+numOfCreditHours);
    System.out.println("\nRegular Enrollment Id is :"+regularEnrollmentId);
    System.out.println("\nDays Present is "+daysPresent);
  }
}
class Dropout extends Student {
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private int dropoutEnrollmentId;
    private boolean hasPaid;

    public Dropout(String studentName, String dateOfBirth, String courseName, int enrollmentId, 
                   String dateOfEnrollment, int courseDuration, int tuitionFee, 
                   int numOfRemainingModules, int numOfMonthsAttended, int dropoutEnrollmentId, 
                   String dateOfDropout) {

        super(studentName, dateOfBirth, courseName, enrollmentId, dateOfEnrollment, courseDuration, tuitionFee);
        setEnrollmentID(enrollmentId);
        setCourseName(courseName);
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dropoutEnrollmentId = dropoutEnrollmentId;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount=0;
        this.hasPaid=false;
    }

    public void billsPayable() {
        if (this.hasPaid==false) {
            if (super.getCourseDuration() >= numOfMonthsAttended) {
                this.remainingAmount = (super.getCourseDuration() - numOfMonthsAttended) *super.getTuitionFee();
                this.hasPaid = true;
                System.out.println("The bills are paid, no pending amount");
            } else {
                System.out.println("Remaining amount cannot be calculated....");
            }
        } else {
            System.out.println("All bills are cleared out...");
        }
    }

    public void removeDropoutStudent() {
        if (this.hasPaid==true) {
            setCourseDuration(0);
            setCourseName("");
            setDateOfBirth("");
            setDateOfEnrollment("");
            setEnrollmentID(0); 
            setStudentName("");
            setTuitionFee(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.dateOfDropout = "";
            this.remainingAmount = 0;
            this.hasPaid = false;
            System.out.println("All details are cleared");
        } else {
            System.out.println("All bills not cleared");
        }
    }
    
    public void display() {
        super.display();
        System.out.println("Number of Remaining Modules: " + numOfRemainingModules);
        System.out.println("Number of Months Attended: " + numOfMonthsAttended);
        System.out.println("Date of Dropout: " + dateOfDropout);
        System.out.println("Dropout Enrollment Id: " + dropoutEnrollmentId);
    }

}










