package ClassWork;

import java.util.ArrayList;

public class HCF {
    public static void main(String[] args) {
        int[] hcf = new int[]{32, 48, 64};
        ArrayList<Integer> non = new ArrayList<>();
        int im = 2;
        for (int i = 0; i < hcf.length; i++) {
            for (int j = 0; j < hcf.length; j++) {


                if (im % hcf[i] != 0) {
                    non.add(im);
                } else {
                    break;
                }
                im++;
            }
            System.out.println(non);
        }
    }
}