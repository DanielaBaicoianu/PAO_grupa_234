package validation;

public class AnimalValidation {
    public static boolean validateAge(int age) {
        if (age < 0) {
            return false;
        }
        return true;
    }
}
