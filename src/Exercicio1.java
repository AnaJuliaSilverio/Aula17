import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao,volume=1,canal=1;
        while (true){
            System.out.println("------------Escolha uma opcao---------------");
            System.out.println("1-Alterar canal \n2-Mudar o volume digite\n3-Sair\n");
            opcao = sc.nextInt();
            if (opcao == 1){
                canal = alterarCanal(canal);
            } else if (opcao==2) {
               volume = alterarVolume(volume);
            } else if (opcao==3) {
                break;

            }else{
                System.out.println("DIGITE UMA OPCAO VALIDA ");
            }
        }



    }
    public static int alterarVolume(int volume){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("------------Alterando volume---------------");
        System.out.println("------------Escolha uma opcao---------------");
        System.out.println("1-Aumentar volume\n2-Abaixar volume\n3-Mostrar volume");
        opcao = sc.nextInt();
        if (opcao == 1){
            if (volume<100){
                volume++;
            }else {
                System.out.println("Volume maximo");
            }
        } else if (opcao==2) {
            if (volume>0){

            }else {
                System.out.println("Televisão mutada");
            }
        } else if (opcao==3) {
            System.out.println("O volume atual e :"+volume);
        }
        System.out.println("Volume alterado");
            return volume;
    }
    public static int alterarCanal(int canal){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("------------Alterando canal---------------");
        System.out.println("------------Escolha uma opcao---------------");
        System.out.println("1-Aumentar canal\n2-Abaixar canal\n3-Mostrar canal atual");
        opcao = sc.nextInt();
        if (opcao == 1){
            if (canal<500){
                canal++;
            }else {
                System.out.println("Canal indisponivel");
            }
        } else if (opcao==2) {
            if (canal>0){
                canal--;
            }else {
                System.out.println("Canal indisponivel");
            }
        } else if (opcao==3) {
            System.out.println("Canal atual "+canal);
        }
        System.out.println("Canal alterado");
        return canal;
    }
}