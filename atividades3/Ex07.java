package atividades3;
// fala um algoritmo de calculo de fatorial de um numero informado
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor N: ");
        int n = sc.nextInt();
        
        int totN = 1;
        
        int cont = 0;
                
        
        do{
        
            cont++;
            totN *= n;
            n--;
            System.out.println(n+" , ");
            
        }while(cont <= n);
        
        
        /*while(cont <= n){
        
            cont++;
            totN *= n;
            n--;
            System.out.println(n+" , ");
                    
        }*/
        
        
        
        
        /*for(int i = 0; i <= n ;i++){
        
           totN *= n;
           n--;
            System.out.println(n+" , ");    
        }*/
        System.out.println("O fatorial de N é de: "+totN);
        
    }
}
