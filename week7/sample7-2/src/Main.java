import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.print("점수 입력 :");
        num = keyboard.nextInt();

        result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("입력한 점수 %d는 %s 입니다.\n",num,result);


        if (num % 2 == 0) {
            result = "짝수";

        } else {
            result = "홀수";
        }

        System.out.printf("입력한 점수 %d는 %s 입니다.\n",num,result);


        switch ( num % 2){
            case 1:
                result = "홀수";
                break;
            case 2:
                result = "짝수";
                break;
        }
        System.out.printf("입력한 점수 %d는 %s 입니다.\n",num,result);

    }
}