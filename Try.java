import java.util.Scanner;

class Try {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        System.out.println("How many students are there?");
        n = console.nextInt();
        console.nextLine(); // consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.println("What is your name?");
            String name = console.nextLine();

            System.out.println("What is your favorite food?");
            String food = console.nextLine();

            System.out.println("How old are you?");
            int age = console.nextInt();
            console.nextLine(); // consume the newline character

            System.out.println("What is your major?");
            String major = console.nextLine();

            System.out.println("What is your year?");
            int year = console.nextInt();
            console.nextLine(); // consume the newline character

            System.out.println("What is your gender (M/F)?");
            String gender = console.nextLine();

            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("male")) {
                System.out.println("His name is " + name + ", his favorite food is " + food + ", he is " + age + " years old, he is studying " + major + ", and he is in year " + year + ".");
            } else if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("female")) {
                System.out.println("Her name is " + name + ", her favorite food is " + food + ", she is " + age + " years old, she is studying " + major + ", and she is in year " + year + ".");
            } else {
                System.out.println("Invalid gender input. Please enter 'M' or 'F'.");
            }
        }
    }
}