import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, ml;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade (km/h)");
        km = in.nextDouble();

        ml = (km*0.621371);
        System.out.println(+ ml + " milhas " );
    }
}