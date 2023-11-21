package ArrayImp;

import java.util.ArrayList;

public class ImplimentingArray {
    private int[] myArray;
    private String[] myArrays;

     private  int size;
    public ImplimentingArray(final int size) {
        this.myArray = new int[size];
        this.myArrays = new String[size];
        this.size = 0;
    }

    public void  addMyArray(int element ) {
     if (size < myArray.length){
         myArray[size] = element;
         size++;
     }else {
         throw new ArrayIndexOutOfBoundsException("This illegal and out of bound");
        }
    }

    public void  addMyArray(String element) {
        if (size < myArrays.length){
            myArrays[size] = element;
            size++;
        }else {
            throw new ArrayIndexOutOfBoundsException("This illegal and out of bound");
        }
    }

    public int[] getMyArray() {
        return myArray;
    }
    public String[] getMyArrays() {
        return myArrays;
    }
}
