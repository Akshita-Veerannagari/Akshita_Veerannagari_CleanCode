package com.epam.cleancode.cleancode;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main 
{
	 public static void main( String[] args )
	    {
	        Scanner sc=new Scanner(System.in);
	        InterestCalc interestCalcObj =new InterestCalc();
	        HouseConstrCost houseConstrCost;
	        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	        out.print("INTEREST CALCULATION:\n");
	        out.print("Select an option \n1.Simple Interest 2.Compound Interest\n");
	        if(sc.nextInt()==1) {
	        	out.print("Enter principal, rate of interest and time in years\n");
	        	double principal=sc.nextDouble();
	        	double rate=sc.nextDouble();
	        	double timeInYears=sc.nextDouble();
	        	out.print("Simple Interest is: "+interestCalcObj.simpleInterest(principal, rate, timeInYears));
	        }
	        else {
	        	out.print("Enter principal, rate of interest and time in years and number of times interest is compounded in an year\n");
	        	double principal=sc.nextDouble();
	        	double rate=sc.nextDouble();
	        	double timeInYears=sc.nextDouble();
	        	int noOfTimesInterestCompoundedInYear=sc.nextInt();
	        	out.print("Amount is: "+interestCalcObj.compoundInterest(principal, rate, timeInYears,noOfTimesInterestCompoundedInYear));
	        }
	        out.print("\nHOUSE CONSTRUCTION\nEnter material standard(1.standard 2.above standard 3.high standard and total area of house\n");
	        int standard=sc.nextInt();
	        double area=sc.nextDouble();
	        if(standard==3){
	        	out.print("Do you want the house to be fully automated?\n 1.Yes 2.No\n");
	        	int option=sc.nextInt();
	        	houseConstrCost=new HouseConstrCost(standard,area,option==1?true:false);
	        	out.print("Total cost required: "+houseConstrCost.cost());
	        }
	        else {
	        	houseConstrCost=new HouseConstrCost(standard,area);
	        	out.print("Total cost required: "+houseConstrCost.cost());
	        }
	    }
}