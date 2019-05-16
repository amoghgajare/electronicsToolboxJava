import java.io.*;
import java.util.Scanner;
public class GenerateValues{
public static void main(String args[]){
double hFE,Vcc,f,Is,Io,Ri,Ro;
double RC=0,RE=0,R2=0,CE=0,Ci=0,Co=0;
double Z = (6.6/Vcc);
if(Z>=9){R2=0.0;}
System.out.println(Vcc/(2.0*Io)); 
System.out.println(Vcc/(10.0*Io)); 
System.out.println(((1+Z)*1000.0)/(9-Z));
System.out.println(1/(2*3.14*f*(Vcc/(10.0*Io))));
System.out.println(1/(2*3.14*f*Ri)); 
System.out.println(1/(2*3.14*f*Ro));
}
}
