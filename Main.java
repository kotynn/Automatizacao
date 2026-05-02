import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1- Criar Exel");
        System.out.println("2- Criar PDF");
        System.out.println("3- Criar Youtube");

        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Cirando Exel...");
                break;
            case 2:
                System.out.println("Resumindo PDF...");
                break;
            case 3:
                System.out.println("Resumindo vídeo");
                break;
        }
    }
}
