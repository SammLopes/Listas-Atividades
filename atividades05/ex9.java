//package atividades05;


/**
 *
 * @author Samuel Lopes
 */
/*
 Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.
*/

import java.util.Scanner;
public class ex9 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de carros vendidos: ");
		int numCar = sc.nextInt();
		
		System.out.println("O valor total das vendas: ");
		double numVendas = sc.nextDouble();
		
		System.out.println("O valor do salario fixo: ");
		double salario = sc.nextDouble();
		
		System.out.println("O valor por carro vendido: ");
		double valorPorCarro = sc.nextDouble();
	
		double salarioFinal = comissao(numCar, numVendas, salario, valorPorCarro);
		System.out.println("O salario final é de: "+salarioFinal);
		sc.close();
	
	}
	
	public static double comissao(int numCar, double numVendas, double salario, double valorPorCarro){
		double comissaoPorCarro = valorPorCarro * numCar;
		double comissaoPercentual = 0.05 * numVendas;
		
		double salarioFinal = salario + comissaoPercentual + comissaoPorCarro;
		return salarioFinal;
		
	}
}










