import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
public class OhmCalc extends JPanel
{
    JPanel entryPanel;//Panel containing textboxes for entering band colors
    String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};
    String[] tolerances = {"gold", "silver", "colorless"};
    
    JComboBox bandAList = new JComboBox(colors); //Drop-down list of possible colors for band A
    JComboBox bandBList = new JComboBox(colors); //Drop-down list of possible colors for band B
    JComboBox bandCList = new JComboBox(colors); //Drop-down list of possible colors for band C
    JComboBox bandDList = new JComboBox(tolerances); //Drop-down list of possible colors for tolerance band
    
    JTextArea result;//Text area that displays the resistance value of the resistor
    
    //Labels for the textfields
    JLabel bandALabel;
    JLabel bandBLabel;
    JLabel bandCLabel;
    JLabel bandDLabel;
    JLabel resultLabel;
    
    JButton submit;//button to submit band colors to obtain resistance
    JButton clear;//button to clear the textfields
        
    public OhmCalc()
    {
        entryPanel = new JPanel();
        result = new JTextArea(40,40);
        resultLabel = new JLabel("Resistance (in ohms): ");
        bandALabel = new JLabel("Band A ");
        bandBLabel = new JLabel("Band B ");
        bandCLabel = new JLabel("Band C ");
        bandDLabel = new JLabel("Band D (tolerance) ");
        submit = new JButton("Submit");
        clear = new JButton("Clear");
        
        setPreferredSize(new Dimension(400,400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        entryPanel.setPreferredSize(new Dimension(100,200));
        entryPanel.setLayout(new BoxLayout(entryPanel, BoxLayout.Y_AXIS));
        add(entryPanel);
        
        entryPanel.add(bandALabel);
        entryPanel.add(bandAList);
        add(Box.createRigidArea(new Dimension(0,10)));
        entryPanel.add(bandBLabel);
        entryPanel.add(bandBList);
        add(Box.createRigidArea(new Dimension(0,10)));
        entryPanel.add(bandCLabel);
        entryPanel.add(bandCList);
        add(Box.createRigidArea(new Dimension(0,10)));
        entryPanel.add(bandDLabel);
        entryPanel.add(bandDList);
        
        add(Box.createRigidArea(new Dimension(0,10)));
        add(resultLabel);
        add(result);
        add(Box.createRigidArea(new Dimension(0,10)));
        add(submit);
        add(Box.createRigidArea(new Dimension(0,10)));
        add(clear);
        
        
        submit.addActionListener(new SubmitListener());
        clear.addActionListener(new ClearListener());
    }
    
    private class SubmitListener implements ActionListener
    {
        //Returns the digit value of the band color
        public int r(String band)
        {
            if(band.equals("black"))
            {
                return 0;
            }
            else if(band.equals("brown"))
            {
                return 1;
            }
            else if(band.equals("red"))
            {
                return 2;
            }
            else if(band.equals("orange"))
            {
                return 3;
            }
            else if(band.equals("yellow"))
            {
                return 4;
            }
            else if(band.equals("green"))
            {
                return 5;
            }
            else if(band.equals("blue"))
            {
                return 6;
            }
            else if(band.equals("violet") || band.equals("purple"))
            {
                return 7;
            }
            else if(band.equals("grey") || band.equals("gray"))
            {
                return 8;
            }
            else if(band.equals("white"))
            {
                return 9;
            }
            else
            {
                return -1;
            }
        }
        
        public int tolErrorRec(String band)
        //Used to check the tolerance band text input for error
        {
            if(band.equals("gold"))
            {
                return 0;
            }
            else if(band.equals("silver"))
            {
                return 1;
            }
            else if(band.equals("colorless"))
            {
                return 2;
            }
            else{
                return -1;
            }
        }
        
        public void actionPerformed(ActionEvent e)
        {
            try{
                String bA = (String)bandAList.getSelectedItem();
                String bB = (String)bandBList.getSelectedItem();
                String bC = (String)bandCList.getSelectedItem();
                String bD = (String)bandDList.getSelectedItem();
                
                if((r(bA) == -1) || (r(bB) == -1) || (r(bC) == -1) || (tolErrorRec(bD) == -1))
                //Checks the input text for error
                {
                    JOptionPane.showMessageDialog(null, "There is an error in the text.");
                }
                else{
                    double rC = Math.pow(10, r(bC)); //obtains the exponent of the resistance value
                    double resistance = ((r(bA)*10)+r(bB))*rC; //calculates the resistance value
                    
                    int tolerance = 0;
                    if(bD.equals("gold"))
                    {
                        tolerance += 5;
                    }
                    else if(bD.equals("silver"))
                    {
                        tolerance += 10;
                    }
                    else if(bD.equals("colorless"))
                    {
                        tolerance += 20;
                    }
             
                
                    result.setText("Resistance = "+resistance+" ohms");
                    result.setText(result.getText()+"\nTolerance = +/- "+tolerance+"%");
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "There is an error in the text.");
            }
        }
    }
    
    
    private class ClearListener implements ActionListener
    {
        //Clears the result text area
        public void actionPerformed(ActionEvent e)
        {
           result.setText("");
        }
    }
    
    public static void main(String[] args)
    {
       JFrame frame = new JFrame ("Resistor Calculator");
       frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(new OhmCalc());
       frame.pack();
       frame.setVisible(true);
    }
}