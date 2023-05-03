public class Main {
    public static void main(String[] args) {
        String original = "oculos";
        String invertido = "";

// Adiciona cada caractere da string original à nova string de trás para frente
        for (int i = original.length() - 1; i >= 0; i--) {
            invertido += original.charAt(i);
        }

// Exibe a string invertida
        System.out.println(invertido);

    }
}