package java_8.lambda;

public class ExemploCustomizado {

    public static void main(String[] args) {
        executaOperacaoSemLambda();
        executaOperacaoComLambda();
    }

    private static void executaOperacaoSemLambda() {
        Operacao subtracao = new Operacao() {
            @Override
            public int executar(int a, int b) {
                return a - b;
            }
        };
        System.out.println(subtracao.executar(5, 3));
    }

    private static void executaOperacaoComLambda() {
        Operacao subtracao = (a, b) -> a - b;
        System.out.println(subtracao.executar(5, 3));
    }

    @FunctionalInterface
    public interface Operacao {
        int executar(int a, int b);
    }

}