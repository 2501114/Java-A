import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char type = ' ';
        int width = 0;
        int height = 0;
        int area = 0;

        System.out.printf("사각형의 가로 길이 입력");
        width = keyboard.nextInt();
        System.out.printf("사각형의 새로 길이 입력");
        height = keyboard.nextInt();

        type = width == height ? '정' : '적';
        area = width * height;





        System.out.printf("****%c사각형 넓이******\n",type);
        System.out.printf("가로길이: %d Cm\n",width);
        System.out.printf("세로길이: %d Cm\n",height);
        System.out.printf("넓 이: %d\u33a8\n",area);

    }
}