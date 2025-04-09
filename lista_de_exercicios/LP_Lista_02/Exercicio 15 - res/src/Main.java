import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raio, altura, area, volume;

        Scanner in = new Scanner(System.in);

        System.out.println("digite o raio do cilindro :  ");
        raio = in.nextDouble();

        System.out.println("Digite a altura do cilindro:  ");
        altura = in.nextDouble();

        area = Math.PI * Math.pow(raio,2);

        volume = area * altura;
        System.out.println("area: " + volume );
    }
}