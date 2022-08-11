	/*
   Ameen Noor
   L00170185
   */
   
   import java.util.Scanner;
   public class LyitElectric 
   {
		public static void main(String args[])
		{
         Scanner keyboardIn = new Scanner(System.in);
         
         
         
         
         char customerType, meterType; 
         int rUnit, howManyBussiness, bUnit;
         double customerYears, unitUsage, standingCharge, total, vatCharge, amountDue;
         unitUsage = 0.0;
         standingCharge = 0.0;
        
         System.out.println("Customer type: enter R or B");
         customerType = keyboardIn.next().charAt(0);

         
         if (customerType == 'R' || customerType == 'r')
         {
            System.out.println("Enter number of unit:");
            rUnit= keyboardIn.nextInt();
            System.out.println("How many years?");
            customerYears = keyboardIn.nextDouble();
            if (rUnit <= 200 && customerYears > 3)
            {
               unitUsage = 0.0;
            }
            else if (rUnit > 200)
            {
               unitUsage = rUnit * 23 / 100;
            }
            else
            {
               unitUsage = rUnit * 18 / 100;
            }
            
          
            System.out.println("Meter type: enter U or R");
            meterType = keyboardIn.next().charAt(0);
            if (meterType == 'U' || meterType == 'u')
            {
               standingCharge = 17.50;
            } 
            else if (meterType == 'R' || meterType == 'r')
            {
               standingCharge = 21.50;
            }
            else
            {
               System.out.println("please enter U or R");
            }
            


         total = unitUsage + standingCharge;
         vatCharge = 0.13 * total;
         amountDue = total + vatCharge;
         System.out.println("Usage " + rUnit + "              => " + "€" + unitUsage);
         System.out.println("Standing Charge " + "            => " + "€" +standingCharge);
         System.out.println("Total " + "                      => " + "€" +total);
         System.out.println("VAT @ 13% " + "                  => " + "€" +vatCharge);
         System.out.println("Amount Due " + "                 => " + "€" +amountDue);
         }
         else if (customerType == 'B' || customerType == 'b')
         {
            System.out.println("How many Bussiness? ");
            howManyBussiness = keyboardIn.nextInt();
            int x = 1;
            int bUnit_1 = 0;
            while (howManyBussiness >= x)
            {
               System.out.println("Enter number of unit for Bussiness " + x);
               bUnit= keyboardIn.nextInt();
               bUnit_1 = bUnit_1 + bUnit;
               x++;

            }
            System.out.println(bUnit_1);

            unitUsage = bUnit_1 * 25 / 100;
            standingCharge = 20.0;

         
         total = unitUsage + standingCharge;
         vatCharge = 0.13 * total;
         amountDue = total + vatCharge;
         System.out.println("Usage " + "      => " + unitUsage);
         System.out.println("Standing Charge " + "            => " + standingCharge);
         System.out.println("Total " + "                      => " + total);
         System.out.println("VAT @ 13% " + "                  => " + vatCharge);
         System.out.println("Amount Due " + "                 => " + amountDue);
         }
         else 
         {
            System.out.println("Please enter R or B");
         }



 
		}
	}