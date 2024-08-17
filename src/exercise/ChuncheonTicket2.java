package exercise;

public class ChuncheonTicket2 {

    public static void main(String[] args){

        final int SEINOR_AGE_STANDARD =70;
        int ageOfAlice = 70;
        String countryOfAlice = "USA";

        int ageOfKim = 65;
        String countryOfKim = "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        boolean isHalfPriceForAlice = (ageOfAlice >= SEINOR_AGE_STANDARD) && (countryOfAlice == "Korea");
        boolean isHalfPriceForKim = (ageOfKim >= SEINOR_AGE_STANDARD) && (countryOfKim == "Korea");
        boolean isHalfPriceForYoo = (ageOfYoo >= SEINOR_AGE_STANDARD) && (countryOfYoo == "Korea");


        System.out.println("Alice는 적용 대상자인가");
        System.out.println(isHalfPriceForAlice);
        System.out.println("Kim은 적용 대상자인가");
        System.out.println(isHalfPriceForKim);
        System.out.println("Yoo는 적용 대상자인가");
        System.out.println(isHalfPriceForYoo);


    }
}
