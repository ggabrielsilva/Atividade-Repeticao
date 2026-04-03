import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int num;
        char resposta;

        resposta = 's';

        System.out.println("\nTabuada ");

        while (resposta == 's') {

            System.out.println();
            System.out.print("Por favor digite um número: ");
            num = teclado.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }

            System.out.println();
            System.out.print("Quer continuar? ");
            resposta = teclado.next().charAt(0);
        }

        System.out.println("\nPrograma encerrado.");

        teclado.close();
    }
}