import java.util.*;

public class CanopyRentalCharge {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      CanopyRentalCharge obj = new CanopyRentalCharge();

      String participantType;
      char participantCode, itemCode, prompt;
      int totalCanopies, totalDays;
      double addCharge, canopyCharge, grandTotal;

      do {
         System.out.println("UiTM P. Pinang");
         System.out.println("Entrepreneurship Week");
         System.out.println("Canopy Rent System by Ismail Arif (https://kesunyianayam.github.io/)");
         System.out.println();
         System.out.println("Please enter participant code");
         System.out.println("T = Students, S = Staffs, O = Outsiders");
         System.out.print("Participant Code: ");
         participantCode = input.next().charAt(0);
         System.out.print("Enter total number of canopies: ");
         totalCanopies = input.nextInt();
         System.out.print("Enter total days of rental: ");
         totalDays = input.nextInt();
         System.out.println("Enter item code");
         System.out.println("W = Sell wet items, N = Otherwise");
         System.out.print("Item Code: ");
         itemCode = input.next().charAt(0);
         if (participantCode == 'T')
            participantType = "Students";
         else if (participantCode == 'S')
            participantType = "Staffs";
         else
            participantType = "Outsider";

         canopyCharge = obj.canopyCharges(participantCode, totalCanopies, totalDays);
         addCharge = obj.addCharges(itemCode);
         grandTotal = canopyCharge + addCharge;

         System.out.println();
         System.out.println("UiTM P. Pinang");
         System.out.println("ORDER RECEIPT");
         System.out.println();
         System.out.println("Participant type                  : " + participantType);
         System.out.println("Total canopies                    : " + totalCanopies);
         System.out.println("Total Days of Rental              : " + totalDays);
         System.out.println();
         System.out.println("TOTAL CHARGES (CANOPY ONLY)       : " + canopyCharge);
         System.out.println("TOTAL ADDITIONAL CHARGES(IF ANY)  : " + addCharge);
         System.out.println("GRAND TOTAL                       : " + grandTotal);
         System.out.println();
         System.out.print("Do you want to continue? (Y/N)    : ");
         prompt = input.next().charAt(0);
      } while (prompt == 'Y');

      input.close();
   }

   double canopyCharges(char code, int canopy, int day) {
      if (code == 'T')
         return canopy * day * 90;
      else if (code == 'S')
         return canopy * day * 150;
      else
         return canopy * day * 200;
   }

   double addCharges(char itm) {
      if (itm == 'W')
         return 100;
      else
         return 0;
   }
}