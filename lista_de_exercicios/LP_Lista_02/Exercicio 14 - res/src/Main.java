import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  base, altura, area;

        Scanner in = new Scanner(System.in);

        System.out.println("digite o valor da base do triangulo retagulo:  ");
        base = in.nextDouble();

        System.out.println("Digite o valor da altura do triangulo retangulo:  ");
        altura = in.nextDouble();

        area = base * altura / 2;
        System.out.println("area: " + area );
    }
}