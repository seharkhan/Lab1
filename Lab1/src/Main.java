//package MainPackage; 

import org.apache.poi.formula.functions.FinanceLib;
import java.util.Scanner;

public class Main {
	
	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		double r; 
		double n; 
		double y; 
		double p; 
		double f; 
		boolean t; 
		
		Scanner avgReturn = new Scanner(System.in);
		System.out.print("What is your expected average return on investment? ");
		double i = avgReturn.nextDouble();
		
		Scanner yearsWorking = new Scanner(System.in);
		System.out.print("How many years do you plan on working? ");
		double m = yearsWorking.nextDouble();
		
		Scanner yearsRetired = new Scanner(System.in);
		System.out.print("How many years do you expect to be retired?  ");
		double d = yearsRetired.nextDouble();
		
		Scanner retiredReturn = new Scanner(System.in);
		System.out.print("What is your expected average return once you have retired? ");
		double q = retiredReturn.nextDouble();
		
		Scanner income = new Scanner(System.in);
		System.out.print("What is your required income? ");
		double c = income.nextDouble();
		
		Scanner ssiIncome = new Scanner(System.in);
		System.out.print("Whatis your expected SSI income? ");
		double s = ssiIncome.nextDouble();
		
		double PV;
		r = q/12;
		n = d*12; 
		y = c-2642; 
		f = 0; 
		t = false;
		
		PV = FinanceLib.pv(r,n,y,f,t);
		System.out.println(PV);
		
		double PMT; 
		r = i/12;
		n = m*12; 
		p = 0;
		f = PV; 
		t = false; 
		
		PMT = FinanceLib.pmt(r,n,p,f,t);
		System.out.println(PMT);
	}

}
