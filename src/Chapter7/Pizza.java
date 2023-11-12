package Chapter7;

import ArrayAss.AgainMet;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;


public class Pizza {



    public static String PizaSize(int classicPeople, int hungryPeople, int superHungryPeople){

        ArrayList<Integer> pizzaSizes = new ArrayList<>();
        int ope = 4;
        int mediumSize = 6;
        int largeSize = 10;

        pizzaSizes.add(ope);
        pizzaSizes.add(mediumSize);
        pizzaSizes.add(largeSize);

        int classicSlices = classicPeople;
        int hungrySlices = hungryPeople * 2;
        int superHungrySlices = superHungryPeople * 4;

        int totalSlicesNeeded = classicSlices + hungrySlices + superHungrySlices;
        int totalBoxes = 0;
        int totalLeftover = 0;

        while (totalSlicesNeeded > 0) {

            for (int i = pizzaSizes.size() - 1; i >= 0; i--) {
                int boxSize = pizzaSizes.get(i);

                if (totalSlicesNeeded >= boxSize) {
                    int boxesNeeded = totalSlicesNeeded / boxSize;
                    totalBoxes += boxesNeeded;

                    totalLeftover += totalSlicesNeeded % boxSize;
                    totalSlicesNeeded = totalLeftover;
                    totalLeftover = 0;

                    break;
                }
            }
        }

        int totalCost = totalBoxes * 5000;
        return "\nTotal number of slices needed: "+totalSlicesNeeded+"\nTotal number of boxes to be bought: "+totalBoxes+"\nTotal number of leftover slices: "+totalLeftover+"\nTotal cost of the boxes is: "+totalCost;

    }

    public static void main(String[] args) {
    }
    private enum name{FINANCIAL, BUSINESS, EDUCATION}


    public String setName(String name){
        return name;
    }
}


