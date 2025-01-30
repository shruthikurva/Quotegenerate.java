import java.util.Random;
public class Quotegenerate {
    public static void main(String[] args) {
        String[] quotes={
            "The best way to predict the future is to invent it.",
            "Life is 10% what happens to us and 90% how we react to it.",
            "Success is not final, failure is not fatal:It  is the courage to continue that counts.",
            "Believe you can and you're halfway there.",
            "Don't watch the clock; do what it does.It comes from your own actions.",
        };
        Random random= new Random();
     int randomIndex= random.nextInt(quotes.length);
     System.out.println("Here is your random quote:"); 
     System.out.println(quotes[randomIndex]);
    }
        
    }
    

