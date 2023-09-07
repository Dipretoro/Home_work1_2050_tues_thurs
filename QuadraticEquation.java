/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:Andrew Dipretoro
 * Description: Homework 01 - QuadraticEquation
 */
import java.util.*;
import java.lang.*;
public class QuadraticEquation {
	private  double a;
	private  double b;
	private  double c;
	private  double d;
    public  final static double PRECISION = 0.00001;
    Scanner scan = new Scanner(System.in);
    
 public  QuadraticEquation (double a, double b ,double c) {try {
	   if (a>PRECISION) {
		   this.a = a;
		   this.b=b;
		   this.c=c;
				   
	   }
	 
	} catch (Exception ex) {
	    System.err.println("error ");
	}
	
	 

 }
               
     
	 
	 
 
public static void main(String[] args) throws Exception {
	QuadraticEquation qe = new QuadraticEquation(0, 0, 0);
	qe.prompt();
	System.out.println("first number "+);
}
public void prompt() {
	System.out.println("Please enter a ");
	a= scan.nextDouble();
	System.out.println("Please enter b ");
	b= scan.nextDouble();
	System.out.println("Please enter c ");
	c= scan.nextDouble();
	
}
private  double delta() {
	b =Math.pow(b, 2);
	
	return b-4*a*c;
	
}
public double firstRoot()throws Exception {
    if (delta()<0) {
       System.out.println("no root");
    } 
	
			
return	-b +Math.sqrt(delta())/(2*a);
	
    
	
	
}
public double secondRoot() throws Exception {
	 if (delta()<0) {
	       System.out.println("no root");
	    } 
		
				
	return	b +Math.sqrt(delta())/(2*a);
		
	
}
public Boolean hasRoots() {
	// TODO Auto-generated method stub
	if(delta()>=0) {
		
	
	return true;

}
	return false;
	}



public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public double getC() {
	return c;
}
public void setC(double c) {
	this.c = c;
}

}

