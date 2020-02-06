public class Main {

    public static void main(String[] args) {
        boolean bOk = true;
        String stringInput = "";
        while(bOk){
            stringInput = IOUtil.getString("Enter your number: ");
            if(stringInput.matches("0.0")){
                bOk = false;
            }
            else if(stringInput.length() > 12){
                System.out.println("Bad number input: Overall input length cannot be over 12 characters long\n");
            }
            else if((Float.parseFloat(stringInput) < 1) || (Float.parseFloat(stringInput) > 10)){
                System.out.println("Bad number input: Must be between 1.0 to 10.0\n");
            }
            else{
                System.out.println("yeah boy you did it\n");
            }
        }
        System.out.println("Program terminated");
        System.exit(0);
    }
}
