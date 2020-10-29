package compareState;

public class CompareStates {

    public boolean compareStates(State a, State b){
        // Is B equal or less then A?
        if(a.getMin()<= b.getMin() && a.getMax() >= b.getMax()){
            // Is b less then A
            if (a.getMin()< b.getMin() || a.getMax() > b.getMax()) {
                return true;
            }
        }
        return false;
    }
}
