//crie uma algoritmo que calcule o IMC

import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu Peso:  ");
        double peso = sc.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextInt();
        
        double imc = peso/Math.pow(altura,2);
        
        if(imc > 0){
            if(imc < 18.5){
                System.out.println("Magro");
            }else if(imc >= 18.5 && imc < 30){
                 System.out.println("Peso Ideal");
             }else{
                System.out.println("Obesidade");
        }
        }else{
             System.out.println("Digite valores corretos de peso e altura.");
                     
        }
                
        
    }
}
