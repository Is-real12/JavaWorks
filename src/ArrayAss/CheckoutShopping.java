package ArrayAss;
import java.util.ArrayList;
import java.util.Scanner;
public class CheckoutShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> listThing = new ArrayList<>();
        ArrayList<Integer> listPieces = new ArrayList<>();
        ArrayList<Integer> listPer_unit = new ArrayList<>();
        int total = 0;
        ArrayList <Integer> listTotal = new ArrayList<>();


        System.out.println("What is the Customer name: ");
        String Customer = scanner.next();
        boolean addMore = true;
        while (addMore) {

            System.out.println("What did the user buy: ");
            String thingsBought = scanner.next();
            System.out.println("how many pieces the user buy: ");
            int pieces = scanner.nextInt();

            System.out.println("How much per unit: ");
            int per_unit = scanner.nextInt();
            for (int i = 0; i < pieces; i++) {
                total += per_unit;
            }
            listTotal.add(total);
            System.out.print("Add more: ");
            String choice = scanner.next();
            listThing.add(thingsBought);
            listPieces.add(pieces);
            listPer_unit.add(per_unit);


            if (!choice.equalsIgnoreCase("yes")) {
                addMore = false;

            }
        }
        System.out.println("What is your name: ");
        String Cashier = scanner.next();

        System.out.println("How much discount will he get: ");
        int discount = scanner.nextInt();

        for (int i = 0; i < 1; i++) {
            System.out.println();

            System.out.printf("""
                    SEMICOLON STORES
                    MAIN BRANCH
                    LOCATION: 312, HERBERT MACAULAY MACAULAY WAY, SABO YABA, LAGOS.
                    TEL: 03293828343
                    Date: 18-Dec-22 8:48:11 pm
                    Cashier Name: %s
                    Customer Name: %s
                    ---------------------------------------------------------------------
                    ---------------------------------------------------------------------
                                                     ITEM    QTY     PRICE   TOTAL(NGN)
                    ---------------------------------------------------------------------
                         """, Cashier, Customer);
            int sum = 0;
            for (int j = 0; j < listPieces.size(); j++) {

                System.out.printf("\t\t\t\t\t\t\t\t%-5s\t\t", listThing.get(j));
                System.out.printf("%-5s\t", listPieces.get(j));
                System.out.printf("%-5s\t", listPer_unit.get(j));
                System.out.printf("%-5s\t\n", listTotal.get(j));


            }
            for (int j = 0; j < listTotal.size(); j++) {
                sum+= listTotal.get(i);

            }

            double calculateDiscount = (discount / 100.0) * sum;
            double vat = (17.50 / 100) * sum;
            double billTotal = (sum + calculateDiscount) - vat;
            System.out.printf("""
                    ---------------------------------------------------------------------
                                       
                                                               Sub Total:   %d
                                                                Discount:   %f
                                                             VAT @ 17.50:   %f
                    ---------------------------------------------------------------------
                    ---------------------------------------------------------------------
                                                     
                                                              Bill Total:   %f
                    ---------------------------------------------------------------------
                    ---------------------------------------------------------------------
                    THIS IS NOT A RECEIPT KINDLY PAY %f
                    ---------------------------------------------------------------------
                    ---------------------------------------------------------------------
                                                             
                    """, sum, calculateDiscount, vat, billTotal, billTotal);

            System.out.println("How much did the customer give you?");
            int payment = scanner.nextInt();
            int count = 0;
            if (payment < billTotal) {
                while (count < 900) {
                    System.out.println("Your Payment is not up to you debt please add more!");
                    System.out.println("How much did the customer give you?");
                    payment = scanner.nextInt();
                    count++;
                    if (payment >= billTotal) {
                        break;
                    }
                }
                System.out.printf("""
                        SEMICOLON STORES
                        MAIN BRANCH
                        LOCATION: 312, HERBERT MACAULAY MACAULAY WAY, SABO YABA, LAGOS.
                        TEL: 03293828343
                        Date: 18-Dec-22 8:48:11 pm
                        Cashier Name: %s
                        Customer Name: %s
                        ---------------------------------------------------------------------
                        ---------------------------------------------------------------------
                                                         ITEM    QTY     PRICE   TOTAL(NGN)
                        ---------------------------------------------------------------------
                             """, Cashier, Customer);

                for (int j = 0; j < listPieces.size(); j++) {
                    System.out.printf("\t\t\t\t\t\t\t\t%-5s\t\t", listThing.get(j));
                    System.out.printf("%-5s\t", listPieces.get(j));
                    System.out.printf("%-5s\t", listPer_unit.get(j));
                    System.out.printf("%-5s\t\n", listTotal.get(j));

                }
                double balance = payment - billTotal;
                System.out.printf("""
                        ---------------------------------------------------------------------
                                           
                                                                   Sub Total:   %d
                                                                    Discount:   %f
                                                                 VAT @ 17.50:   %f
                        ---------------------------------------------------------------------
                        ---------------------------------------------------------------------
                                                         
                                                                  Bill Total:   %f
                                                                 Amount paid:   %d
                                                                     Balance:   %f
                        ---------------------------------------------------------------------
                        ---------------------------------------------------------------------
                                       THANK YOU FOR YOUR PATRONAGE
                        ---------------------------------------------------------------------
                        ---------------------------------------------------------------------
                                                                 
                        """, sum, calculateDiscount, vat, billTotal, payment, balance, billTotal);

            }
        }
    }
}