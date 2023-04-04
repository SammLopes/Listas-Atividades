package atividades05;

/* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário. */
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        int sal = sc.nextInt();
        System.out.println("Digite o percentual de reajuste em porcentagem: ");
        double reajuste =  sc.nextDouble();
        double novoSal = calcReajuste(sal, reajuste);
        System.out.println("O reajsute de seu salario foi de "+novoSal+"seu novo salario é: "+(novoSal+sal));
    }
    public static double calcReajuste(int sal, double reajuste){
        double calcReajuste = (sal * reajuste) / 100;
        return calcReajuste;
    }
}
