import java.util.Scanner;

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in );
    char ch;
    String result;
    System.out .print(" 문자 입력 : ");
    ch = keyboard.next( ).charAt(0);

    result = ( 'a' <= ch && ch <= 'z' ) || ( 'A' <= ch && ch <= 'Z' ) || ( '0' <= ch && ch <= '9' ) ? "올바른 문자" : "올바르지 않은 문자";
    System.out .printf("%c는 %s 입니다\n", ch, result);
   }
}