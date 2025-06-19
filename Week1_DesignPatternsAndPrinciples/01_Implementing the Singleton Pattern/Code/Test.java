
public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getTheInstance();
        logger1.Msg("First log");

        Logger logger2 = Logger.getTheInstance();
        logger2.Msg("Second log");

        if (logger1 == logger2) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }
    }
}
PS C:\Users\mysel\OneDrive\Desktop\TLE\Cognizant-JAVA-FSE\Week_1_Design_Patterns_and_Principles\SingletonPatternExample> javac *.java
>>
PS C:\Users\mysel\OneDrive\Desktop\TLE\Cognizant-JAVA-FSE\Week_1_Design_Patterns_and_Principles\SingletonPatternExample> java Test   
Instance succesfully created
First log
Second log
Same instance