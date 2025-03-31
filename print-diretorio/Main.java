// Crie um programa que peça um diretório e imprima os nomes dos seus arquivos
// e os arquivos dos diretórios
// Crie uma função infinita

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("coloque o caminho do diretório(ou digite sair): ");
            String caminho = scan.nextLine();

            if (caminho == "sair"){
                System.out.println("finaliznado busca...");
                break;
            }

            listarArquivos(caminho);
        }
        
        scan.close();
    }

    public static void listarArquivos(String caminho){
        Path diretorio = Paths.get(caminho);

        if (!Files.exists(diretorio) || !Files.isDirectory(diretorio)) {
            System.out.println("não é um diretório");
            return;
        }

        try (Stream<Path> arquivos = Files.walk(diretorio)) {
            arquivos.forEach(arquivo -> System.out.println(arquivo.toAbsolutePath()));
        } catch (IOException e){
            System.out.println("erro para acessar o diretório: " + e.getMessage());
        }
    }

}
