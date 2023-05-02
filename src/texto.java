public class texto {
    public static void main(String[] args) {
        String[] textos = {"Hola", "cómo", "estás?", "Que", "es", "lo", "que", "estas", "estudiando?"};
        String resultado = "";

        for (String texto : textos) {
            resultado += texto + " ";
        }

        System.out.println(resultado);
    }
}
