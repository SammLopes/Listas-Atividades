//faça um programa para ler 3 numeros reais do teclado e verificar se o primeiro é maior que o segundo
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 3 numeros: ");
        System.out.println("Número 1: ");
        int n1 = sc.nextInt();
        System.out.println("Número 2: ");
        int n2 = sc.nextInt();
        System.out.println("Número 3: ");
        int n3 = sc.nextInt();
        
        
        
        if(n1 >= (n2+n3)){
            System.out.println(" O primeiro é maior que a soma dos outros dois numeros.");
        }
        
                
        
    }
}
