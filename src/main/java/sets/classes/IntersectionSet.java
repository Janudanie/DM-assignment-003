package sets.classes;

public class IntersectionSet implements IntegerSet{
    private final IntegerSet first;
    private final IntegerSet second;

    public IntersectionSet(IntegerSet first, IntegerSet second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isMember(long member) {
        return first.isMember(member) && second.isMember(member);
    }


}
