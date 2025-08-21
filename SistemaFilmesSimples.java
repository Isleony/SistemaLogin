package aula04;

import java.util.Scanner;

public class SistemaFilmesSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        boolean logado = false;
        String[] filmes = new String[100];
        int totalFilmes = 0;

        while (true) {
            if (!logado) {

                System.out.println("\n=== LOGIN ===");
                System.out.print("Usuário: ");
                String usuario = scanner.nextLine();
                System.out.print("Senha: ");
                String senha = scanner.nextLine();

                if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                    logado = true;
                    System.out.println("Login realizado com sucesso!");
                } else {
                    System.out.println("Usuário ou senha incorretos!");
                }
            } else {

                System.out.println("SISTEMA DE FILMES: ");
                System.out.println("1. Cadastrar filme:");
                System.out.println("2. Listar filmes");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:

                        if (totalFilmes < filmes.length) {
                            System.out.print("Digite o nome do filme: ");
                            <br>
                            System.out.print("Digite o ano do filme: ");
                            <br>
                            System.out.print("Digite o genero do filme: ");
                            <br>
                            String filme = scanner.nextLine();
                            filmes[totalFilmes] = filme;
                            totalFilmes++;
                            System.out.println("Filme cadastrado com sucesso!: " + filme);
                        } else {
                            System.out.println("Limite de filmes atingido!");
                        }
                        break;

                    case 2:

                        System.out.println("Filmes cadastrados");
                        if (totalFilmes == 0) {
                            System.out.println("Nenhum filme cadastrado.");
                        } else {
                            for (int i = 0; i < totalFilmes; i++) {
                                System.out.println((i + 1) + ". " + filmes[i]);
                            }
                        }
                        break;

                    case 3:

                        logado = false;
                        System.out.println("Logout realizado. Volte sempre!");
                        break;

                    default:
                        System.out.println("Ta invalido!");
                }
            }
        }
    }
}
