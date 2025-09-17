public class Main {
    public static void main(String[] args) {

        int time = 25000;
        int work = 5;
        int day = 7;
        int money = 25000;

        money = money + ((time * work) * day);

        System.out .printf("시간당 급여 : %,d\n" ,time);
        System.out .printf("하루에 일한 시간 : %,d시간 \n", work);
        System.out .printf("일한 일수 : %,d 일\n", day);
        System.out .printf("나의 지갑 돈 : %,d\n", money);
    }
}