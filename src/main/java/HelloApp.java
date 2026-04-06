public class HelloApp {

    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", " using substring
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}
