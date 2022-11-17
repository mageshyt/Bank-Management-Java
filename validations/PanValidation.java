package validations;

public class PanValidation {
    public static boolean isValid(String pan) {
        String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";

        java.util.regex.Pattern pat = java.util.regex.Pattern.compile(panRegex);
        if (pan == null)
            return false;
        return pat.matcher(pan).matches();
    }

}
