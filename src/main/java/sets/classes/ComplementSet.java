package sets.classes;

public class ComplementSet implements IntegerSet {


    private final IntegerSet first;
    private final IntegerSet second;

    public ComplementSet(IntegerSet first, IntegerSet second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isMember(long member) {
        return !first.isMember(member)&&!second.isMember(member) ;
    }

}
