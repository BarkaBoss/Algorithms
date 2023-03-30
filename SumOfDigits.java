public class SumOfDigits {

    int sumNumbers(int number){
        //number = 12345;
        int sum = 0;
        while(number > 0){
            sum += number%10;
            number = number/10;
        }
        return sum;
    }
}
