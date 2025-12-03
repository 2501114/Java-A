import java.util.Scanner;
import java.util.Scanner;

public class Main {

    static final String[] HANGUL_NUM = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    static final String[] HANGUL_UNIT = {"", "십", "백", "천"};
    static final String[] BIG_UNIT = {"", "만", "억", "조"};

    public static String convert4Digits(String four) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < four.length(); i++) {
            int digit = four.charAt(i) - '0';
            int pos = 4 - i - 1;

            if (digit != 0) {
                sb.append(HANGUL_NUM[digit]).append(HANGUL_UNIT[pos]);
            }
        }
        return sb.toString();
    }

    public static String convertHangul(long money) {
        String s = String.format("%016d", money);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            String part = s.substring(i * 4, i * 4 + 4);
            String hangul = convert4Digits(part);
            if (!hangul.isEmpty()) {
                result.append(hangul).append(BIG_UNIT[3 - i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("금액 입력(최대 16자리): ");
        long money = sc.nextLong();

        System.out.println("한글 금액: " + convertHangul(money));
    }
}