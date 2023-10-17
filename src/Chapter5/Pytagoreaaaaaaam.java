package Chaptter5;

public class Pytagoreaaaaaaam {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (i*i + j*j == k*k){
                        System.out.printf("%d\t%d\t%d\n" , i, j, k);
                    }
                    
                }

            }
            
        }
    }
}
