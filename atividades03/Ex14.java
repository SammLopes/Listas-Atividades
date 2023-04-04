package atividades3;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args){
            int a, b, i, res;
          Scanner scn = new Scanner(System.in);
          a = scn.nextInt();
          b = scn.nextInt();
          res = 0;
          for (i = a; i <= b; i++)
           res += i;
          System.out.println(res);
    
    }
    
}
