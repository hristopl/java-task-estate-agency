package uni.plovdiv;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Estate>list = new ArrayList<>();

        Sales s1 = new Sales(25000,100);
        Sales s2 = new Sales(30000,80);
        Sales s3 = new Sales(50000,90);

        Rent r1 = new Rent(1200,90,1500);
        Rent  r2 = new Rent(850,60,1200);
        Rent r3 = new Rent(1000,100,1400);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(r1);
        list.add(r2);
        list.add(r3);

        double minPriceSale = Double.MAX_VALUE;
        double minPriceRent = Double.MAX_VALUE;

        for(var i:list){
            i.info();

            if(i instanceof Sales){
                if(i.getPrice()<minPriceSale){
                    minPriceSale = i.getPrice();
                }
            }
        }
        System.out.println("The lowest Sale estate price is: "+minPriceSale);
        System.out.println("The lowest Rent estate price is: "+minPriceRent);
    }
}
