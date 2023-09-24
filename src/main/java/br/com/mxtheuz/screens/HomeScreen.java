package br.com.mxtheuz.screens;

import br.com.mxtheuz.Main;
import br.com.mxtheuz.application.services.AuthService;
import br.com.mxtheuz.domain.entities.User;

public class HomeScreen {

    private final static AuthService authService = new AuthService();

    public static void Main() {
        System.out.println();
        System.out.println("********************************");
        System.out.println("Gerenciamento de Usuários");
        System.out.println("********************************");
        HomeScreen.MainChoose();
    }


    public static void MainChoose() {
        System.out.println();
        System.out.println("1 - Criar novo usuário.");
        System.out.println("2 - Realizar log-in");
        System.out.println();
        System.out.print("O que você deseja fazer? ");
        int choose = Main.scanner.nextInt();

        if(choose == 1) {
            HomeScreen.CreateUserCommand();
        } else if (choose == 2) {
            HomeScreen.LoginUserCommand();
        } else {
            System.out.println();
            System.out.println("Erro! Escolha inválida.");
        }

    }

    private static void CreateUserCommand() {
        System.out.println();
        System.out.println("Sistema de criação de usuário");
        System.out.println();

        System.out.print("Nome: ");
        String name = Main.scanner.next();
        System.out.print("E-mail: ");
        String email = Main.scanner.next();
        System.out.print("Senha: ");
        String password = Main.scanner.next();

        authService.Register(name, email, password);
        System.out.println();
        System.out.println("Usuário criado com sucesso.");
    }


    private static void LoginUserCommand() {
        System.out.println();
        System.out.println("Sistema de log-in de usuário");
        System.out.println();

        System.out.print("E-mail: ");
        String email = Main.scanner.next();
        System.out.print("Senha: ");
        String password = Main.scanner.next();

        if(authService.Login(email, password)) {
            System.out.println();
            System.out.println("Sucesso, Usuário correto!");
        } else {
            System.out.println();
            System.out.println("Erro, usuário incorreto!");
        }
    }
}
