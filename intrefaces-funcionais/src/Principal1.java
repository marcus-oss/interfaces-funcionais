import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal1 {
    public static void main(String[] args) {
        //inteface predicate
        Predicate<String> predicate = str -> str.startsWith("R");
        boolean comecaComR = predicate.test("Rafaela");
        System.out.println(comecaComR);

        //interface function
        Function<String, LocalDate> function = datastr -> LocalDate.now();
        LocalDate data = function.apply("2024-03-20");
        System.out.println(data);

        //interface supplier
        Supplier<LocalDateTime> supplierTime = () -> LocalDateTime.now();
        LocalDateTime dataTime = supplierTime.get();
        System.out.println(dataTime);

        //interface consumer
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello world");
    }
}