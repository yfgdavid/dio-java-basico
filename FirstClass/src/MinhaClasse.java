public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "David";
        String segundoNome = "Victor";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String SegundoNome) {
        return ("Resultado do metodo = ") + primeiroNome.concat(" ").concat(SegundoNome);

    }
}
