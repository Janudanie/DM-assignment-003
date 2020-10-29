package compareState;

import java.util.ArrayList;
import java.util.List;

public class ComputerState {
    private List<State> computerState= new ArrayList<State>();

    public void setComputerState(State state) {
        this.computerState.add(state);
    }


    public boolean hasState(int stateId){
        //find a computerstate id (false // true)
        int size = computerState.size();
        for (int x = 0 ; x<size ; x++){
            if(computerState.get(x).getStateId() == stateId) {
                return true;
            }
        }
        return false;
    }

    public State findState(int stateId){
        // find a state from computer state using the stateId
        int size = computerState.size();
        for (int x = 0 ; x<size ; x++){
            if(computerState.get(x).getStateId()==stateId){
                return computerState.get(x);
            }
        }
        return null;
    }

    public boolean isSubsetOf(ComputerState other){
        //Is this object a subset of other object
        int size = computerState.size();
        for(int x = 0 ; x<size ; x++){
            int tempStateId = computerState.get(x).getStateId();

            // If the other computerState has this state, is it a subset of this state
            if(other.hasState(tempStateId)){
                if(compareStates(other.findState(tempStateId), this.findState(tempStateId))){
                    continue;
                }
                else return false;
            }
        }
        return true;
    }

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
