public class Main {
    public static void main(String[] args) {
        int wellDepth = 300;
        int climbDay = 55;
        int slipNight = 13;
        int days = 0;
        int position = 0;

        while (true) {
            days++;
            position += climbDay;
            if (position >= wellDepth) break;
            position -= slipNight;
        }

        System.out.println("달팽이는 " + days + "일 만에 우물을 탈출했습니다!");
        if (days <= 7) {
            System.out.println("방울꽃이 시들기 전에 도착했습니다!");
        } else {
            System.out.println("방울꽃이 시들기 전에 도착하지 못했습니다.");
        }
    }
}