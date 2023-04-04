package atividades3;
//Elabore um algoritmo que calcule a soma de todos os divisores de um número n exceto o próprio número n. O número n deve ser digitado pelo usuário e deve ser inteiro maior que zero. Exemplo: a soma dos divisores do número 66 é: 
//1 + 2 + 3 + 6 + 11 + 22 + 33 = 78

import java.util.Scanner;
public class Ex32 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Digite um numero N: ");
          int num = sc.nextInt();
          
          int totDiv = 0;
          int resto ;
          
          if( num <= 0 ){
              System.out.println("Digite um numero maior que zero!!!");
          }else{
              for(int i = 1; i<= num;i++){
                 resto = num % i;
                 if( i != num){ 
                  if(resto == 0){
                      totDiv += i;
                      System.out.println(i+" + ");
                  }else{
                      continue;
                  }
                     
                 }
              }
              System.out.println(" = "+totDiv);
              System.out.println("O total da soma dos divisores de "+num+" é igual á: "+totDiv);
          }
          
          
     }    
}
