import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double  mm, pol;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em polegadas: ");
        pol = in.nextDouble();

        mm = pol * 25.4;
        System.out.println(pol + " pol = " + mm + "mm" );
    }
}