package sets.classes;

public interface IntegerSet {


    boolean isMember(long member);


    default IntegerSet union(IntegerSet other) {
        return new UnionSet(this, other);
    }
    default IntegerSet difference(IntegerSet other){
        return new DifferenceSet(this,other);
    }
    default IntegerSet intersection(IntegerSet other){
        return new IntersectionSet(this,other);
    }

    default IntegerSet complement(IntegerSet other){
        return new ComplementSet(this,other);
    }

}
