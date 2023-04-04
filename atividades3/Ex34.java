package atividades3;
//Elabore um algoritmo que calcule sucessivamente o valor da divisão entre dois números reais, N1 e N2, fornecidos pelo usuário através do teclado. O algoritmo deve repetir a atuação até que seja digitado um valor igual a zero (para N1 ou N2)

import java.util.Scanner;
public class Ex34 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
   
          System.out.println("Se digitar zero finalizar o programa");
          int n1 = 1;
          int n2 = 1;
          
          while(true){
              
              System.out.println("Digite um numero N1: ");
              n1 = sc.nextInt();
              if(n1 == 0){
                 break;
              }
              System.out.println("Digite um numeros N2: ");
              n2 = sc.nextInt();
              if(n2 == 0){
                 break;
              }
              
              double div = n1 / n2;
              System.out.println("Resultado da divisão: "+div);
              System.out.println();
              
          }
          System.out.println("Fim do programa");
     }    
}
