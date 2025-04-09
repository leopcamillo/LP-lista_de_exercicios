import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double scor1, scor2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a primeira nota:  ");
        scor1 = in.nextDouble();

        System.out.println("Informe a primeira nota:  ");
        scor2 = in.nextDouble();

        media = (scor1 + scor2*2) /3;
        System.out.println("media: " + media );

    }
}