package test5;
import java.util.Scanner;
 

public class ArmstrongNumber {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int number = 0;
		ATM objATM = new ATM();
		number = objATM.inputInt(sc,number);
		int temp = number;
		int d=temp;
        double count = 0,r, sum = 0; 
        while(d>0) {
        	count++;
        	d=d/10;
        }
        
      
        

		while (number > 0) {
			r = number % 10;  
			number = number / 10;  
			sum = sum + Math.pow(r,count) ;
			 
		}
		if (temp == sum)
			System.out.println("Its an Armstrong number");
		else
			System.out.println("Not an Armstrong number");
	}

}
