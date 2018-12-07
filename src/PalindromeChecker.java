public Class PalindromeChecker{

        boolean checkIfPalindrome(String word)

        if(word.length()==0){return false;}

        word=word.toLowerCase();
        for(int i=0;i<word.length()/2;i++){
        if(word.charAt(i)!=word.charAt((word.length()-1)-i)){
        return false;
        }

        return true;
        }

        checkIfPalindrome("ballad");
}