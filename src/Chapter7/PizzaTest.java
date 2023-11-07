package Chapter7;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
//    Scanner scanner = new Scanner(System.in);in
    @Test
void testing_for_price_and_boxes(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of classic people: ");
//        int classicPeople = scanner.nextInt();
//        System.out.print("Enter the number of hungry people: ");
//        int hungryPeople = scanner.nextInt();
//        System.out.print("Enter the number of super hungry people: ");
//        int superHungryPeople = scanner.nextInt();
        String did = """
                
                Total number of slices needed: 0
                Total number of boxes to be bought: 2
                Total number of leftover slices: 0
                Total cost of the boxes is: 10000""";
        assertEquals(did, Pizza.PizaSize(2, 0, 0));
    }
    @Test
    void  test_for_slices_needed(){
        String did = """
                
                Total number of slices needed: 0
                Total number of boxes to be bought: 0
                Total number of leftover slices: 0
                Total cost of the boxes is: 10000""";
        assertEquals(did, Pizza.PizaSize(1, 0, 0));
    }
}