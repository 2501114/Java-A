import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int won;
        float convert;
        float dollar;

        System.out.print("달러 환율 입력: ");
        convert = keyboard.nextInt();
        System.out.print("원화 금액을 입력: ");
        won = keyboard.nextInt();

        dollar = won / convert;

        System.out.printf("원화 %,d원은 %,f 달러($) 입니다.\n", won, dollar);
    }
}