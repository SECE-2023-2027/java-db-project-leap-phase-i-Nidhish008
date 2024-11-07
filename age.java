import java.io.*;
import java.util.*;

class age{
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=t.nextLine();
        System.out.println("Enter your age:");
        int age=t.nextInt();
        switch((age>=18)?((age>=60)?2:1) : 0){
            case 0:
                System.out.println(name+", you are not eligible to vote");
                break;
            case 1:
                System.out.println(name+", you are eligible to vote");
                break;
            case 2:
                System.out.println(name+", you are eligible to vote");
                System.out.println(name+", you are a senior citizen");
                break;
        }
    }
}