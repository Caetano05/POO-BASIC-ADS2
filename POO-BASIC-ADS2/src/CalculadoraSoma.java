import javax.swing.*;

public class CalculadoraSoma {
    public static void main(String[] args) {

        Integer numero1 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));


        Integer numero2 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));

        Integer soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "soma de nois interios" + soma,
                "CalculadoraSoma", JOptionPane.WARNING_MESSAGE);
    }
}
