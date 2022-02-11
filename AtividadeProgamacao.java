package com.mycompany.atividade;

import java.util.Scanner;

public class AtividadeProgamacao {
    public static void main(String[] args) {
        Scanner valorEntrada = new Scanner(System.in);
        
        System.out.println("Quantos filho de 0 a 3 anos possui?");
        Integer filhosBebes = valorEntrada.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos possui?");
        Integer filhosCriancas = valorEntrada.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos possui?");
        Integer filhosAdolescentes = valorEntrada.nextInt();
        
        Double beneficioBebes = filhosBebes * 25.12;
        Double beneficiosCriancas = filhosCriancas * 15.88;
        Double beneficiosAdolescentes = filhosAdolescentes * 12.44;
        Double totalBeneficios = beneficioBebes + beneficiosCriancas + beneficiosAdolescentes;
        Integer totalFilhos = filhosBebes + filhosCriancas + filhosAdolescentes;
        System.out.println(
                    String.format("Você tem um total de %d filhos e vai "
                            + "R$%.2f de bolsa",totalFilhos,totalBeneficios)
        );
    }
}
