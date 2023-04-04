package atividades3;
//Escreva um algoritmo que imprima todos os divisores de um número inteiro n. Esse número n deve ser digitado pelo usuário
import java.util.Scanner;
public class Ex31 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero N: ");
        int num = sc.nextInt();
        
        int i , resto;
        for(i = 1;i <= num;i++){
            resto = num % i;
            if(resto == 0){
                System.out.println(i+" é divisor de "+num);
            }
        }
    }    
}
