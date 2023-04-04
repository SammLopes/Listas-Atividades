package atividades3;
//Escreva um algoritmo que receba quinze números do usuário e imprima a raiz quadrada de cada número. (use a função pow da biblioteca Math)
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Raiz Quadrada de cada Numero Informado");
        int num ;
        double raizQuadrada;
       /* for(int i = 0; i <= 15; i++){
        
            System.out.println("Informeo numero "+i);
            num = sc.nextInt();
            raizQuadrada = Math.sqrt(num);
            
            System.out.println("A raiz quadrada de "+num+" é: "+raizQuadrada);
        }*/
       //usando while
       int cont = 0;
       /*while(cont <= 15){
           cont++;
           System.out.println("Informe numero "+cont);
           num = sc.nextInt();
           raizQuadrada = Math.sqrt(num);
           System.out.println("A raiz quadrada de "+num+" é: "+raizQuadrada);
       }*/
       //usando do_while
       do{
           cont++;
           System.out.println("Informe numero "+cont);
           num = sc.nextInt();
           raizQuadrada = Math.sqrt(num);
           System.out.println("A raiz quadrada de "+num+" é: "+raizQuadrada);
       }while(cont <= 15);
    }
}
