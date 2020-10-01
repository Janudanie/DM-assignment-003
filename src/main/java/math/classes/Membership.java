package math.classes;

import java.util.List;

public class Membership {
    //This class find if "setA" a subset of "setB"
    public int checkSubset(int[] setA, int[] setB ){
        int result = 2;
        // Result possible variable
        // -1 setB is a subset of setA
        // 0 the two set are the same
        // 1 setA is a subset of setB
        // 2 they are not the same, or a subset of each other
        int nextStepA = 0;
        int nextStepB = 0;


        while(nextStepA < setA.length || nextStepB < setB.length ){
            //Are the two the same
            if(setA[nextStepA] == setB[nextStepB] ){
                //At the end of each array, and result have not changed, means they are the same
                if(     nextStepA+1 == setA.length &&
                        nextStepB+1 == setB.length &&
                        result == 2){
                    result = 0;
                    break;
                }
                //if at the end of each set stop the while
                if( nextStepA+1 ==setA.length &&
                    nextStepB+1 == setB.length ) break;
                //step each array, if possible
                if(nextStepA +1 < setA.length ) nextStepA++;
                if(nextStepB +1 < setB.length ) nextStepB++;
                continue;
            }
            //setA is a subset of setB
            if(setA[nextStepA] > setB[nextStepB]){
                //Check if your at the end of setB and you arent looking for a setB is subset of setA
                if(nextStepB+1 == setB.length && result != 1){result =-1;break;}
                //Check if if there is evidence that setB is a subset of setA // error result
                if(result == -1){result = 2; break;} //breaks cause noone is subset of each other
                //Set the result to we are looking for a setA is a subset of setB
                result= 1;
                nextStepB++;
                //if we are at the end of setB, then setA is a subset of setB
                if(nextStepB == setB.length)break;
                continue;
            }
            //setB is a subset of setA
            if(setA[nextStepA] < setB[nextStepB]){
                //Check if your at the end of setA and you arent looking for a setA is subset of setB
                if(nextStepA+1 == setA.length && result != -1){result =1;break;}
                //Check if if there is evidence that setA is a subset of setB // error result
                if(result == 1) {result = 2;break;}
                //Set the result to we are looking for a setB is a subset of setA
                result= -1;
                nextStepA++;
                //if we are at the end of setA, then setB is a subset of setA
                if(nextStepA == setA.length)break;
                continue;
            }
        }
        return result;
    }
}