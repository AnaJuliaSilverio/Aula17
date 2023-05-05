import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();
        System.out.println("De acordo com a sua nota :"+nota+" .Sua classicação é "+classificaAluna(nota));

    }
    public static char classificaAluna(double nota){
        char classifacao;
        if (nota>=9){
            classifacao = 'A';
        } else if (8<=nota && nota<9) {
            classifacao = 'B';
        } else if (7<=nota && nota<8) {
            classifacao = 'C';
        } else if (6<=nota && nota<7) {
            classifacao = 'D';
        }else{
            classifacao = 'E';
        }
        return classifacao;
    }
}
