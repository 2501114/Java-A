import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int kor;
        int eng;
        int math;
        int total =0;
        float avg= 0.0f;

        System.out.print("국어 점수 입력: ");
        kor = keyboard.nextInt();
        System.out.print("영어 점수 입력: ");
        eng = keyboard.nextInt();
        System.out.print("수학 점수 입력: ");
        math = keyboard.nextInt();


        System.out.printf("국어 점수 : %d\n" , kor);
        System.out.printf("영어 점수 : %d\n" , eng);
        System.out.printf("수학 점수 : %d\n" , math);

        total = kor + eng + math;
        avg = total / 3.0f;

        System.out.printf("총점 : %d\n" , total);
        System.out.printf("평균 : %.2f\n" , avg);
    }
}