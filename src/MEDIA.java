import java.util.Scanner;

public class MEDIA {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int qtde;
        double[] num;
        double soma = 0, media;
        String sinal;
        double sum;
        double div;


        System.out.println("Deseja encontrar a média ARITMETICA ou HARMONICA?");
        sinal = scan.next();

        System.out.print("Quantidade de numeros para tirar a média ");
        qtde = scan.nextInt();



        if (qtde >= 2) {
            num = new double[qtde];

            for (int i = 0; i < num.length; i++) {
              num[i] = scan.nextDouble();
              soma += num[i];
            }


        } else {

            System.out.print("ERRO! Adicione numéros e/ou quantidades validas");

        } if
        ("ARITMETICA".equals(sinal)){ media = soma/qtde;
        System.out.print("A média aritmética é " + media);}
        if
        ("HARMONICA".equals(sinal)){
            sum =(1/soma);
            div = qtde/sum;

            System.out.print("A média harmonica é " + sum);}

        }




    }






