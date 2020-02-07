public class FloatPrimer {

    public static boolean primeFinder(String input, int length){
        boolean prime = false;
        String checker = null;
        String bareNumber = dotTerminator(input);
        if((length -1) < 4){
            bareNumber += "000000";
        }
        for(int i = 2; i <= 4; i++){
            checker = bareNumber.replace(bareNumber.substring(i,bareNumber.length()),"");
            int n = Integer.parseInt(checker);
            if(isPrime(n)){
                prime = true;
                break;
            }
            else prime = false;
        }
        return prime;
    }

    private static String dotTerminator(String input){
        String bareNumber;
        bareNumber = input.replace(".","");
        return bareNumber;
    }

    private static boolean isPrime(int n){
        // Corner cases
        if (n == 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
