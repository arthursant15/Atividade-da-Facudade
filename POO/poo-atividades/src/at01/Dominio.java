package at01;

import java.util.Scanner;

public class Dominio {
    public int Digitar;{
        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite aqui sua altura");
        double altura = digitar.nextDouble();
        System.out.println("------------------------");
        System.out.println("Agora digite seu peso");
        double peso = digitar.nextDouble();
        System.out.println("------------------------");
    }



}
