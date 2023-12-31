//import static comabc.dasdf.*;

import comabc.*;

import javax.swing.text.html.Option;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.*;
import java.math.BigDecimal;
import java.util.Set;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static List<Customer> CUSTOMERS = List.of(
            new Customer(500567L, "Joe Smith", "joe.smith@example.com"),
            new Customer(923461L, "Susan Jones", "susan.jones@example.com"),
            new Customer(234507L, "Louise Miller", "lmiller@example.com"),
            new Customer(478828L, "Will Johnson", "wj@example.com"),
            new Customer(788276L, "John Baker", "jg_baker@example.com"));
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var fff = new CompletableFuture<Integer>();
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        ExecutorCompletionService<Integer> service =
                new ExecutorCompletionService<Integer>(threadPool);

        for (int i = 0; i < 3; i++) {
            final int a = i;
            service.submit(() -> {
                Thread.sleep(300);
                System.out.println("in");
                return a + 1;
            });
        }

        int count = 4;
        while (count > 0){
            System.out.println("getting");
            Future<Integer> f = service.poll(100, TimeUnit.MILLISECONDS);
            if (f != null) {
                System.out.println("Thread" + f.get() + " got done.");
                count--;
            }
        }
        threadPool.shutdownNow();
//        var f = service.take();
//        System.out.println(f);
//        while (f!=null){
//            System.out.println("r: " +f.get().toString());
//            f = service.poll();
//        }

    }
    private static Optional<Product> findProductById(long id){
        return Product.PRODUCTS.stream().filter(p -> p.id() == id).findFirst();
    }
//    private static Optional<List<Product>> findProductById(long id){
//        return Optional.of(Product.PRODUCTS.stream().filter(p -> p.id() == id).toList());
//    }
}

//class Exercise {
//
//    public static Optional<String> getCustomerName(List<Customer> customers, long customerId) {
//        return customers.stream().filter(x -> x.id() == customerId).map(Customer::name).findFirst();
//    }
//}


class Exercise {

    public static String getCustomerName(List<Customer> customers, long customerId) {
        return customers.stream()
                .filter(customer -> customer.id() == customerId)
                .findFirst()
                .map(Customer::name)
                .orElse("UNKNOWN");
    }
}

record Customer(long id, String name, String emailAddress) {
}

interface Animal{}
record Dog(String name) implements Animal{
    public void printAA(Object obj){

    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
record Cat(String name) implements Animal{}

@Command(value = "hello")
@Command(value = "ABC")
class Commander{

}
@Target({ElementType.TYPE , ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Repeatable(Commands.class)
@interface Command{
    String value();
    String desc() default "";
}

@Target({ElementType.TYPE , ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Commands{
    Command[] value();
}

record Product(long id, String name, BigDecimal price) {

    public static final List<Product> PRODUCTS = Arrays.asList(
            new Product(100463L, "Oranges", new BigDecimal("1.65")),
            new Product(267281L, "Gouda cheese", new BigDecimal("6.79")),
            new Product(934799L, "Plates", new BigDecimal("12.95")),
            new Product(246238L, "Detergent", new BigDecimal("3.79")),
            new Product(367570L, "Soft drink", new BigDecimal("1.99")),
            new Product(592356L, "Pencils", new BigDecimal("5.79")),
            new Product(295695L, "Rice", new BigDecimal("2.99")),
            new Product(592496L, "Scourer", new BigDecimal("2.29")),
            new Product(527502L, "Milk", new BigDecimal("1.39")),
            new Product(100178L, "Notebook", new BigDecimal("4.99")),
            new Product(172982L, "Tea", new BigDecimal("4.29")),
            new Product(269912L, "Tomato sauce", new BigDecimal("1.39")),
            new Product(883763L, "Peanut butter", new BigDecimal("2.39")),
            new Product(923569L, "Red bell pepper", new BigDecimal("0.99")),
            new Product(485845L, "Spoons", new BigDecimal("14.95")),
            new Product(476371L, "Adhesive tape", new BigDecimal("5.39")),
            new Product(113871L, "Dish brush", new BigDecimal("3.49")),
            new Product(339337L, "Knives", new BigDecimal("9.95")),
            new Product(239834L, "Brown bread", new BigDecimal("3.99")),
            new Product(404019L, "Potatoes", new BigDecimal("1.59")),
            new Product(562001L, "Dishcloth", new BigDecimal("2.59")),
            new Product(377290L, "Apples", new BigDecimal("1.29")),
            new Product(397811L, "Ballpoint pens", new BigDecimal("6.79")),
            new Product(837481L, "Spaghetti", new BigDecimal("2.79")),
            new Product(967733L, "Forks", new BigDecimal("14.95")),
            new Product(482783L, "Paper towel", new BigDecimal("3.69")),
            new Product(947848L, "Coffee", new BigDecimal("7.49")),
            new Product(226762L, "Highlighter", new BigDecimal("2.29")),
            new Product(792002L, "Orange juice", new BigDecimal("3.49")),
            new Product(289838L, "Spring water", new BigDecimal("0.99")));
}
