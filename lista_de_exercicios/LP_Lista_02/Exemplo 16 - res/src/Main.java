import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, altura, area, volume;

        Scanner in = new Scanner(System.in);

        System.out.println("digite o valor da base do triangulo retagulo:  ");
        raio = in.nextDouble();

        System.out.println("Digite o valor da altura do triangulo retangulo:  ");
        altura = in.nextDouble();

        area = Math.PI * Math.pow(raio,2);

        volume = area * altura / 3;
        System.out.println("area: " + volume );
        System.out.println("area: " + area );
    }
}