public class Atividade2 {
    public static void main(String[] args) {

        //EXERCICIOS2

        char d = '5';

        switch(d) {
            case '1' :
                System.out.println("Domingo");
                break;
            case '2' :
                System.out.println("Segunda");
                break;
            case '3' :
                System.out.println("Terça");
                break;
            case '4' :
                System.out.println("Quarta");
                break;
            case '5' :
                System.out.println("Quinta");
                break;
            case '6' :
                System.out.println("Sexta");
                break;
            case '7' :
                System.out.println("Sabado");
                break;
        }

        //1



        int valor = 10;
        while (valor < 20) {
            System.out.println("Valor: " + valor);
            valor++;
        }

        //2


        int valorb = 10;
        do {
            System.out.println("Valor: " + valorb);
            valorb++;
        }while (valorb < 20);

        //3

        int h = 5;
        int b = 3;
        int B = 7;

        int area = (h*(b+B))/2;

        System.out.println(area);

        //4


        //FIMEXERCICIO2
    }
}