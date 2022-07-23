package lesson3string;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("dog");

    }

    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println("the String is null or empty");
        } else {
            System.out.println(String.format("The input string is %s", textToReverse));
            String result = "";
            int lastletter = textToReverse.length() - 1;
            for(int i = lastletter; i>=0; i--){
                result = result + textToReverse.charAt(i);
            }
            System.out.println(result);

        }
    }
}
