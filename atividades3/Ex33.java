package atividades3;
//Construa um algoritmo que receba do usuário um número inteiro n e calcule a soma dos quadrados de 1 até n (Y) além do quadrado da soma dos números entre 1 e n (X). Mostre o resultado da diferença entre X e Y
import java.util.Scanner;
public class Ex33 {
    public static void main(String[] args){
     
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um numero N: ");
        int num = sc.nextInt();
        
        int totQuad = 0;
        double quad;
        double quadSoma ;
        double y = 0;
        
        for(int i = 0; i <= num;i++){
            quad = Math.pow(i,2);
            totQuad += quad;
            y = totQuad;
        }
        double x = Math.pow(y,2);
        double dif = x - y;
        System.out.println("A soma dos quadrados é: "+y);
        System.out.println("O quadrado da soma é:"+x);
        System.out.println("A diferença dos quadrados é de :"+dif);
                
        
        
    }    
}
