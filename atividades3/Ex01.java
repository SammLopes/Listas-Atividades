
package atividades3;
//Escreva um algortimo que leia dois numeros inteiros (A ,B) e retorne o valor da multiplicação entre eles, sendo que voçe so pode usar a estrutura de repetição e o operador aritimetico de doma .
import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Digite um valor A: ");
         int a = sc.nextInt();
         System.out.println("Digite um valor B: ");
         int b = sc.nextInt();
         int mult = 0;
         int cont = 1;
         while(cont <= b){
           
             cont++;
             mult += a;
             
         }
         System.out.println("A multiplicação do valor A e B é de: "+mult);
    }
    
}
