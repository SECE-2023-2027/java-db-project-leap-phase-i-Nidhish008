import java.io.*;
import java.util.*;
class Operations{
    int balance=0;
    public void withdraw(int amnt){
        if(balance>=amnt){
            balance-=amnt;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(int amnt){
        balance+=amnt;
    }
    public void dispBal(){
        System.out.println("Your current balance is "+balance);
    }
}

class Bank{
    public static void main(String arg[]){
        Operations op = new Operations();
        Scanner t=new Scanner(System.in);
        int userid=1234;
        String password="nid@81005";
        System.out.println("Enter your user id:");
        int user=t.nextInt();
        t.nextLine();
        System.out.println("Enter your password:");
        String pin=t.nextLine();
        if(userid==user && password.equals(pin)){
            while(true){
                int amount=0;
                System.out.println("1.Withdraw Amount");
                System.out.println("2.Deposit Amount");
                System.out.println("3.Display Balance");
                System.out.println("4.Exit");
                System.out.println("Enter your choice:");
                int ch=t.nextInt();
                switch(ch){
                    case 1:
                    System.out.println("Enter the amount to withdraw:");
                    amount=t.nextInt();
                    op.withdraw(amount);
                    op.dispBal();
                    break;
                    case 2:
                    System.out.println("Enter the amount to deposit:");
                    amount=t.nextInt();
                    op.deposit(amount);
                    op.dispBal();
                    break;
                    case 3:
                    op.dispBal();
                    case 4:
                    break;
                    default:
                    System.out.println("Enter a valid choice");
                }
                if(ch==4){
                    break;
                }
            }
        }
        else{
            System.out.println("Incorrect userid or password");
        }
    }
}