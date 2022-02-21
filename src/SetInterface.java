import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        List<Integer> numeros1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 5, 3, 4,
                11, 12, 15, 45, 12, 11, 7, 8, 8, 9, 6, 9, 3);
        System.out.println("Lista 1 com números repetidos:");
        numeros1.forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();

        System.out.println("Set 1 sem números repetidos");
        Set<Integer> numerosNaoRepetidos1 = new HashSet<>(numeros1);
        numerosNaoRepetidos1.forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();

        List<Integer> numeros2 = List.of(78, 12, 54, 1, 2, 5, 4, 6, 8, 7, 45, 11, 12,
                1, 2, 3, 1, 2, 4, 5, 8, 7, 4, 4, 8, 2, 1);
        System.out.println("Lista 2 com números repetidos:");
        numeros2.forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();

        System.out.println("Set 2 sem números repetidos");
        Set<Integer> numerosNaoRepetidos2 = new HashSet<>(numeros2);
        numerosNaoRepetidos2.forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();

        System.out.println("União dos dois Sets");
        Set<Integer> uniao = new HashSet<>(numerosNaoRepetidos1);
        uniao.addAll(numerosNaoRepetidos2);
        uniao.forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();

        System.out.println("Interseção dos dois Sets");
        Set<Integer> intersecao = new HashSet<>(numerosNaoRepetidos1);
        intersecao.retainAll(numerosNaoRepetidos2);
        intersecao.forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();

        System.out.println("Diferença dos dois Sets");
        Set<Integer> diferenca = new HashSet<>(numerosNaoRepetidos1);
        diferenca.removeAll(numerosNaoRepetidos2);
        diferenca.forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();
    }
}
