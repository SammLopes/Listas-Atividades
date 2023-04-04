package atividades3;
//Escreva um algoritmo que calcule o resto da divisão de A por B (número inteiros e positivos), ou seja, (A % B), através de subtrações sucessivas. Esses dois valores são passados pelo usuário através do teclado
 import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do Dividendo: ");
        int divi = sc.nextInt();
        System.out.println("Digite o valor do Divisor: ");
        int divis = sc.nextInt();
        int quo ;
        int res = 0;
        for(quo = 0; divi >= divis; quo += 1){
               
            res = divi - divis;
            divi = res;
        }
        System.out.println("O quociente da divisão é de : "+quo);
        System.out.println("O resto da divisão é de : "+res);
        
        
    }
    
}
