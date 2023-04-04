package atividades3;
//Escreva um algoritmo que leia a razão de um progressão aritmetica (PA) ser primeiro termo e a quantidade de elemtos que ela possui O algoritmo deve imprimir a sequncia de termos dessa PA.
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a Razão da PA: ");
        int razao = sc.nextInt();
        System.out.println("Informe o primeiro termo da PA: ");
        int primeiroTermo = sc.nextInt();
        System.out.println("Informe a quantidade de termos da PA: ");
        int quantiTermo = sc.nextInt();
        int cont = 0;
        int aux = primeiroTermo;
        
        do{
            
            if(primeiroTermo == aux){
               System.out.print(aux+" , ");
            }
            cont++;
            primeiroTermo += razao;
            System.out.print(primeiroTermo+" , ");
            
        }while(cont <= quantiTermo);
        
        /*for(int i = 0 ; i <= quantiTermo ; i++){
        
            primeiroTermo += razao;
            System.out.print(primeiroTermo+" , ");
         
        }*/
        
        
    }
}
