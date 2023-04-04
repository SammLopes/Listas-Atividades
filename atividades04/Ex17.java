package atividades4;
/*Escreva uma função que receba o peso (quilos) e a altura (metros) de uma pessoa, calcule e retorne o IMC (índice de massa corporal) dessa pessoa:
IMC=pesoaltura2
*/
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        double kg = sc.nextDouble();
        double imc = imc(kg, altura);
        System.out.println("Seu IMC: "+imc);
        clasificaImc(imc); 
    }
    
    public static double imc(double kg, double altura){
        return kg / Math.pow(altura, 2);
    }
    
    public static void clasificaImc(double valor){
        if(valor < 18.5){
            System.out.println("Voce esta abaixo do Peso !!!!");
        }else if(valor >= 18.5 && valor < 24.9){
            System.out.println("Voce esta no peso ideal !!!!");
        }else if(valor >= 25.0 && valor <= 29.9){
            System.out.println("Voce esta levemente acima do peso");
        }else if(valor >= 30.0 && valor <= 34.9){
            System.out.println("Voce esta com obesidade de I grau");
        }else if(valor >= 35.0 && valor <= 39.9){
            System.out.println("Voce esta com obesidade de II grau");
        }else{
            System.out.println("Voce esta com obesidade de de III grau!!!!");
        }
    }
}
