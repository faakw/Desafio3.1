package desafio3.pkg1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * Faça um programa que receba a altura e o sexo de uma pessoa e calcule e
 * mostre seu peso ideal, utilizando as seguintes fórmulas (onde h corresponde à
 * altura): ∙ Homens: (72,7 * h) - 58 ∙ Mulheres: (62,1 * h) – 44,7.
 */
public class Desafio31 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        String sexo;
        double altura, peso;
        System.out.println("Digite sua altura");
        altura = ler.nextDouble();
        ler.nextLine();
        System.out.println("Digite seu sexo(M ou F)");
        sexo = ler.nextLine();
        if (sexo.equalsIgnoreCase("M")) {
            peso = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é " + decimal.format(peso));
            if (sexo.equals("F")) {
                if (sexo.equals("f")) {
                    peso = (62.1 * altura) - 44.7;
                    System.out.println("Seu peso ideal é " + decimal.format(peso));
                }
            }
        }
    }

}
