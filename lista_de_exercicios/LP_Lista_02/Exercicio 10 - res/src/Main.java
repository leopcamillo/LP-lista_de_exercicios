import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, ml;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em milhas");
        ml = in.nextDouble();

        km = (ml*1.60934);
        System.out.println(+ km + " km/h " );
    }
}