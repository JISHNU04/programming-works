import java.lang.reflect.Array;
import java.util.*;
public class game{
    public static void main(String args[]){

        int spec = 3;
        int[] a = {1,1,2,3};
        int n = a.length;
        //
        for(int i=0;i<n;i++){
            if(a[i]==spec){
                System.out.println("invalid");
            }
            spec = 6 - a[i] - spec;
        }
        System.out.println("valid");

    }
}