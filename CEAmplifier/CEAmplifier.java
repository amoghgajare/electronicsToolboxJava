import java.awt.*;  
import java.awt.event.*; 
import java.util.Scanner; 
import javax.swing.ImageIcon;
class FindTransistorDatasheet extends Frame
{
Checkbox cb1, cb2, cb3,cb4,cb5,cb6,cb7; 
Label l;
FindTransistorDatasheet()
{
WindowListener wl = new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
dispose();
}
};
addWindowListener(wl);
l=new Label("Select a transistor number to view datasheet");
setSize (500, 700);
CheckboxGroup cbg1=new CheckboxGroup(); 
CheckboxGroup cbg2=new CheckboxGroup(); 
CheckboxGroup cbg3=new CheckboxGroup();
CheckboxGroup cbg4=new CheckboxGroup();
CheckboxGroup cbg5=new CheckboxGroup();
CheckboxGroup cbg6=new CheckboxGroup();
CheckboxGroup cbg7=new CheckboxGroup();
cb1=new Checkbox ("2N2222", cbg1, false); 
cb2=new Checkbox ("2N2907", cbg2, false); 
cb3=new Checkbox ("2N3906", cbg3, false); 
cb4=new Checkbox ("BC546", cbg4, false); 
cb5=new Checkbox ("CA3046", cbg5, false); 
cb6=new Checkbox ("MJE243", cbg6, false); 
cb7=new Checkbox ("TIP110", cbg7, false); 
setLayout(new GridLayout(8, 1)); 
add(l);      
add (cb1);
add (cb2);
add (cb3);
add (cb4);       
add (cb5);
add (cb6);
add (cb7);       
cb1.addItemListener (new itl2()); 
cb2.addItemListener (new itl2()); 
cb3.addItemListener (new itl2());
cb4.addItemListener (new itl2());
cb5.addItemListener (new itl2());
cb6.addItemListener (new itl2());
cb7.addItemListener (new itl2()); 
setVisible (true);
}
class itl2 implements ItemListener
{
public void itemStateChanged (ItemEvent ie){
Object obj=ie.getItemSelectable(); 
            Checkbox cb=(Checkbox) obj;
            if (cb.getState())
            {
                String lab=cb.getLabel();
if(lab.equalsIgnoreCase("2N2222"))
{
try{
String cmd = "cmd.exe /c start 2N2222.pdf";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
dispose();
}
}
catch(Exception e){System.out.println(e);}

}



if (lab.equalsIgnoreCase("2N2907"))
                {
try{
String cmd = "cmd.exe /c start 2N2907.pdf";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
if (lab.equalsIgnoreCase("2N3906"))
                {
                     try{
String cmd = "cmd.exe /c start 2N3906.pdf";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
if (lab.equalsIgnoreCase("BC546"))
                {
try{
String cmd = "cmd.exe /c start BC546.pdf";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
if (lab.equalsIgnoreCase("CA3046"))
                {
try{
String cmd = "cmd.exe /c start CA3046.pdf";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
if (lab.equalsIgnoreCase("MJE243"))
                {
try{
String cmd = "cmd.exe /c start MJE243.pdf";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
if (lab.equalsIgnoreCase("TIP110"))
                {
                     try{
String cmd = "cmd.exe /c start TIP110.pdf";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
        }
}
    }
} 
class Option extends Frame
{
Checkbox cb1, cb2,cb3, cb4,cb5; 
    Label l, l1;
    Option()
    {
WindowListener wl = new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
dispose();
}
};

setSize(500, 700);
setLayout (new FlowLayout()); 
CheckboxGroup cbg1=new CheckboxGroup(); 
CheckboxGroup cbg2=new CheckboxGroup(); 
cb1=new Checkbox ("Design a CE Amplifier", cbg1, false); 
cb2=new Checkbox ("Find Transistor Datasheet", cbg1, false); 
cb3=new Checkbox ("Find Resistance from Colour Code", cbg1, false);
cb4=new Checkbox ("Find LED Series Resistance", cbg1, false);
cb5=new Checkbox ("Exit");
      
add(cb1);
add(cb2);
add(cb3);
add(cb4);      
add(cb5);
       
cb1.addItemListener (new itl()); 
cb2.addItemListener (new itl()); 
cb3.addItemListener(new itl());
cb4.addItemListener(new itl());   
cb5.addItemListener (new itl()); 
addWindowListener(wl);
setVisible (true);
}
class itl implements ItemListener
{
public void itemStateChanged (ItemEvent ie){
Object obj=ie.getItemSelectable(); 
            Checkbox cb=(Checkbox) obj;
            if (cb.getState())
            {
                String lab=cb.getLabel();
                if (lab.equalsIgnoreCase("Exit"))
                {
                     System.exit(0);

                }
if (lab.equalsIgnoreCase("Design a CE Amplifier"))
                {
                     CEAmplifier c = new CEAmplifier();
c.setVisible(true);

                }
if (lab.equalsIgnoreCase("Find Resistance from Colour Code"))
                {
                  
try{
String cmd = "cmd.exe /c start exeResistor.cmd";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
if (lab.equalsIgnoreCase("Find LED Series Resistance"))
                {
                  
try{
String cmd = "cmd.exe /c start exeLED.cmd";
Runtime run = Runtime.getRuntime();
Process pr = run.exec(cmd);
pr.waitFor();
Scanner sc = new Scanner(System.in);
String line = "";
while((line=sc.nextLine())!=null){
System.out.println(line);
}
}
catch(Exception e){System.out.println(e);}

                }
if (lab.equalsIgnoreCase("Find Transistor Datasheet"))
                {
                     FindTransistorDatasheet n = new FindTransistorDatasheet();
n.setVisible(true);

                }
        }
}
    }
} 

class CEAmplifier extends Frame implements ActionListener{  
TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7; 
Label l1,l2,l3,l4,l5,l6,l7,r1,r2,r3,r4,r5,r6,r7,finalLabel;
ImageIcon a;
CEAmplifier(){  
WindowListener wl = new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
dispose();
}
};
a = new ImageIcon("circuit.jpg");
setSize(a.getIconWidth(), a.getIconHeight());
setLocationRelativeTo(null);
addWindowListener(wl);
setVisible(true);
finalLabel = new Label();
l1 = new Label(); 
l2 = new Label(); 
l3 = new Label();
l4 = new Label();
l5 = new Label();
l6 = new Label();
l7 = new Label();
int shift = 20; 
finalLabel.setBounds(20,650,300,20);
finalLabel.setText("Developed by Amogh Gajare - OOPM Mini Project");
l1.setBounds(20,50+shift,170,20);
l2.setBounds(20,80+shift,170,20);
l3.setBounds(20,110+shift,170,20);
l4.setBounds(20,140+shift,170,20);
l5.setBounds(20,170+shift,170,20);
l6.setBounds(20,200+shift,170,20);
l7.setBounds(20,230+shift,170,20); 
l1.setText("hFE (\u03B2) : ");
l2.setText("Collector Supply Voltage : ");
l3.setText("Frequency : ");
l4.setText("Supply Current Rating : ");
l5.setText("Desired Current Output : ");
l6.setText("Input Circuit Resistance : ");
l7.setText("Output Circuit Resistance : ");
tf1=new TextField();
tf2=new TextField();
tf3=new TextField();
tf4=new TextField();
tf5=new TextField();
tf6=new TextField();
tf7=new TextField();  
tf1.setBounds(170,50+shift,170,20);
tf2.setBounds(170,80+shift,170,20);
tf3.setBounds(170,110+shift,170,20);
tf4.setBounds(170,140+shift,170,20);
tf5.setBounds(170,170+shift,170,20);
tf6.setBounds(170,200+shift,170,20);
tf7.setBounds(170,230+shift,170,20); 
Button b=new Button("Generate");  
b.setBounds(210,270+shift,80,30);  
b.addActionListener(this);
r1 = new Label(); 
r2 = new Label(); 
r3 = new Label();
r4 = new Label();
r5 = new Label();
r6 = new Label();
r7 = new Label();
int i=450; 
r1.setBounds(400,i+30,400,20);
r2.setBounds(400,i+60,400,20);
r3.setBounds(400,i+90,400,20);
r4.setBounds(400,i+120,400,20);
r5.setBounds(400,i+150,400,20);
r6.setBounds(400,i+180,400,20);
r7.setBounds(400,i+210,400,20);
add(finalLabel);
add(b);
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(tf5);
add(tf6);
add(tf7);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(r1);
add(r2);
add(r3);
add(r4);
add(r5);
add(r6);
add(r7);  
setSize(900,720);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e)
{  
String s1=tf1.getText(); 
String s2=tf2.getText();
String s3=tf3.getText();
String s4=tf4.getText();
String s5=tf5.getText();
String s6=tf6.getText();
String s7=tf7.getText();  
double d1=Double.parseDouble(s1);
double d2=Double.parseDouble(s2);
double d3=Double.parseDouble(s3);
double d4=Double.parseDouble(s4);
double d5=Double.parseDouble(s5);
double d6=Double.parseDouble(s6);
double d7=Double.parseDouble(s7);
double hFE=d1,Vcc=d2,f=d3,Is=d4,Io=d5,Ri=d6,Ro=d7;
double RC=0,RE=0,R2=0,CE=0,Ci=0,Co=0;
if(Io>Is)
{

tf4.setForeground(Color.red);
tf5.setForeground(Color.red);
r1.setForeground(Color.red);
r1.setText("Invalid Input");
r2.setText("");
r3.setText("");
r4.setText("");
r5.setText("");
r6.setText("");
r7.setText("");
}
else{
tf4.setForeground(Color.black);
tf5.setForeground(Color.black);
r1.setForeground(Color.black);
double Z = (6.6/Vcc);
if(Z>=9){R2=0.0;}
RC=(Vcc/(2.0*Io)); 
RE=(Vcc/(10.0*Io)); 
R2=(((1+Z)*1000.0)/(9-Z));
CE=(1/(2*3.14*f*(Vcc/(10.0*Io))));
Ci=(1/(2*3.14*f*Ri)); 
Co=(1/(2*3.14*f*Ro));
r1.setText("RC = "+RC+" Ohms");
r2.setText("RE = "+RE+" Ohms");
r3.setText("R1 = 1000 Ohms, R2 = "+R2+" Ohms");
r4.setText("C3 = "+CE+" F");
r5.setText("C1 = "+Ci+" F");
r6.setText("C2 = "+Co+" F");
r7.setText(" are the values required to design the CE Amplifier");
}
}
public void paint(Graphics g) {
super.paint(g);
g.drawImage(a.getImage(), 380, 50, this);
}  
public void reset()
{
tf1.setText("");
tf2.setText("");
tf3.setText("");
tf4.setText("");
tf5.setText("");
tf6.setText("");
tf7.setText("");
r1.setText("");
r2.setText("");
r3.setText("");
r4.setText("");
r5.setText("");
r6.setText("");
r7.setText("");
}
public static void main(String args[]){  
Option op = new Option(); 
op.setTitle("Transistor Amplifier Design Applet");
}  
} 
