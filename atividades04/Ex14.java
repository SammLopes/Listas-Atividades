package atividades4;
/*
Crie uma função que receba um inteiro N, calcule e retorne a soma de 1 até N. Crie um programa para testar essa função

*/
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int soma = soma(num);
        System.out.println("A soma dos numeros de 1 ate o numero digitado é: "+soma);
    }
    
    public static int soma(int num){
        int soma  = 0;
        for(int i = 1;i <= num; i++){
            soma += i;
            System.out.println(i+" | "+soma);
        }
        return soma;
    }
}
