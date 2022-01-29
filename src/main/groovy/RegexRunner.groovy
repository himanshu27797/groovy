import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {

    static void main(String[] args) {
        String value = "one one one 1 two 2 hello world 3 three"

        Pattern pattern = Pattern.compile(value)
        Matcher matcher = pattern.matcher(pattern)
    }


}
