package atividades3;
//Escreva um algoritmo que receba 15 números e imprima quantos números maiores que 30 foram digitados
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 15 numeros: ");
        int num  ;
        int aux = 0;
        int totSoma = 0 ;
        for(int i = 1; i < 15; i++){
         
            System.out.println("Digite o numero "+i);
            num = sc.nextInt();
            
            if( num >= 30){
                  aux++;
            }
            totSoma += num;
                    
        }
        System.out.println("O numeros digitados acima de 30 é de: "+aux);
        System.out.println("A soma dos numeros digitados é de : "+totSoma);;
        
    }
    
}
