import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    int[] myArray = new int[2];
    for(int i = 0; i < array.length; i++){
      for(int j = i+1; j < array.length; j++){

        if(array[i] + array[j] == targetSum){
          myArray[0] = array[i];
          myArray[1] = array[j];
          return myArray;
        }
        
      }
    }
    
    return new int[0];
  }
}
