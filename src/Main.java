import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empregado> empregados = List.of(
                new Empregado("Anderson", 5500.00),
                new Empregado("Miguel", 4526.50),
                new Empregado("Patrícia", 10000.00),
                new Empregado("Rafael", 2000.00),
                new Empregado("Alice", 4110.23),
                new Empregado("Pedro Jorge", 2366.20),
                new Empregado("Emma", 1000.00),
                new Empregado("Alynson", 7600.36),
                new Empregado("Cléa", 2850.80),
                new Empregado("Arlir", 2250.00)
        );

        System.out.println("Empregados com salário acima de R$ 5000.00:");
        empregados.stream()
                .filter(empregado -> empregado.getSalario() > 5000.00)
                .forEach(empregado -> System.out.println(empregado.getNome()));

        System.out.println("Soma dos salários de todos os empregados:");
        double total = empregados.stream()
                .mapToDouble(Empregado::getSalario).sum();
        System.out.printf("R$ %.2f%n", total);

        System.out.println("Todos os nomes, separados por vírgula");
        String nomes = empregados.stream()
                .map(Empregado::getNome)
                .collect(Collectors.joining(", "));

        System.out.println(nomes);
    }
}
