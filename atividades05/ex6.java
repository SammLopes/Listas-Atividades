package atividades05;

/*
Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores
*/
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args){
        votos();
    } 
    
    public static void votos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o total de eleitores do municipio: ");
        int eleitores = sc.nextInt();
        System.out.println("Digite o total de votos brancos: ");
        int votosBrancos = sc.nextInt();
        System.out.println("Digite o total de votos nulos: ");
        int votosNulos = sc.nextInt();
        System.out.println("Digite o total de votos válidos: ");
        int votosValidos = sc.nextInt();
        eleitores = votosBrancos + votosNulos + votosValidos;
        System.out.println("O total de votos foi de: "+eleitores);
        percentVotoBranco(votosBrancos);
        percentVotoNulos(votosNulos);
        percentVotosValidos(votosValidos);
    }
    
    public static String percentVotosValidos(int votosValidos){
        int percentual = (votosValidos * 100) / 50;
        return "O percenturla de votos validos é: "+percentual+" %";
    }
    
    public static String percentVotoNulos(int votosNulos){
        int percentual = (votosNulos * 100) / 50;
        return "O percentual de votos nulos é "+percentual+" %";
    }
    
    public static String percentVotoBranco(int votosBrancos){
        int percentual = (votosBrancos * 100) / 50 ;
        return " O percentual de votos brancos é "+percentual+" %";
    }
}

