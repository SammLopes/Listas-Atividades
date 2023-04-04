package atividades3;
/*Escreva um algoritmo que receba um número N (positivo - maior que zero) e imprima todos os números primos entre 0 e N. Dica: você irá utilizar uma estrutura de repetição “dentro” de outra
*///pedir ajuda ao professor

import java.util.Scanner;
public class Ex25 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero : ");
        int n  = sc.nextInt();
        int aux ;
       for(int i = 2;i <= n;i++){
           for(int j = 1; j<= n; j++){
               if(i > j){
                  if(i % j == 0){
                      System.out.println(i);
                  }
               }
               }
           }
       }
   }    

