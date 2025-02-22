import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "UTF-8");

        
        System.out.println("Bem-vindo ao Limpador de Texto!");
        System.out.println("Insira o texto que você deseja limpar (digite 'FIM' para processar):");

        
        StringBuilder inputText = new StringBuilder();

        
        while (true) {
            String line = scanner.nextLine(); 
            if (line.equalsIgnoreCase("FIM")) { 
                break;
            }
            inputText.append(line).append("\n"); 
        }
        
        String cleanedText = TextCleaner.cleanText(inputText.toString());
        
        System.out.println("\nTexto limpo:");
        System.out.println(cleanedText);

        
        scanner.close();
    }
}
