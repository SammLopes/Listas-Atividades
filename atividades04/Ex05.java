package atividades4;
//Faça um programa que leia a nota da prova de 15 alunos e calcule e imprima a média geral dos alunos
//Use uma função para ler as notas e outra para calcular a média
//terminar

import java.util.Scanner;
public class Ex05 {
    private static double[] notaAluno = new double[15];
    public static void main(String[] args){
       
        lerNotas();
        mediaGeral();
        
    }
    public static double somaVet(){
        double soma = 0;
        for(int i = 0; i < notaAluno.length;i++){
            soma += notaAluno[i];
        }
        System.out.println("A soma das notas é de: "+soma);
        return soma;
    }
    public static void mediaGeral(){
           double media =  somaVet()/notaAluno.length;
           System.out.println("A media geraldos alunos é de : "+media);
    }
    public static void lerNotas(){
          Scanner sc= new Scanner(System.in);
         
         for(int i = 0; i < notaAluno.length;i++){
            System.out.println("Digite a nota do aluno "+i);
            notaAluno[i] = sc.nextInt();
           while(notaAluno[i] > 10 || notaAluno[i] < 0){
                  System.out.println("Digite uma nota valida entre 10 e 0!!!");
                  notaAluno[i] = sc.nextDouble();
            }
           
            
         }
         for(int i = 0; i < notaAluno.length; i++){
             System.out.println(notaAluno[i]+" , \n");
         }
         
    }
   
    
}
