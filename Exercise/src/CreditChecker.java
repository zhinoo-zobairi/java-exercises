import java.util.Scanner;

public class CreditChecker {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700; 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float salary = getSalary(scanner);
        int creditScore = getCreditScore(scanner);
        scanner.close();
        boolean qualified = isUserQualified(salary, creditScore);   
        notifyUser(qualified);     
    }
    public static float getSalary(Scanner scanner){
        System.out.println("Enter your salary:");
        float salary = scanner.nextFloat();
        return salary;
    }
    public static int getCreditScore(Scanner scanner){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(float salary, int creditScore){
        
        if (salary > requiredSalary && creditScore >= requiredCreditScore ) {
            
            return true;
            
        } else {
            
            return false;
        }
    }

    public static void notifyUser(boolean qualified){
        System.out.println("-----------------------------");
        System.out.println("Final Result:");
        if (qualified) {
            System.out.println("Congrats! You are qualified!");
        } else System.out.println("Sorry, you are not qualified.");

    }
}
