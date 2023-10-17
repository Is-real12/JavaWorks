package MrChiWeekEndSnack.Functions;

public class TestDrillerPricing {
    public static int calculatePrice(int numberOfCopies) {
     if (numberOfCopies >= 500) {
        return numberOfCopies * 1000;
    } else if (numberOfCopies >= 200) {
        return numberOfCopies * 1100;
    } else if (numberOfCopies >= 100) {
        return numberOfCopies * 1200;
    } else if (numberOfCopies >= 50) {
        return numberOfCopies * 1300;
    } else if (numberOfCopies >= 30) {
        return numberOfCopies * 1500;
    } else if (numberOfCopies >= 10) {
        return numberOfCopies * 1600;
    } else if (numberOfCopies >= 5) {
        return numberOfCopies * 1800;
    } else {
        return numberOfCopies * 2000;
    }
}
}
