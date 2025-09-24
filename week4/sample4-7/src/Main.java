import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in );
        float height, standard;
        System.out .print("당신의 키는 얼마입니까 ?(Cm) : ");
        height = keyboard.nextFloat();
        standard = (height - 100) * 0.9f;
        System.out .printf("키 %.1f Cm의 표준체중은 %.2f Kg입니다.\n", height, standard);
    }
}