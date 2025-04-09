import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double pol,mm;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em milimetros: ");
        mm = in.nextDouble();

        pol = mm * 25/4;
        System.out.println(mm + " mm = " + pol + "pol" );
    }



}
