import math.classes.Membership;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] setA = {1,2,3,4,6,7,9,11};
        int[] setB = {1,2,3,4,5,6,7,8,9,10,11};

//{1,2,6,8};
        Membership test = new Membership();


        System.out.println("Result " + test.checkSubset(setA,setB));
    }
}
