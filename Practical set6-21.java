class VotingApp {

    static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        int[] ages = {16, 18, 21};

        for (int age : ages) {
            try {
                System.out.println("\nChecking age: " + age);
                checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}