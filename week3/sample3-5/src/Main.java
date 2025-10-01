import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float litter = 0.0f;
        float km= 0.0f;
        float result = 0.0f;
        System.out.println("연료 소모량 입력: ");
        litter = keyboard.nextFloat();
        System.out.println("주행 거리 입력 : ");
        km = keyboard.nextFloat();

        result= km / litter;


        System.out.printf("연료 량 : %.2f litter\n", litter);
        System.out.printf("주행 거리: %.2f Km\n", km);
        System.out.printf("연비: %.2f Km/litter\n", km);
    }
}