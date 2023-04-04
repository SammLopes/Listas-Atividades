package atividades3;
//Escreva um algoritmo que leia arazão de um PG seu primeiro termo e a quantidade de elemntos que ela possui. Oalgoritmo  deve imprimir a sequncia de termos dessa PG.
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Infome o primeiro Termos dessa P.G: ");
        int primeiroTermo = sc.nextInt();
        System.out.println("Informe o quociente dessa P.G: ");
        int quociente = sc.nextInt();
        System.out.println("Informe a quantidade numeros dessa P.G");
        int totElementos = sc.nextInt();
        
        int aux = primeiroTermo;
        
        int cont = 0;
        do{
           
            if(primeiroTermo == aux){
                System.out.print(aux+" , ");
            }
           cont++;
           primeiroTermo *= quociente;
           System.out.print(primeiroTermo+" , ");
             
        }while(cont <= totElementos);
        
        
        
        
        /*for(int i = 0; i <= totElementos; i++){
        
            if(primeiroTermo == aux){
                System.out.print(aux+" , ");
            }
            primeiroTermo *= quociente;
            System.out.print(primeiroTermo+" , ");
            
        }*/
        
    }
    
}
