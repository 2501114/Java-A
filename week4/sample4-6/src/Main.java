import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in );
        float height;
        float weight;
        final float FEETUNIT = 30.48f;
        final float POUNDUNIT = 2.20362f;
        float feet, pound;

        System.out .printf("당신의 키는 얼마입니까 ?(Cm) : ");
        height = keyboard.nextFloat();

        System.out .printf("당신의 몸무게는 얼마입니까 ?(Kg) : ");
        weight = keyboard.nextFloat();

        feet = height / FEETUNIT;
        pound = weight / POUNDUNIT;

        System.out .printf("당신의 키는 %.3f 피트(feet) 입니다.\n", feet);
        System.out .printf("당신의 몸무게는 %.3f 파운드(pound)입니다.\n", pound);
    }
}