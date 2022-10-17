import java.util.* ;

public class ATMInterfaceCLI {

    public static int balance = 0 ;
    static Scanner s = new Scanner(System.in) ;

    public static void main(String[] args) {
        
        System.out.println("\nWELCOME TO SONA BANK\n");
        while (true) {
        System.out.println("\n\nChoose an option below press\n1 for Current Balance\n2 for Withdraw\n3 for Deposit\n4 for Transfer\n5 for Quit");
        System.out.print("Choose your option : ");
        byte op = s.nextByte() ;
        System.out.println();
        switch (op) {
            case 1:
                Balance a = new Balance() ;
                a.balance();
                break;
            case 2:
                Withdraw b = new Withdraw() ;
                b.input();
                break;
            case 3:
                Deposit c = new Deposit() ;
                c.deposit();
                break;
            case 4:
                Transfer d = new Transfer() ;
                d.transfer();
                break;
            case 5:
                Quit q = new Quit() ;
                q.quit();
                break;
        
            default:
                break;
        }
        if (op == 5) {
            break ;
        }
    }
    }

    public static class Balance {
        public void balance() {
            System.out.println("\n");
            System.out.println("Your current balance is " + balance);
        }        
    }

    public static class Withdraw {
        public void input() {
            System.out.print("Enter the AMOUNT : ");
            int inp = s.nextInt() ;
            System.out.println("\n");
            if (balance >= inp) {
                System.out.println("Withdrawn successfully Collect your money.");
                balance = balance-inp ;
            }
            else {
                System.out.println("Insufficient Balance!");
            }
        }
        
    }

    public static class Deposit {
        public void deposit() {
            System.out.print("Enter the AMOUNT : ");
            int mon = s.nextInt() ;
            System.out.println("\n");
            System.out.println("Money Deposition Successful.");
            balance = balance + mon ;
            System.out.println("Remaining Balance is " + balance);
        }
    }

    public static class Transfer {
        public void transfer () {
            System.out.print("Enter the Account No. you want to transfer money : ");
            String acc = s.nextLine() ;
            acc = s.nextLine() ;
            System.out.print("Enter the AMOUNT : ");
            int am = s.nextInt() ;
            System.out.println("\n");
            if (balance >= am) {
                System.out.println("Successfully Transferred to Account No. " + acc);
                balance = balance-am ;
                System.out.println("Remaining Balance is " + balance);
            }
            else {
                System.out.println("Insufficient Balance!");
            }

        }        
    }

    public static class Quit {
        public void quit() {
            System.out.println("Thanks for visiting Have a nice day:)\n");
        }
    }

}
