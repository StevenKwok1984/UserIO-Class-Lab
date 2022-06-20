import java.util.Scanner;

public class UserIOImpl implements UserIO{
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String stringIn = sc.nextLine();
        return stringIn;
    }

    @Override
    public int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        int intIn = sc.nextInt();
        return intIn;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);

        System.out.println(prompt);
        int intIn = sc.nextInt();

        while (intIn < min || intIn > max) {
            System.out.println("Please enter a number between "+ min+ " and " + max +":");
            intIn = sc.nextInt();

        }
        return intIn;

    }

    @Override
    public double readDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        double doubleIn = sc.nextDouble();
        return doubleIn;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);

        System.out.println(prompt);
        double doubleIn  = sc.nextDouble();

        while (doubleIn < min || doubleIn > max) {
            System.out.println("Please enter a number between "+ min+ " and " + max +":");
            doubleIn = sc.nextInt();

        }
        return doubleIn;
    }

    @Override
    public float readFloat(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        float floatIn = sc.nextFloat();
        return floatIn;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner sc = new Scanner(System.in);

        System.out.println(prompt);
        float floatIn = sc.nextFloat();

        while (floatIn < min || floatIn > max) {
            System.out.println("Please enter a number between "+ min+ " and " + max +":");
            floatIn = sc.nextFloat();

        }
        return floatIn;
    }

    @Override
    public long readLong(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        long longIn = sc.nextLong();
        return longIn;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner sc = new Scanner(System.in);

        System.out.println(prompt);
        long longIn = sc.nextLong();

        while (longIn < min || longIn > max) {
            System.out.println("Please enter a number between "+ min+ " and " + max +":");
            longIn = sc.nextLong();
        }
        return longIn;
    }
}
