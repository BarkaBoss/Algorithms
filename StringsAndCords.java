public class StringsAndCords {

    public String reverseString(String someTextToReverse){
        char[] charArray = someTextToReverse.toCharArray();
        String reversedString = "";

        for (int i = charArray.length - 1; i >= 0; i--){
            reversedString += charArray[i];
        }

        return reversedString;
    }

    public boolean uniqueCharacters(String sampleString){
        boolean isUnique = true;
        char[] charArray = sampleString.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            for (int j = i+1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]){
                    System.out.println(charArray[i] +" "+ charArray[j]+" i="+i+" j="+j);
                    isUnique = false;
                }
            }
        }
        return isUnique;
    }

    public boolean checkPalindrome(String sampleString){
        char[] stringChar = sampleString.toCharArray();
        String newString = "";
        boolean isPalindrome = false;

        for (int i = stringChar.length - 1; i >= 0 ; i--) {
            newString += stringChar[i];
        }

        if (sampleString.equals(newString)){
            return true;
        }
        return isPalindrome;
    }
}
