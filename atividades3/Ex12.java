package atividades3;
//Escreva um programa que receba um numero indicado uma quantidade de pessoas a partir de saa quantidade o programa devera ler o peso e a idade de cada pessoa e exibir a soma dos pesos da spessoas com mais de 18 anos 

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pessoas: ");
        int pesos = sc.nextInt();
        int totPesos;
        int total = 0;
        int idade ;
        for(int i = 1; i <= pesos;i++){
        
            System.out.println("Digite o peso da pessoa "+i);
            totPesos = sc.nextInt();
            System.out.println("Digite a idade da pessoa "+i);
            idade = sc.nextInt();
            
            if(idade >= 18 ){
                total += totPesos;
            }            
          
        }
        System.out.println("O total de pesos de pessoas acima de 18 anos é de "+total);
        
    }
}
