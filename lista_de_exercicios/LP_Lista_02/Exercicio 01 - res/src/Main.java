import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number;

        Scanner in = new Scanner(System.in);

        System.out.println(" Digite um Numero inteiro");
        number = in.nextDouble();

        number = number * 2;
        System.out.println("Dobro: "+ number);
    }

}
