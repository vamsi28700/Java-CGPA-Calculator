import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GPACalculator {
    JFrame frame;   
    JInternalFrame jInternalFrame;
    JLabel headingLabel, stuNameLabel, stuIdLabel, sessionLabel, 
    stuType, courseLabel1, courseLabel2, courseLabel3, courseLabel4, 
    courseLabel5, courseLabel6;
    JCheckBox eveningCheckbox, morningCheckbox;
    JRadioButton regularRdbtn, suppli;
    JTextField course1, course2, course3, course4, course5, course6,
    stuNameTf, stuIdTf;
    JButton calculate, clear, cancel;
    JDesktopPane desktop = new JDesktopPane();
    public void createUI()
    {
        frame = new JFrame("GPA Calculator");
        //frame.setLayout(new BorderLayout());
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        headingLabel = new JLabel("Welcome To GPA Calculator");
        headingLabel.setBounds(10, 10, 200, 20);

        stuNameLabel = new JLabel("Student Name");
        stuNameLabel.setBounds(30, 30, 100, 20);

        stuNameTf = new JTextField();
        stuNameTf.setBounds(130, 30, 100, 20);

        stuIdLabel = new JLabel("ID");
        stuIdLabel.setBounds(270, 30, 20, 20);

        stuIdTf = new JTextField();
        stuIdTf.setBounds(290, 30, 100, 20);

        sessionLabel = new JLabel("Stream");
        sessionLabel.setBounds(30, 60, 80, 20);

        eveningCheckbox = new JCheckBox("CSE");
        eveningCheckbox.setBounds(110, 60, 80, 20);

        morningCheckbox = new JCheckBox("ECE");
        morningCheckbox.setBounds(190, 60, 80, 20);

        stuType = new JLabel("Student Type");
        stuType.setBounds(30, 90, 80, 20);

        regularRdbtn = new JRadioButton("Regular");
        regularRdbtn.setBounds(110, 90, 80, 20);

        suppli = new JRadioButton("Supplimentary");
        suppli.setBounds(190, 90, 140, 20);

        courseLabel1 = new JLabel("Course1");
        courseLabel1.setBounds(30, 120, 60, 20);

        course1 = new JTextField();
        course1.setBounds(90, 120, 100, 20);

        courseLabel2 = new JLabel("Course2");
        courseLabel2.setBounds(200, 120, 60, 20);

        course2 = new JTextField();
        course2.setBounds(260, 120, 100, 20);

        courseLabel3 = new JLabel("Course3");
        courseLabel3.setBounds(30, 150, 60, 20);

        course3 = new JTextField();
        course3.setBounds(90, 150, 100, 20);

        courseLabel4 = new JLabel("Course4");
        courseLabel4.setBounds(200, 150, 60, 20);

        course4 = new JTextField();
        course4.setBounds(260, 150, 100, 20);

        courseLabel5 = new JLabel("Course5");
        courseLabel5.setBounds(30, 180, 60, 20);

        course5 = new JTextField();
        course5.setBounds(90, 180, 100, 20);

        courseLabel6 = new JLabel("Course6");
        courseLabel6.setBounds(200, 180, 60, 20);

        course6 = new JTextField();
        course6.setBounds(260, 180, 100, 20);
  calculate = new JButton("Calculate");
        calculate.setBounds(80, 230, 100, 20);
        calculate.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae)
            {
                displayStudentRecord();
            }
        });

        clear = new JButton("Clear");
        clear.setBounds(190, 230, 80, 20);
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                resetFields();
            }
        });
cancel = new JButton("Cancel");
        cancel.setBounds(280, 230, 80, 20);
        cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                closeFrame();
            }
        });
frame.add(headingLabel);
        frame.add(stuNameLabel);
        frame.add(stuNameTf);
        frame.add(stuIdLabel);
        frame.add(stuIdTf);
        frame.add(sessionLabel);
        frame.add(eveningCheckbox);
        frame.add(morningCheckbox);
        frame.add(stuType);
        frame.add(regularRdbtn);
        frame.add(suppli);
        frame.add(courseLabel1);
        frame.add(course1);
        frame.add(courseLabel2);
        frame.add(course2);
        frame.add(courseLabel3);
        frame.add(course3);
        frame.add(courseLabel4);
        frame.add(course4);
        frame.add(courseLabel5);
        frame.add(course5);
        frame.add(courseLabel6);
        frame.add(course6);
        frame.add(calculate);       
        frame.add(clear);
        frame.add(cancel);

        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,400);
    }
public JCheckBox checkboxName()
    {
        JCheckBox ckbox = null;
        if(eveningCheckbox.isSelected())
        {
            ckbox = eveningCheckbox;
        }
        else if(morningCheckbox.isSelected())
        {
            ckbox = morningCheckbox;
        }

        return ckbox;
    }

    public JRadioButton radioButtonName()
    {
        JRadioButton radioBtn = null;
        if(regularRdbtn.isSelected())
        {
            radioBtn = regularRdbtn;
        }
        else if(suppli.isSelected())
        {
            radioBtn = suppli;
        }

        return radioBtn;
    }
