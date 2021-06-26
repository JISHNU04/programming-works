  
/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
Example
For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
Input/Output
[time limit] 3000ms (java)
[input] array.integer a
If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.
Guaranteed constraints:
5 ¡Â a.length ¡Â 15,
-1 ¡Â a[i] ¡Â 200.
[output] array.integer
Sorted array a with all the trees untouched.
*/


import java.lang.reflect.Array;
import java.util.*;
public class sort{
    public static void main(String args[]){
        int[] inputarray = {-1, 150, 190, 170, -1, -1, 160, 180};
       // System.out.println(Arrays.toString(inputarray));
        int[] humanarray = new int[inputarray.length];
  
        for(int i=0;i<inputarray.length;i++){
            if(inputarray[i] != -1){
                humanarray[i] = inputarray[i];
            }
        }  
        Arrays.sort(humanarray);
      
        for(int i=0;i<inputarray.length;i++){
            if(inputarray[i] != -1)
            inputarray[i] = humanarray[i];
        }
          System.out.println(Arrays.toString(inputarray));

}
}