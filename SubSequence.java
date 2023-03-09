import java.util.List;

public class SubSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int index = 0;

        for(int i = 0; i < array.size(); i++){
            if(sequence.get(index) == array.get(i)){
                index ++;
            }
            if(index == sequence.size()){
                return true;
            }
        }
        return false;
    }

    public static boolean isValidSubsequenceA(List<Integer> array, List<Integer> sequence) {

        int sqIdx = 0;
        int arrIdx = 0;

        while (sqIdx < sequence.size() && arrIdx < sequence.size()){
            if (sequence.get(sqIdx) == array.get(arrIdx)){
                sqIdx += 1;
            }
            arrIdx += 1;
        }

        return sqIdx == sequence.size();
    }
}
