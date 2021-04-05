import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) throws Exception {
        // Limpar a tela do console
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // Objeto utilizado para entrada de dados
        Scanner entrada = new Scanner(System.in);

        // Declaração das variáveis.
        double b1, b2, h, area;
        // Valida as bases.
        do
        {
            System.out.print("Digite o valor da base menor: ");
            b1 = entrada.nextDouble();
            // Garante base menor positiva.
            b1 = Math.abs(b1);
            System.out.print("Digite o valor da base maior: ");
            b2 = entrada.nextDouble();
            // Garante base maior positiva.
            b2 = Math.abs(b2);
        } while ((b1 == 0) || (b2 == 0) || (b2 < b1));
        // valida a altura.
        do
        {
            System.out.print("Digite o valor da altura: ");
            h = entrada.nextDouble();
            // Garante altura positiva.
            h = Math.abs(h);
        } while (h < 0);
        // Fórmula da área do trapézio.
        area = ((b1 + b2) * h) / 2;
        System.out.println("\nÁrea Trapézio " + area);

        entrada.close();
    }
}
