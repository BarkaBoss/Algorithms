import java.util.*;

class Fibonacci {
    public static int getNthFib(int n) {
        int first = 0, second = 1, next =0;

        for(int i = 0; i < n; i++){
            if(i <= 1){
                next = i;
            }else{
                next = first + second;
                first = second;
                second = next;
            }
        }
        return next;
    }
}
