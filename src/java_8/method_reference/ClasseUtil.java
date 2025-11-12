package java_8.method_reference;

public class ClasseUtil {

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public static String inverterTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

}
