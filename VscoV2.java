import java.awt.*;
import javax.swing.*;

public class VscoV2 extends Vsco{
    protected JLabel nameLabel,heightLabel,weightLabel,dateLabel,typeLabel;
    protected JTextField nameTxtField,hTxtF,wTxtF,dateTxtF,tTxtF;
    protected JPanel radioPanel,overallPanel;
	protected JPanel txtPanel;
    protected JRadioButton student,teacher;
    protected ButtonGroup rediGroup;
    final int TXTFIELD_WIDTH = 15;
    // set title of program
    public VscoV2(String title) {
        super(title);
    }

    protected void setFrameFeatures() {
        super.setFrameFeatures();
        this.setLocationRelativeTo(null);
    }
        

    protected void addComponents() {
        super.addComponents();
        
        //create label with the text element
        nameLabel = new JLabel("Name:");
        heightLabel = new JLabel("Height(cm.): ");
        weightLabel = new JLabel("Weight(kg.): ");
        dateLabel = new JLabel("Date of birth (eg.,31-01-1990):");
        //create text field and set width
        nameTxtField = new JTextField(TXTFIELD_WIDTH);
        hTxtF = new JTextField(TXTFIELD_WIDTH);
        wTxtF = new JTextField(TXTFIELD_WIDTH);
        dateTxtF = new JTextField(TXTFIELD_WIDTH);
        //create radiobutton , buttongroup and radiopanel for keep the valeus 
        ButtonGroup choices = new ButtonGroup();
        typeLabel = new JLabel("Type:");
        radioPanel = new JPanel();
        student = new JRadioButton("Student");
        teacher = new JRadioButton("Teacher");
        choices.add(student);
        choices.add(teacher);
        radioPanel.add(student);
        radioPanel.add(teacher);

        //create txtPanel keep label, textfield, radiopanel 
        txtPanel = new JPanel();
        txtPanel.add(nameLabel);
        txtPanel.add(nameTxtField);
        txtPanel.add(heightLabel);
        txtPanel.add(hTxtF);
        txtPanel.add(weightLabel);
        txtPanel.add(wTxtF);
        txtPanel.add(dateLabel);
        txtPanel.add(dateTxtF);
        txtPanel.add(typeLabel);
        txtPanel.add(radioPanel);
        //Creating a GridLayout container for  txtPanel interface setting
        txtPanel.setLayout(new GridLayout(5,2)); 
        //create overallPanel keep include all panels
        overallPanel = new JPanel();
        overallPanel.setLayout(new BorderLayout());
        overallPanel.add(txtPanel);
        overallPanel.add(buttonsPanel, BorderLayout.SOUTH);
        this.setContentPane(overallPanel);
    }

    public static void createAndShowGUI(){
        VscoV2 personFormV1 = new VscoV2("Person Form V1");
        personFormV1.addComponents();
        personFormV1.setFrameFeatures();
    }

    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            createAndShowGUI();
        }
    });
    }
}