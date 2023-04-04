package atividades4;
/*
Crie uma função para multiplicar dois inteiros A e B. o resultado dessa multiplicação deve ser o 
retorno da função. Crie uma função que receba um número inteiro calcule e retorne o 
fatorial desse número sabendo que N!=N(N-1)(N-2)21. Utilize a função construída anteriormente para efetuar suas multiplicações. 
Crie um programa que teste a função que você implementou para calcular o fatorial

*/
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero A: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o numero B: ");
        int num2 = sc.nextInt();
        int mult = mult(num1, num2);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Digite um numero para obter o fatorial: ");
        int fat = sc.nextInt();
        int fatorial = fatorial(fat);
        System.out.println("Fatorial: "+fatorial);
    }
    
    public static int mult(int num1, int num2){
        return num1 * num2;
    }
    
    public static int fatorial(int num){
        int fat = 1;
        for(int i = num; i > 1; i--){
            fat = mult(fat,i);
        }
        return fat;
    }
}
