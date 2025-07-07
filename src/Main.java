import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Converter converter = new Converter();

        int option = 0;
        while (option != 7) {
            try {
                System.out.println(menu.getMenuInterface());
                option = Integer.parseInt(scanner.next());
                Conversion conversion = null;

                if (option >= 1 && option <= 6) {
                    System.out.println("Digite o valor que deseja converter: ");
                    var value = Double.parseDouble(scanner.next());

                    switch (option) {
                        case 1 -> conversion = converter.converts("USD", "ARS", value);
                        case 2 -> conversion = converter.converts("ARS", "USD", value);
                        case 3 -> conversion = converter.converts("USD", "EUR", value);
                        case 4 -> conversion =  converter.converts("EUR", "USD", value);
                        case 5 -> conversion = converter.converts("USD", "BRL", value);
                        case 6 -> conversion = converter.converts("BRL", "USD", value);
                    }

                    ConversionHistory conversionHistory = new ConversionHistory();
                    conversionHistory.registerHistory(conversion);

                } else if (option != 7) {
                    System.out.println("Opção inválida! Tente novamente.");
                }


            } catch (NumberFormatException | InputMismatchException e ) {
                System.out.println("Entrada inválida! Digite apenas números.");
            }
        }
        scanner.close();
        System.out.println("Programa finalizado com sucesso!");
    }
}
