package org.launchcode.java.demos.java4python.methods;

/**
 * Created by Splodey on 5/8/2017.
 */
public class Max {

    public static int max(int[] vals) {
        int result = vals[0];

        for (int val : vals) {
            if (val > result) {
                result = val;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] vals = {-5, -4, -3, -2, -1};

        System.out.println(Max.max(vals));
    }
}
