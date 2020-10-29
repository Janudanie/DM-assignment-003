package compareState;

import sets.classes.IntegerSet;

public class State implements IntegerSet {
    private final long min;
    private final long max;
    private final int stateId;

    public State(long min, long max, int stateId) {
        this.min = min;
        this.max = max;
        this.stateId= stateId;
    }

    public int getStateId() {
        return stateId;
    }

    public long getMin() {
        return min;
    }

    public long getMax() {
        return max;
    }

    @Override
    public boolean isMember(long member) {
        return false;
    }
}
