import java.util.Random;

public class LuckyNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int luckyNumber = rand.nextInt(100);
        System.out.println("Your lucky number is: " + luckyNumber);
    }
}
git commit -m "Initial commit"
git push origin main
