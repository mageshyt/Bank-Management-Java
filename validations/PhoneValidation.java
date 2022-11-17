package validations;

public class PhoneValidation {
    public static boolean isValid(String phone) {
        String phoneRegex = "^[0-9]{10}$";

        java.util.regex.Pattern pat = java.util.regex.Pattern.compile(phoneRegex);
        if (phone == null)
            return false;
        return pat.matcher(phone).matches();
    }

}
