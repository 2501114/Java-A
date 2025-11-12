public class Main {
    public static void main(String[] args) {
        long money = 0L;
        long test = 0L;

        for (int day = 1; true; day++) {
            test = ((day == 1) ? 1L : (test * 2L));
            money += test ;
            System.out.printf("%d일(%,11d원 : %,12d원\n",day, test,money);
            if (money >= 100000000L)
                break;
        }

    }
}