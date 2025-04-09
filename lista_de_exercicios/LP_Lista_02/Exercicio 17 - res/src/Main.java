import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double startspeed, aceleracao, tempo, speed;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial (m/s):  ");
        startspeed = in.nextDouble();

        System.out.println("Digite a aceleracao (m/s²):  ");
        aceleracao = in.nextDouble();

        System.out.println("Digite o tempo (s):  ");
        tempo = in.nextDouble();

        speed = startspeed + aceleracao * tempo;
        System.out.println("velocidade:  " + speed );
    }
}