import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in );
    char type = '';
    int width = 0;
    int height - 0;
    int area = 0;
    System.out .printf("사각형의 가로길이와 세로 길이를 입력 : ");


    garo = input.nextInt( );
    sero = input.nextInt( );
    area = garo * sero;
    result = area > 0 ?
    String.format ("\n**** %c사각형 넓이 ****\n 가로 : %d Cm\n" + " 세로 : %d Cm\n 넓이 : %d Cm2\n", garo == sero ? '정' : '직', garo, sero, area) :
    String.format ("가로, 세로 길이를 정확하게 입력하세요\n");
    System.out .printf(result);
}