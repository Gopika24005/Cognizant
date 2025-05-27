import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task = () -> {
            return "Task Completed by " + Thread.currentThread().getName();
        };

        Future<String> result = executor.submit(task);
        System.out.println(result.get());

        executor.shutdown();
    }
}
