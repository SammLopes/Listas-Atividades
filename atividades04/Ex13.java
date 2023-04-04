package atividades4;
/*
Criar uma função que receba dois inteiros A e B e exiba:
Os números entre A e B na ordem crescente caso A seja menor que B
Os números entre A e B na ordem decrescente caso A seja maior que B
Exibir a mensagem “Os numeros sao iguais” caso A = B
Crie um programa para testar essa função

*/
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args){
        defineNum();
    }
    
    public static void defineNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();
        selecionaNum(num1,num2);
    }
    
    public static void selecionaNum(int num1, int num2){
        if(num1 < num2){
            for(int i = num1; i < num2; i++){
                System.out.println(i+" , ");
            }
        }else if(num1 > num2){
            for(int i = num1; i > num2; i--){
                System.out.println(i+" , ");
            }
        }else{
            System.out.println("São numeros iguais!!!!!");
        }
    }
}
