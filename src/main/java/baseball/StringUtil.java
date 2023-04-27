package baseball;
import java.util.*;

public class StringUtil {
    public List<Integer> toArrayList(String number){
        List<Integer> userNumber = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            userNumber.add(digit);
        }
        return userNumber;
    }
}