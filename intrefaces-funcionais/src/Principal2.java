import java.util.function.*;

public class Principal2 {
    public static void main(String[] args) {
        IntPredicate predicate = num -> num > 90;

        IntFunction<String> function = num -> "numero " + num;

        IntSupplier supplier = () -> 20;

        IntConsumer consumer = num -> System.out.println("numero" + num);
    }

}