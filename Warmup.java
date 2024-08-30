import java.util.Scanner;

public class Warmup {
    public boolean sleepIn(boolean isWeekday, boolean isVacation) {
        boolean canSleepIn = !isWeekday || isVacation;
        return canSleepIn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input for weekday
        System.out.print("Is it a weekday? (true/false): ");
        boolean isWeekday = scanner.nextBoolean();
        
        // User input for vacation
        System.out.print("Are you on vacation? (true/false): ");
        boolean isVacation = scanner.nextBoolean();
        
        Warmup warmup = new Warmup();
        
        // Determine if the user can sleep in and print the result
        boolean canSleepIn = warmup.sleepIn(isWeekday, isVacation);
        System.out.println("Can you sleep in? " + canSleepIn);
        
        scanner.close();
    }
}
