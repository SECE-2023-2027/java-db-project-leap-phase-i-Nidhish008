import java.io.*;
import java.util.*;
class Account{
    public static void main(String arg[]){
        Scanner t=new Scanner(System.in);
        ArrayList<Object> al=new ArrayList<>();
        while(true){
            System.out.println("1)Creare an account\n2)Display all accounts");
            int ch=t.nextInt();
            t.nextLine();
            if(ch==1){
                System.out.println("Enter your name:");
                String name=t.nextLine();
                System.out.println("Enter the account no:");
                String accno=t.nextLine();
                System.out.println("Enter the account balance:");
                int amnt=t.nextInt();
                HashMap<String,Object> det=new HashMap<>();
                det.put("Name:",name);
                det.put("Account no:",accno);
                det.put("Amount:",amnt);
                al.add(det);
                System.out.println(al);
            }
        }
    }
}
        