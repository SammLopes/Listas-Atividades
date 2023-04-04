package atividades05;

/**
 *
 * @author Samuel Lopes
 */
/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor. 
*/
import java.util.Scanner;
public class ex8 {
    public static final double IMPOSTOS = 45.0 ;
    public static final double DISTRIBUIDOR = 28.0;
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite o custo da fábrica: ");
        double custoFabrica = sc.nextDouble();
        calcCarro(custoFabrica);
    }
    
    public static void calcCarro(double custoFabrica){
        double distribuidor = (custoFabrica * DISTRIBUIDOR) / 100.000;
        double impostos = (custoFabrica * IMPOSTOS) / 100.000;
        double custoConsumidor = distribuidor + impostos;
        System.out.println("O custo do carro ao consumidor de um carro novo é: "+custoConsumidor);
    } 
}
