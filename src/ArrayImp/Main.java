package ArrayImp;
import java.util.Arrays;

import  static  ArrayImp.ImplimentingArray.*;
public class Main {
    public static void main(String[] args) {

ImplimentingArray implimentingArray = new ImplimentingArray(5);



        implimentingArray.addMyArray(2);
        implimentingArray.addMyArray(3);
        implimentingArray.addMyArray(4);
        implimentingArray.addMyArray(5);
        implimentingArray.addMyArray(6);


        ImplimentingArray i = new ImplimentingArray(4);
        i.addMyArray("ope");
        i.addMyArray("lanre");




        System.out.println(Arrays.toString(i.getMyArrays()));
    }
    }

