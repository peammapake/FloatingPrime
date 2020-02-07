public class Main {

    public static void main(String[] args) {
        boolean bOk = true;
        String stringInput = "";
        int length = 0;
        while(bOk){
            stringInput = IOUtil.getString("Enter your number: ");
            try {
                float f = Float.parseFloat(stringInput);
            } catch (NumberFormatException nfe) {
                System.out.println("Bad number input: Not a correct numerical form\n");
                continue;
            }
            if(stringInput.matches("0.0")){
                bOk = false;
            }
            else if((Float.parseFloat(stringInput) < 1) || (Float.parseFloat(stringInput) > 10)){
                System.out.println("Bad number input: Must be between 1 to 10");
            }
            else if(stringInput.length() > 12){
                System.out.println("Bad number input: Overall input length cannot be over 12 characters long\n");
            }
            else{
                //float floatInput = Float.parseFloat(stringInput);
                length = stringInput.length();
                if(!FloatPrimer.primeFinder(stringInput,length)){
                    System.out.println("FALSE\n");
                }
                else System.out.println("TRUE\n");
            }
        }
        System.out.println("Program terminated");
        System.exit(0);
    }
}
