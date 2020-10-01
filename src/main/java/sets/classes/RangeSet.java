package sets.classes;

public class RangeSet implements IntegerSet {
    private final long min;
    private final long max;

    public RangeSet(long min, long max) {
        this.min = min;
        this.max = max;
    }


    @Override
    public boolean isMember(long member) {
        return min <= member && member <= max;
    }


}
