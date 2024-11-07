import java.io.*;
import java.util.*;

class twodarray{
    public static void main(String arg[]){
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns:");
        int m=t.nextInt();
        int n=t.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the values:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=t.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}