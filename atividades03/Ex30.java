package atividades3;
//Escreva um algoritmo que receba do usuário um inteiro positivo n e imprima n linhas do chamado Triângulo de Floyd conforme o exemplo abaixo: 
/*1
 2  3
 4  5  6
 7  8  9  10
 11  12  13  14  15
 16  17  18  19  20  21
*/
import java.util.Scanner;
public class Ex30 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite um valor N: ");
         int num = sc.nextInt();
         
         int i, j, c = 0;
         for(i = 0; i <= num;i++){
            for(j = 1; j <= i;j++){
                 c++;
                 System.out.printf("%d ",c);
            }
             System.out.println("\n");
         }
         
    }
    
}
