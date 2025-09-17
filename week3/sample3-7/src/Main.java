public static void main(String[] args) {
    final int SPEED = 300000;
    final float YEAR = 365.25f;
    long light = 0L;
    light = SPEED * (long) (((YEAR * 24) * 60) * 60);

    System.out.printf("1년은 %.2f 일\n", YEAR);
    System.out.printf("1광년: %,d Km\n", light);
    System. out. printf("1광년: %,df Km\n", (long) light1);

}