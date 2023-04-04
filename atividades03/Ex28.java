package atividades3;
//Sendo H=1+1/2+1/3+1/4+1/5++1/N, crie um algoritmo que calcule o número H. O número N é inserido pelo usuário via teclado

import java.util.Scanner;
public class Ex28 {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Digite um numero n para uma sequecia de H: ");
          int n = sc.nextInt();
          
          int divi = 1 ;
          int um = 1;
          int cont = 0;
          double h ;
          double totH = 0;
          do{
          
           cont++;
              
           h = um + 1/divi++;
           System.out.println("1 /  "+divi);
           totH += h;
          
              
              
       }while(cont <= n);
          System.out.println("O valor de H é: "+h);
            
      }    
}
