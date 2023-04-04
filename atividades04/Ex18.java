
package atividades4;
/*Elabore uma função que recebe três números inteiros como parâmetro, representando horas, 
minutos e segundos. A função deve retornar esse horário convertido em segundos
*/
import java.util.Scanner;
public class Ex18 {
    private static int horas = 0;
    private static int minutos = 0;
    private static int segundos = 0;
    public static void main(String[] args){
        recebeTime();
    }
    
    public static void recebeTime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas: ");
        horas = sc.nextInt();
        System.out.println("Digite os minuttos: ");
        minutos = sc.nextInt();
        System.out.println("Digite os segundos: ");
        segundos = sc.nextInt();
        System.out.println("O horario que voce digitou: "+horas+":"+minutos+":"+segundos);
        int totSeg = transformaSegundo(horas, minutos, segundos);
        System.out.println("Total de segundos: "+totSeg);
    }
    
    public static int transformaSegundo(int horas, int minutos, int segundos){
        int converHorasSegundos = (horas * 60)* 60;
        int converteMinutosSegundos = minutos * 60;
        int seg = converHorasSegundos + converteMinutosSegundos + segundos;
        return seg;
    }
}

