package atividades05;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos anos você tem: ");
        int anos = sc.nextInt();
        double totDias = retornaData(anos);
        System.out.println("O total de dias é: "+totDias);
    }
    public static double retornaData(int anos){
        int anosParaMeses = anos * 12;
        double m = 30.437; 
        double mesesParaDias = anosParaMeses * m;
        return mesesParaDias;
    }
}
