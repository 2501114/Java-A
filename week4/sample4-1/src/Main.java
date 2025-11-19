import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] id = new int[10];
        String[] name = new String[10];

        int[] mid = new int[10];
        int[] fin = new int[10];
        int[] quiz = new int[10];
        int[] report = new int[10];
        int[] attend = new int[10];

        double[] total = new double[10];

        System.out.println("10명 학생 정보 입력 (학번 이름 중간 기말 퀴즈 과제 출석), 한 줄에 한 학생씩:");

        // 10명의 데이터를 한 줄씩 입력
        for (int i = 0; i < 10; i++) {
            id[i] = sc.nextInt();
            name[i] = sc.next();
            mid[i] = sc.nextInt();
            fin[i] = sc.nextInt();
            quiz[i] = sc.nextInt();
            report[i] = sc.nextInt();
            attend[i] = sc.nextInt();

            total[i] = mid[i] * 0.15 +
                    fin[i] * 0.15 +
                    quiz[i] * 0.10 +
                    report[i] * 0.40 +
                    attend[i] * 0.20;
        }

        // 내림차순 정렬
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (total[i] < total[j]) {
                    double tmp = total[i];
                    total[i] = total[j];
                    total[j] = tmp;

                    int t1 = id[i]; id[i] = id[j]; id[j] = t1;
                    String t2 = name[i]; name[i] = name[j]; name[j] = t2;

                    int t3 = mid[i]; mid[i] = mid[j]; mid[j] = t3;
                    int t4 = fin[i]; fin[i] = fin[j]; fin[j] = t4;
                    int t5 = quiz[i]; quiz[i] = quiz[j]; quiz[j] = t5;
                    int t6 = report[i]; report[i] = report[j]; report[j] = t6;
                    int t7 = attend[i]; attend[i] = attend[j]; attend[j] = t7;
                }
            }
        }

        // 출력 (헤더 없이)
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d %s %d %d %d %d %d %.2f\n",
                    id[i], name[i], mid[i], fin[i], quiz[i],
                    report[i], attend[i], total[i]);
        }
    }
}