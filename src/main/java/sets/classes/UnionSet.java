package sets.classes;

public class UnionSet implements IntegerSet {
    private final IntegerSet first;
    private final IntegerSet second;

    public UnionSet(IntegerSet first, IntegerSet second) {
        this.first = first;
        this.second = second;
    }



    @Override
    public boolean isMember(long member) {
        return first.isMember(member) || second.isMember(member);
    }
}
