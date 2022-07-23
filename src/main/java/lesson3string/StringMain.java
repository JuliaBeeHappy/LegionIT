package lesson3string;

public class StringMain {
    public static void main(String[] args) {
     StringMain lesson3 = new StringMain();
     int res = lesson3.sumOfTwoNumbers(2,4);
        System.out.println("the result is " + res);
        System.out.println(lesson3.getText());
    }

    public int sumOfTwoNumbers(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public String getText(){
        return "kdfkjreh";
    }




}
