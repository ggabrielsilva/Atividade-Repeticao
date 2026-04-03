import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int num;
        int i;
        char resposta;

        resposta = 's';

        System.out.println("\nTabuada ");

        while (resposta == 's') {

            System.out.println();
            System.out.print("Por favor digite um número: ");
            num = teclado.nextInt();

            i = 1;

            while (i <= 10) {
                System.out.println(num + " x " + i + " = " + num * i);
                i = i + 1;
            }

            System.out.println();
            System.out.print("Quer continuar? ");
            resposta = teclado.next().charAt(0);
        }

        System.out.println("\nProgama encerrado. ");

        teclado.close();
    }
}