public String getGPA()
    {
        int A = 0, BP = 0, B = 0, CP = 0, C = 0, DP = 0, D = 0, F = 0;
        String[] g = new String[6];
        int j=0;
        float marks = 0;
        double avg = 0, total=0;
        String[] arr = new String[]{"a","b+","b","c+","c","d+","d","f"};
        String gpa = "";
        String grade ="";
        String c1 = course1.getText();
        String c2 = course2.getText();
        String c3 = course3.getText();
        String c4 = course4.getText();
        String c5 = course5.getText();
        String c6 = course6.getText();      
        for(int i = 0;i<8;i++)
        {
  if(c1.equalsIgnoreCase(arr[i]))
  {
    g[j] = arr[i];
    ++j;
  }
  if(c2.equalsIgnoreCase(arr[i]))
  {
    g[j] = arr[i];
    ++j;
  }
  if(c3.equalsIgnoreCase(arr[i]))
  {
    g[j] = arr[i];    
    ++j;
  }
  if(c4.equalsIgnoreCase(arr[i]))
  {
    g[j] = arr[i];
    ++j;
  }
  if(c5.equalsIgnoreCase(arr[i]))
  {
    g[j] = arr[i];
    ++j;
  }
  if(c6.equalsIgnoreCase(arr[i]))
  {
    g[j] = arr[i];
    ++j;
  }
        }  
        for(int i=0;i<6;i++)
        {
  if(g[i] == "a")
  {
    marks+=5;
  }
  else if(g[i] == "b+")
  {
    marks+=4.5;
  }
  else if(g[i] == "b")
  {
    marks+=4;
  }
  else if(g[i] == "c+")
  {
    marks+=3.5;
  }
  else if(g[i] == "c")
  {
    marks+=3;
  }
  else if(g[i] == "d+")
  {
    marks+=2.5;
  }
  else if(g[i] == "d")
  {
    marks+=2;
  }
  else
  {
    marks+=0;  
  }
       }
       avg = marks/6;
       if(avg == 5)
       {
  gpa = "a";
       }
       else if(avg > 4.5 && avg <5)
       {
  gpa = "b+";
       }
       else if(avg > 3.5 && avg <=4.5)
       {
  gpa = "b";
       }
       else if(avg > 3 && avg <=3.5)
       {
  gpa = "c+";
       }
       else if(avg > 2.5 && avg <=3)
       {
  gpa = "c";
       }
       else if(avg > 2 && avg <=2.5)
       {
  gpa = "d+";
       }
       else if(avg > 1 && avg <=2)
       {
  gpa = "d";
       }
       else
       {
  gpa ="f";
       }
        return gpa;         
    }
  public void displayStudentRecord()
      {
        jInternalFrame = new JInternalFrame("Student Record", true, true, true, true);
        jInternalFrame.setBounds(50, 50, 400, 250);
        jInternalFrame.setVisible(true);

        String stuName = stuNameTf.getText();
        String stuId = stuIdTf.getText();
        String checkboxValue = checkboxName().getText();
        String radioBtnValue = radioButtonName().getText();
        String stuGpaValue = getGPA();

        JLabel stuNameLabel = new JLabel("Name");
        JLabel name = new JLabel();
        name.setText(stuName);
        stuNameLabel.setBounds(20, 20, 80, 20);
        name.setBounds(130, 20, 150, 20);

        JLabel stuIdLabel = new JLabel("ID");
        JLabel id = new JLabel();
        id.setText(stuId);
        stuIdLabel.setBounds(20, 40, 30, 20);
        id.setBounds(130, 40, 100, 20);

        JLabel ckLabel = new JLabel("Session");
        JLabel ckValue = new JLabel();
        ckValue.setText(checkboxValue);
        ckLabel.setBounds(20, 60, 80, 20);
        ckValue.setBounds(130, 60, 100, 20);
JLabel rdLabel = new JLabel("Student Type");
        JLabel rdValue = new JLabel();
        rdValue.setText(radioBtnValue);
        rdLabel.setBounds(20, 80, 110, 20);
        rdValue.setBounds(130, 80, 100, 20);

        JLabel gpLabel = new JLabel("GPA");
        JLabel gpValue = new JLabel();
        gpValue.setText(stuGpaValue);
        gpLabel.setBounds(20, 100, 30, 20);
        gpValue.setBounds(130, 100, 20, 20);

        jInternalFrame.add(stuNameLabel);
        jInternalFrame.add(name);
        jInternalFrame.add(stuIdLabel);
        jInternalFrame.add(id);
        jInternalFrame.add(ckLabel);
        jInternalFrame.add(ckValue);
        jInternalFrame.add(rdLabel);
        jInternalFrame.add(rdValue);
        jInternalFrame.add(gpLabel);
        jInternalFrame.add(gpValue);

        desktop.add(jInternalFrame);
        frame.setContentPane(desktop);
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
    }

    public void resetFields()
    {
        stuNameTf.setText("");
        stuIdTf.setText("");
        course1.setText("");
        course2.setText("");
        course3.setText("");
        course4.setText("");
        course5.setText("");
        course6.setText("");        
    }

    public void closeFrame()
    {
        frame.dispose();
    }
    public static void main(String args[])
    {
        GPACalculator cal = new GPACalculator();
        cal.createUI();
    }
}