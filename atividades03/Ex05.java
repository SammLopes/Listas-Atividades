package atividades3;
import java.util.Scanner;
//fzer um programa para ler um numero inteiro n e calcular e exibir a soma dos numeros inteiros impares no intervalo de 1 a n 
public class Ex05 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Digite um valor n: ");
        int n = sc.nextInt();
        
        int soma = 0;
        int totSoma = 0;
        
        for(int i = 1; i <= n ;i++){
        
            soma++;
            if(soma % 2 == 1){
            
                System.out.println(soma+" , ");
                totSoma += soma;
                
            }
        }
        System.out.println("\nA soma dos numeros impares de 1 á "+n+" é: "+totSoma);
        
    }    
}
