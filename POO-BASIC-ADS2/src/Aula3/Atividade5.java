package Aula3;
import javax.swing.*;

public class Atividade5 {

    public static void main(String[] args) {


        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1° numero:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2° numero:"));

        try {
            int soma = numero1 + numero2;
            int sub = numero1 - numero2;
            int mult = numero1 * numero2;
            int div = numero1 / numero2;

            System.out.println("Resultado da divisão: " + div);
            System.out.println("Resultado da multiplicação: " + mult);
            System.out.println("Resultado da soma: " + soma);
            System.out.println("Resultado da subtração: " + sub);

        } catch (ArithmeticException e) {
            System.out.println("Erro: ArithmeticException - Divisão por zero não é permitida.");
        }
    }
}
