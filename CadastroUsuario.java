/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author deusf
 */
public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner valoresEntrada = new Scanner(System.in);

        System.out.println("Login:");
        String login = valoresEntrada.nextLine();

        System.out.println("Senha:");
        String email = valoresEntrada.nextLine();

        System.out.println("Quantidade de tentativas");
        String mensagem = valoresEntrada.nextLine();

        System.out.println(
                String.format("Seu login é %s e sua senha é %s. Você tem %s "
                        + "tentativas antes de ser bloqueado.", login, email, mensagem));

    }
}
