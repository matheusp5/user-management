package br.com.mxtheuz;

import br.com.mxtheuz.application.services.AuthService;
import br.com.mxtheuz.domain.entities.User;
import br.com.mxtheuz.screens.HomeScreen;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeScreen.Main();
        while (true) {
            HomeScreen.MainChoose();
        }

    }
}
