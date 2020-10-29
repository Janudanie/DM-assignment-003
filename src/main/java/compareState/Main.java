package compareState;

public class Main {

    public static void main(String[] args) {
      /*  State validStates = new State(20,200,10);
        State statesToCheck = new State(20,200,10);

        CompareStates compareStates = new CompareStates();


        System.out.println("Is statesToCheck a subset of validStates : " +compareStates.compareStates(validStates,statesToCheck));*/



        //Make the first computerState
        ComputerState first = new ComputerState();
        first.setComputerState(new State(10,19,1));
        first.setComputerState(new State(30,40,2));
        first.setComputerState(new State(15,100,3));
        first.setComputerState(new State(70,110,4));
        first.setComputerState(new State(30,40,5));


        //Make the second computerState
        ComputerState second = new ComputerState();
        second.setComputerState(new State(10,20,1));
        second.setComputerState(new State(30,40,5));
        second.setComputerState(new State(15,100,6));
        second.setComputerState(new State(70,110,6));
        second.setComputerState(new State(80,200,6));



        // Is first computerstate a subset of second computerstate
        System.out.println(first.isSubsetOf(second));
    }
}
