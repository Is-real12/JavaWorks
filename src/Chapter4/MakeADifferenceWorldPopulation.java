package Chapter4;

public class MakeADifferenceWorldPopulation {

    public static void main(String[] args) {
//        System.out.println("Years\t\tPopulation\t\tNumerical Increase");
//
//long year = 8045311447L;
//
//long percent = year / 83 *100;
////        System.out.println(percent);
//        int time = 0;
//while (time <= 75){
//
//    year = year / 83 *100;
//
//    time++;
//    System.out.printf("%d           %d          %n ",time,year);
//}




               
        double realPopulation = 8045311447.0;
        double growthRate = 0.0083;


        System.out.println("Year\tPopulation\tPopulation Increase");


        double population = realPopulation;
        int year = 1;

        while (year <=75){
            double increase = population * growthRate;
            population += increase;


            System.out.printf("%d\t\t%f\t\t%f%n", year, population, increase);

            year++;
        }
    }
}


