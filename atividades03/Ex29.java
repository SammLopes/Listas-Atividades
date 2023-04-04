package atividades3;

//Crie um algoritmo que, ao ler do teclado o valor de N, calcule o valor de S que é dado pela série abaixo: 

//S=1/N+2/N-1+3/N-2+4/N-3++N-12+N/1

import java.util.Scanner;
public class Ex29 {
  public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      System.out.println("(S=1N+2N-1+3N-2+4N-3++N-12+N1)");
      System.out.println("Digiteum numero n para calcularmos a senquecia s: ");
      int n = sc.nextInt();
      
      int cont = 0;
      double s ;
      int p = 0;
      int m = 0;
      int totN = 0;
      do{
       
          cont++;
          s = ((n - m--)/ n) + (n)/(n - p++);    
          totN += s;
      }while(cont < n);
      System.out.println("O resultado de s é de : "+totN);
  }  
}
