import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento no formato YYYY");
        int anoNascimento = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(anoNascimento, 1, 1);
        LocalDate dataAtual = LocalDate.now();

        int idade = calcularIdade(dataNascimento,dataAtual);

        System.out.println("A idade é " + idade + " anos");

        scanner.close();
    }

    private static int calcularIdade(LocalDate dataNascimento, LocalDate dataAtual) {
        return Period.between(dataNascimento, dataAtual).getYears();
    }

}
