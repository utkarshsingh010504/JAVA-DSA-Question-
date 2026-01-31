import java.util.Scanner;
class Bank {
    static class Account {
        String name;
        String location;
        int code;
        int balance;
        void inputDetails(Scanner scanner) {
            System.out.print("Enter account holder name: ");
            name = scanner.nextLine();
            System.out.print("Enter branch location: ");
            location = scanner.nextLine();
            System.out.print("Enter IFSC code: ");
            code = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter balance: ");
            balance = Integer.parseInt(scanner.nextLine());
        }
        void displayInfo() {
            System.out.println("Account Holder: " + name);
            System.out.println("Branch Location: " + location);
            System.out.println("IFSC Code: " + code);
            System.out.println("Balance: ₹" + balance);
            System.out.println("---------------------------");
        }
    }
    static class FDAccount extends Account {
        int fdAmount = 100000;

        void displayFDInfo() {
            System.out.println("FD Account Holder: " + name);
            System.out.println("FD Branch Location: " + location);
            System.out.println("IFSC Code: " + code);
            System.out.println("FD Amount: ₹" + fdAmount);
            System.out.println("---------------------------");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Two account
        System.out.println("Enter details for Account Holder 1:");
        Account acc1 = new Account();
        acc1.inputDetails(scanner);
        System.out.println("\nEnter details for Account Holder 2:");
        Account acc2 = new Account();
        acc2.inputDetails(scanner);


        System.out.println("Enter details for fd 1:");
        FDAccount fdAcc1 = new FDAccount();
        fdAcc1.inputDetails(scanner);
        System.out.println("\nEnter details for fd 2:");
        FDAccount fdAcc2 = new FDAccount();
        fdAcc2.inputDetails(scanner);

        //  display
        System.out.println("\n*** Menu ***");
        System.out.println("1. View Savings Account Details");
        System.out.println("2. View FD Account Details");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.println("\n***** Displaying Details *****");
        switch (choice) {
            case 1:
                acc1.displayInfo();
                acc2.displayInfo();
                break;
            case 2:
                fdAcc1.displayFDInfo();
                fdAcc2.displayFDInfo();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}