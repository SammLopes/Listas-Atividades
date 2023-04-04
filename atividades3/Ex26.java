package atividades3;
//Escreva um algoritmo que calcule o m.d.c. (máximo divisor comum) entre A e B (números inteiros e positivos). Esses dois valores são passados pelo usuário através do teclado. (pesquise sobre o algoritmo de Euclides)
import java.util.Scanner;
public class Ex26 {
     public static void main(String[] args){
      
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite o dividendo: ");
         int divid = sc.nextInt();
         System.out.println("Digite o divisor: ");
         int divis = sc.nextInt();
         
         int num1;
         int num2;
         int resto;
         
         if(divid > divis){
            num1 = divid;
            num2 = divis;
         }else{
            num1 = divis;
            num2 = divid;
         }
         
         do{
           resto = num1 % num2;
           num1 = num2;
           num2 = resto;
         }while(resto != 0);
         
         System.out.println("O M.D.C entre "+divid+" e "+divis+" é de : "+num1);
     }   
}
