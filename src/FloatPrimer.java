public class FloatPrimer {

    public static boolean primeFinder(String input, int length){
        boolean isPrime = false;
        String checker = null;
        String bareNumber = dotTerminator(input);
        for(int i = 1; i <= 4; i++){
            checker = bareNumber.replace(bareNumber.substring(i,length-1),"");
            int n = Integer.parseInt(checker);
            if (n%2 == 0) isPrime = false;
            else {
                for (int j = 3; j * j <= n; j += 2) {
                    if (n % i == 0)
                        isPrime = false;
                }
            }
        }
        return isPrime;
    }

    private static String dotTerminator(String input){
        String bareNumber;
        bareNumber = input.replace(".","");
        return bareNumber;
    }

}
