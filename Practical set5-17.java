interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    @Override
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Result r = new Result();

        int mark = 55;
        double avg = 58.5;

        System.out.println("Marks: " + mark);
        System.out.println("Passed: " + r.isPassed(mark));

        System.out.println("Average: " + avg);
        System.out.println("Division: " + r.getDivision(avg));
    }
}