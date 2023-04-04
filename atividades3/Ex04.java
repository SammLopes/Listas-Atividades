package atividades3;
import java.util.Scanner;
//Faça um programa que leia um numero inteiro n e calcule e exiba a soma dos numeros inteiros de 1 a n 
public class Ex04 {
   public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite um numero inteiro: ");
       int n = sc.nextInt();
       
       int soma = 1;
       int totSoma = 0;
       
       for(int i = 1; i <= n; i++){
       
           soma++;
           System.out.print(soma+" + ");
           totSoma += soma;
       }
       
       System.out.println("\nSoma dos numeros de 1 a "+n+" é: "+totSoma);
       
   }    
}
