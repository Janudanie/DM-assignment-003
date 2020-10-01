import sets.classes.IntegerSet;
import sets.classes.RangeSet;


public class Main {
    public static void main(String[] args) {

        //Test Union
        IntegerSet A = new RangeSet(30, Long.MAX_VALUE);
        IntegerSet B = new RangeSet(Long.MIN_VALUE, 21);
        IntegerSet C = A.union(B);
        System.out.println("---");
        System.out.println("0:  "+C.isMember(0 ));  // true
        System.out.println("25: "+C.isMember(25));  // false
        System.out.println("32: "+C.isMember(32));  //true


        //Test Difference
        IntegerSet differenceA = new RangeSet(20, 45);
        IntegerSet differenceB = new RangeSet(25, 32);
        IntegerSet differenceC = differenceA.difference(differenceB);
        System.out.println("---");
        System.out.println("21: "+differenceC.isMember(21)); // true
        System.out.println("27: "+differenceC.isMember(27)); // false
        System.out.println("32: "+differenceC.isMember(32)); // false
        System.out.println("38: "+differenceC.isMember(38)); // true


        //Test intersection
        IntegerSet intersectionA = new RangeSet(20, 45);
        IntegerSet intersectionB = new RangeSet(12, 32);
        IntegerSet intersectionC = intersectionA.intersection(intersectionB);
        System.out.println("---");
        System.out.println("21: "+intersectionC.isMember(18)); // false
        System.out.println("27: "+intersectionC.isMember(27)); // true
        System.out.println("32: "+intersectionC.isMember(32)); // true
        System.out.println("38: "+intersectionC.isMember(38)); // false


        //Test complement
        IntegerSet complementA = new RangeSet(45, 100);
        IntegerSet complementB = new RangeSet(12, 32);
        IntegerSet complementC = complementA.complement(complementB);
        System.out.println("---");
        System.out.println("18: "+complementC.isMember(18)); // false
        System.out.println("37: "+complementC.isMember(37)); // true
        System.out.println("101: "+complementC.isMember(101)); // true
        System.out.println("45: "+complementC.isMember(45)); // false
    }
}
