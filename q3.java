package Assignment1a;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            
            
            System.out.print("Enter the Principal amount: ");
            double principal = sc.nextDouble();
            
            System.out.print("Enter the Number of years: ");
            double time = sc.nextDouble();
            
            System.out.print("Enter the Rate of interest: ");
            double rate = sc.nextDouble();
            
            
            double simpleInterest = (principal * time * rate) / 100;
            
        
            double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
            
            
            System.out.println("Simple Interest = " + simpleInterest);
            System.out.println("Compound Interest = " + compoundInterest);
            
    }
    
}
