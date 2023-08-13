import java.util.*;
import java.text.DecimalFormat;
 
class CurrencyConverter {
      
    public static void main(String[] args) {
  
        double amount, dollar, code, ringgit ;
  
        DecimalFormat f = new DecimalFormat("##.##");
  
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
  
        System.out.println("USD & MYR Currency Conventer");
  
        System.out.println("Which currency You want to Convert ? ");
         
        System.out.println("1:Dollar \t2:Ringgit ");1
        code = sc.nextInt();
         
        System.out.println("How much Money you want to convert ?");
        amount = sc.nextFloat();
  
        // For amounts Conversion
        if (code == 1) {
  
            // For Dollar Conversion
  
            ringgit = amount * 4.17;
            System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
 
        } else if (code == 2) {
            // For Dollar Conversion
  
            ringgit = amount * 4.17;
            System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
 
  
        } else {
            System.out.println("Invalid input");
        }
    }
}
         