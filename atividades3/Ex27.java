package atividades3;
//A série de Fibonacci é formada pela sequencia: 
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
//Escreva um algoritmo que exiba a série de FIBONACCI até o enésimo termo
// f = f(n - 1)+f(n - 2)
import java.util.Scanner;
public class Ex27 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite o termo da sequecia de fibonacci: ");
         int num = sc.nextInt();
         
         int i = 1;
         int j = 0;
         int fib ;
          for(int k = 0; k <= num; k++){
              fib = i + j;
              i = j;
              j = fib;
              //System.out.println(fib);
              System.out.println(j);
          }
          System.out.printf("%d",fibonacci(num));
     } 
      public static long fibonacci(int num){
         int n = num;
          if(n == 0){
            return 0;
         }else if(n == 1 ){
            return 1;
         }else{
            return fibonacci(n - 1)+ fibonacci(n - 2);
         }
    }

     
}

   