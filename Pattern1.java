import java.io.*;
import java.util.*;

class Pattern1{
    public static void main(String arg[]){
        for(int i=1;i<6;i++){
            for(int j=i;j<5+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}