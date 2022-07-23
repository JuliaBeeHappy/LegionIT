package lesson2;

public class HomewWork {
    public static void main(String[] args) {
        HomewWork lesson2 = new HomewWork();
        lesson2.answerCell(false, false, false);

    }

    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep){
            System.out.println("false");
        }
        else if(isMorning && isMom){
            System.out.println("true");
        }
        else{
            System.out.println("true");
        }

    }

}
