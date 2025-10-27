package java_8.lambda;

public class ImplementacaoThread {

    public static void main(String[] args) {
        criaThreadComLambda();
    }

    private static void criaThreadSemLambda() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Tarefa em Thread.");
            }
        });
        t.start();
    }

    private static void criaThreadComLambda() {
        Thread t = new Thread(() -> System.out.println("Tarefa em Thread com lambda."));
        t.start();
    }

}
