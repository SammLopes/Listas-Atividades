package atividades05;

/*
Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor
*/
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        int ant = ant(valor);
        System.out.println("O antecessor do valor: "+valor+" é "+ant);
    }
    
    public static int ant(int valor){
        int ant = valor - 1;
        return ant;
    }
}
