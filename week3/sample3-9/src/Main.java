import java.util.Scanner;

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in );
    final String name = "문자열";
    int batting = 0;
    int hit = 0;
    float result = 0.0f;

    System.out .print("오늘의 타수 : ");
    batting = keyboard.nextInt();
    System.out .print("오늘의 안타수 : ");
    hit = keyboard.nextInt();

    result = (float) hit / batting;


    System.out .printf("선수 이름 : %s\n", name);
    System.out .printf("오늘의 타수 : %ds\n", batting);
    System.out .printf("오늘의 안타수 : %ds\n", hit);
    System.out .printf("오늘의 타수 : %.2f\n", result);
}