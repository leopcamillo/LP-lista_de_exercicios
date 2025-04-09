import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, x;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente angular:  ");
        a = in.nextDouble();

        System.out.println("Digite o coeficente linear :  ");
        b = in.nextDouble();2

        x = -b/a;
        System.out.println(a + " x " + " + ");
        System.out.println("x :" + x);
    }
}