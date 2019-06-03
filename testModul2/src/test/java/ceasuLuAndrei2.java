public class ceasuLuAndrei2 {
    public static void main(String[] args) {
        Clock clock = new Clock(14,12,39);

        int hourBy5;
        int minutesBy5;
        String socondsEven = "      O";
        String seondsOdd = "      o";

        hourBy5 = clock.getHour()/5;
        minutesBy5 = clock.getMinutes()/5;


        int remainingHours = (clock.getHour() - (hourBy5 *5));

        int remaniningMinutes = (clock.getMinutes()-(minutesBy5 *5));

        if (clock.getSeconds() %2 == 0) {
            System.out.print(socondsEven);
        }
        else {
            System.out.print(seondsOdd);
        }
        System.out.println("");

        for (int i = 0; i < hourBy5 ; i++) {
            System.out.print(" H ");
        }

        System.out.println("");

        for (int j = 0; j < remainingHours; j++) {
            System.out.print(" h ");
        }
        System.out.println("");

        for (int k = 0; k < minutesBy5; k++) {
            System.out.print(" M ");
        }

        System.out.println("");

        for (int l = 0; l < remaniningMinutes; l++) {
            System.out.print(" m ");
        }

    }
}
