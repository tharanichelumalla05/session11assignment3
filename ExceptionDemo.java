/* here we are showing the exception which occurs when we try to implement multiple methods */
package session11; //here it is the package assignment11

public class ExceptionDemo { //here i have taken the class as ExceptionDemo
 
	public static void main(String[]args){
		// TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
	
	
		
             void  doSomething(){   
            	 //in the main method i have taken another method doSomething
            	 //void as no return type
            	 
            	 int firstNum =12,secondNum = 20;    //which prints something in it
            	 int sum = firstNum + secondNum;//initailizing first and second numbers
            	            System.out.println("sum :"+sum);
            	            //system is used to return code
            	            //out is a static number
            	            //println is used to print text and gives output
            	           
             
            	   void doMore(){           //in this method i try to take one more method doMore
            		   
            		   int dividend =20,divisor = 0;                //in this I'm showing dividing the integer number with zero
            		   int divide = dividend /divisor;
            		   System.out.println("the output is :" +divide);
            		   //system is used to return code
       	            //out is a static number
       	            //println is used to print text and gives output
       	           
            		   //now it shows an error in the line 8 which is e
            		   
            	   }
             
             
}
}
