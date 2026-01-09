public class StudentResult {

    public static void main(String[] args) {

        int[] marks = {85, 76, 67, 90, 80};
        int total = 0;
        boolean hasFail = false;

        for (int m : marks) {
            if (m < 35) {
                hasFail = true;
            }
            total += m;
        }

        double average = total / (double) marks.length;

        if (hasFail) {
            System.out.println("Fail");
        } else if (average >= 75) {
            System.out.println("Distinction");
        } else if (average >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
