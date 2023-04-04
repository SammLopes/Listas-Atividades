package atividades4;
/*
Criar uma função exiba a soma entre dois números inteiros A e B. Criar um programa para testar essa função
*/
import java.util.Scanner;
public class Ex11 {
     public static void main(String[] args){
     
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite um numero: ");
         int num1 = sc.nextInt();
         System.out.println("Digite um numero: ");
         int num2 = sc.nextInt();
         
        int teste1 = soma(num1, num2);
         System.out.println("Soma: "+teste1);
         
     }    
     public static int soma(int n1, int n2){
         return n1 + n2;
     }
}
