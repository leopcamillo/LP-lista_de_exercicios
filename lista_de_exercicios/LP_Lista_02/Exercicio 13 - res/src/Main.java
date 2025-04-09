import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  raio, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a raio da circunferecia:  ");
        raio = in.nextDouble();

        area = Math.PI * Math.pow(raio,2);
        System.out.println("area: " + area );


    }
}