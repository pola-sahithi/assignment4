package com.epam.simpleandcompoundinterest;
import simpleinterest.*;
import compoundinterest.*;
import java.util.*;

public class App  
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Press 1)SimpleInterest 2)CompoundInterest\n");
        int chooseoption=sc.nextInt();
        System.out.printf("Enter the PrincipleAmount");
        float PrincipleAmount=sc.nextFloat();
        System.out.printf("Enter the RateOfInterestPerAnnum");
        float RateOfInterestPerAnnum=sc.nextFloat();
        System.out.printf("Enter the TimePeriod in years");
        float TimePeriodInYears=sc.nextFloat();
        switch(chooseoption)
        {
        case 1:float simpleinterest=SimpleInterest.calculate_simple_interest(PrincipleAmount,TimePeriodInYears,RateOfInterestPerAnnum);
               System.out.printf("The simpleinterest is %f\n",simpleinterest);
               break;
        case 2:float compoundinterest=CompoundInterest.calculate_compound_interest(PrincipleAmount,TimePeriodInYears,RateOfInterestPerAnnum);
               System.out.printf("The compoundinterest is %f\n",compoundinterest);
               break;
        default:System.out.printf("Enter a valid option\n");
         	   break;
        }
        sc.close();
        
    }
}
