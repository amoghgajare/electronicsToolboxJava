import java.awt.*;  
import java.awt.event.*; 
import java.util.Scanner; 
import javax.swing.ImageIcon;
import java.awt.Choice;
class LEDCKT extends Frame implements ActionListener{  
TextField tf1; 
Label l1,l2,l3,l4;
Font f = new Font("Arial",Font.BOLD,14);
ImageIcon a;
Choice colorlist;
Button b;
LEDCKT(){  
WindowListener wl = new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
dispose();
}
};
tf1=new TextField();
tf1.setBounds(350,100,200,40);
colorlist=new Choice();
colorlist.add("Red");
colorlist.add("Orange");
colorlist.add("Yellow");
colorlist.add("Green");
colorlist.add("Blue");
colorlist.setBounds(350,50,200,40);
l1=new Label("");
l1.setBounds(400,410,50,30);
l1.setFont(f);
l2=new Label("LED Colour :");
l2.setBounds(250,50,100,40);
l3=new Label("Supply Voltage :");
l3.setBounds(240,100,160,40);
l4= new Label("");
l4.setBounds(280,520,50,30);
l4.setFont(f);
b=new Button("Generate Circuit");
b.setBounds(350,160,200,40);
a = new ImageIcon("circuit2.png");
setSize(500,304);
setLocationRelativeTo(null);
addWindowListener(wl);
add(tf1);
add(l1);
add(l2);
add(l3);
add(l4);
add(b);
add(colorlist);
setSize(900,720);  
setLayout(null);  
setVisible(true); 
b.addActionListener(this); 
}  
public void actionPerformed(ActionEvent e)
{ 
String data=colorlist.getItem(colorlist.getSelectedIndex());
if(data=="Red")
{
String volt=tf1.getText();
double supp = Double.parseDouble(volt);
l4.setText(volt+" V");
if(supp>2.4){
tf1.setForeground(Color.black);
double result = (supp-2.4)/(0.02);
String str = Double.toString(result);
l1.setText(str);}
else{tf1.setText("Invalid");
tf1.setForeground(Color.red);
l1.setText("");}
}

else if(data=="Orange")
{
String volt=tf1.getText();
double supp = Double.parseDouble(volt);
l4.setText(volt+" V");
if(supp>2.4){
tf1.setForeground(Color.black);
double result = (supp-2.4)/(0.02);
String str = Double.toString(result);
l1.setText(str);}
else{tf1.setText("Invalid");
tf1.setForeground(Color.red);
l1.setText("");}
}

if(data=="Yellow")
{
String volt=tf1.getText();
double supp = Double.parseDouble(volt);
l4.setText(volt+" V");
if(supp>2.2){
tf1.setForeground(Color.black);
double result = (supp-2.2)/(0.02);
String str = Double.toString(result);
l1.setText(str);}
else{tf1.setText("Invalid");
tf1.setForeground(Color.red);
l1.setText("");}
}

if(data=="Green")
{
String volt=tf1.getText();
double supp = Double.parseDouble(volt);
l4.setText(volt+" V");
if(supp>3.5){
tf1.setForeground(Color.black);
double result = (supp-3.5)/(0.02);
String str = Double.toString(result);
l1.setText(str);}
else{tf1.setText("Invalid");
tf1.setForeground(Color.red);
l1.setText("");}
}
if(data=="Blue")
{
String volt=tf1.getText();
double supp = Double.parseDouble(volt);
l4.setText(volt+" V");
if(supp>3.5){
tf1.setForeground(Color.black);
double result = (supp-3.5)/(0.02);
String str = Double.toString(result);
l1.setText(str);}
else{tf1.setText("Invalid");
tf1.setForeground(Color.red);
l1.setText("");}
}

}
public void paint(Graphics g) {
super.paint(g);
g.drawImage(a.getImage(), 300, 400, this);
}  
public static void main(String args[])
{
LEDCKT m=new LEDCKT();
m.setVisible(true);
m.setTitle("LED Circuit");
}
}