import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade (m/s)");
        ms = in.nextDouble();

        km = (ms*3.6);
        System.out.println(+ km + " km/h " );


    }
}