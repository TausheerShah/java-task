import java.util.Scanner;
public class ATM {
    private double i ;
    public ATM(double k) 
    {
        this.i= k ;
    }
    public void deposit(double i  ) 
    {
        int j;
        if (j > 0) // 
        {
            i += j;
            System.out.println("Deposit successful. Current balance: " + i );
        }
         else 
        {
            System.out.println("Invalid amount for deposit.");
        }
    }
    public void withdraw(double j) 
    {
        if (j > 0 && j  <= i )
        {
            i -= j;
            System.out.println("Withdrawal successful. Current balance: " + i);
        }
         else 
        { 
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
    public double checkBalance()
    {
        return i;
    }
    public static void main(String[] args)
     {
        int n;
        double x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        x = sc.nextDouble();   
        ATM atm = new ATM(x);
        while (true) 
        {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            n = sc.nextInt();     
            switch (n)
             {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    y = sc.nextDouble();
                    atm.deposit(y);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    z = sc.nextDouble();
                    atm.withdraw(z);
                    break;
                case 3:
                    System.out.println("Current balance: " + atm.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. See you again");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
