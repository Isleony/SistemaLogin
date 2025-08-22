packge Aula04

import java.util.Scanner;

public class SistemaFilmes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "admin";
        String senha = "123";
        boolean logado = false;
        String[] filmes = new String[50];
        int quantidade = 0;

        while (true) {
            if (!logado) {
                System.out.println("LOGIN ");
                System.out.print("Usuário: ");
                String inputUser = scanner.nextLine();
                System.out.print("Senha: ");
                String inputSenha = scanner.nextLine();
                
                if (inputUser.equals(usuario) && inputSenha.equals(senha)) {
                    logado = true;
                    System.out.println("Login feito!");
                } else {
                    System.out.println("Erro!");
                }
            } else {
                System.out.println("MENU ");
                System.out.println("1. Cadastrar filme");
                System.out.println("2. Ver filmes");
                System.out.println("3. Sair");
                System.out.print("Opção: ");
                
                int opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcao) {
                    case 1:
                        System.out.print("Nome do filme: ");
                        filmes[quantidade] = scanner.nextLine();
                        quantidade++;
                        System.out.println("Filme salvo!");
                        break;
                        
                    case 2:
                        System.out.println(" FILMES ");
                        if (quantidade == 0) {
                            System.out.println("Nenhum filme");
                        } else {
                            for (int i = 0; i < quantidade; i++) {
                                System.out.println((i+1) + ". " + filmes[i]);
                            }
                        }
                        break;
                        
                    case 3:
                        logado = false;
                        System.out.println("Saindo...");
                        break;
                        
                    default:
                        System.out.println("Inválido");
                }
            }
        }
    }
}

