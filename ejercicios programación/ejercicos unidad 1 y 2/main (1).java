import java.util.Scanner;
   public class Main {
 
   public static void main (String[] args) {
       
       int bankAccount = 1000;
       final int MonthToWeek = 4;
       int retract = 200;
       int totalRetractMonth =retract*MonthToWeek;
       int totalBankAccount = bankAccount-totalRetractMonth;
       
       System.out.println("el dinero al final del mes es = " + totalBankAccount);
   }
}
   