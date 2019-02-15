package credit;

import java.util.Scanner;

/**
 *
 * @author ahashmi
 */
public class Credit {

    public void calculateBalance() {
        Scanner input = new Scanner(System.in);
        int accountnum;
        int oldBalance;//Begining Balance
        int charges; //TotalCharges
        int credits; // Total Credits
        int creditLimit; // allowed limit
        int newBalance;// new Balance

        System.out.print("Enter Account Number(or -1 to quit): ");
        accountnum = input.nextInt();
        while (accountnum != -1) {
          

            System.out.println("Enter Customers Begining Blance:");

            oldBalance = input.nextInt();
            System.out.println();

            System.out.println("Enter Total of all items charged by customer:");

            charges = input.nextInt();
            System.out.println();

            System.out.println("Enter total of all credits applied to a customer: ");

            credits = input.nextInt();
            System.out.println();

            System.out.println("Enter the allowed credit limit:");

            creditLimit = input.nextInt();
            System.out.println();

            newBalance = oldBalance + charges - credits;
            System.out.println("Customer:" + accountnum + "/n" + oldBalance + "/n" + charges + "/n" + credits + "/n");
            System.out.println("Customers new Balance is" + newBalance);
            System.out.println();
            if (newBalance > creditLimit) {
                System.out.println("Credit Limit Exceeded");
                
            }
            System.out.print("Enter Account Number(or -1 to quit): ");
            accountnum = input.nextInt();
            System.out.println();
        }
    }
}
