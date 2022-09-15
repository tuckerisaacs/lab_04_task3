public class Main {
    public static void main(String[] args)
    {
       double cardBalance=5000;
       double intRate=.17;

       double interestOne=cardBalance*intRate;
       double monthOne=interestOne+cardBalance;
       double interestTwo=monthOne*intRate;
       double monthTwo=monthOne+interestTwo;



       System.out.println("The balance after one month is "+monthOne+" and month two is "+monthTwo);
    }
}