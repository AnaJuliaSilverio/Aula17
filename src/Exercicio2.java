import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        double peso,altura;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println(dizerInformacao(nome));
        System.out.println(dizerInformacao(idade));
        System.out.println(dizerInformacao(peso,altura));


    }
    public static String dizerInformacao(String nome){
        String resultado = "Meu nome é "+nome;
        return resultado;
    }
    public static String dizerInformacao(int idade){
        String resultado = "Minha idade é "+idade;
        return resultado;
    }
    public static String dizerInformacao(double peso,double altura){
        String resultado = "Meu peso é "+peso+" e minha altura é "+altura;
        return resultado;
    }

}
