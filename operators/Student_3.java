package operators;
public class Student_3{
	public static void main(String[] args) {
		boolean theoryPassed = true;
        boolean practicalPassed = false;

        if (theoryPassed && practicalPassed) {
            System.out.println("The student has passed both theory and practical exams.");
        }
        else {
            System.out.println("The student has not passed both exams.");
        }
	}
}