import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        int radius = sc.nextInt();

        double circleArea = radius * radius * Math.PI;
        double boxArea = (2 * radius) * (2 * radius);
        double area = boxArea - circleArea;

        System.out.println("정사각형 면적: " + boxArea + " cm²");
        System.out.println("원의 면적: " + circleArea + " cm²");
        System.out.println("구하는 면적: " + area + " cm²");
    }
}