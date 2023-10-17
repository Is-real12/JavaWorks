package MrChiWeekEndSnack.Functions;

public class BackToSenderLog {
    public static int calculateRiderPayment(int successfulDeliveries) {
        int amountPerParcel;
        if (successfulDeliveries < 5) {
            amountPerParcel = 2000;
        } else if (successfulDeliveries < 10) {
            amountPerParcel = 1800;
        } else if (successfulDeliveries < 30) {
            amountPerParcel = 1600;
        } else if (successfulDeliveries < 50) {
            amountPerParcel = 1500;
        } else if (successfulDeliveries < 100) {
            amountPerParcel = 1300;
        } else if (successfulDeliveries < 200) {
            amountPerParcel = 1200;
        } else if (successfulDeliveries < 500) {
            amountPerParcel = 1100;
        } else {
            amountPerParcel = 1000;
        }
        return (successfulDeliveries * amountPerParcel);
    }
}
