
package atividades3;

//escrev um programa que leia um valor real N,(0< n <= 1)e calcule:
//s = 1+1/2+1/4+1/8+1/16 ate que um termo da serieseja menor do que N

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero entre 1 e 0");
        System.out.println("Digite um valor N: ");
        float n = sc.nextFloat();
        
        int cont = 0;
        int termo = 1;
        int um = 1;
        double totSoma = 0;
        
        if(n < 0 && n > 1.0){
            System.out.println("Digite um numero entre 1 e 0!!!!!!");
        }else{
            do{
            
                cont++;
                totSoma = totSoma + um/termo*2;      
                System.out.println(totSoma);
                
                
            }while(cont >= totSoma);
            
            System.out.println("A soma total é de : "+totSoma);   
            
       }   
        System.out.println("Fim do programa");
                
    }
    
}
