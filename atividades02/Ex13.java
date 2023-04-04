//escreva umalgoritmo que leia a quatidade de pontos minima para o time conseguir se classificar, e a quantidade de pontos de um time no campeonato,
// e a quantidade de partidas restantes, e o codigo deve escrever se o time esta classificado  um vitoria vai coresponder a 3 pontos um empate vale 1 ponto e um derrota  0 pontos 

import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos pontos seu time fez : ");
        int pontos = sc.nextInt();
        System.out.println("Quantas partidas restam: ");
        int partidasResta = sc.nextInt();
        System.out.println("Quantos pontos são necessários: ");
        int pontosNesc = sc.nextInt();
        
        int vitoria = 3;
        int empate = 1;
        int derrota = 0 ;
        
        double totVitoria = pontos / vitoria;
        double totVitoriasNesc = pontosNesc / vitoria;
        
        
        if(pontos > pontosNesc){
        
            System.out.println("Seu time já esta classificado");
            System.out.println("total de vitorias: "+totVitoria);
            System.out.println("Total de vitorias necessárias: "+totVitoriasNesc);
            
            
            
        }else{
            System.out.println("Não é possivel classificar seu time");       
        }
        
    }
}
