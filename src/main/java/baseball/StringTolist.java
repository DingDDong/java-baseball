package baseball;
import java.util.*;

public class StringTolist {
    public List<Integer> toArraylist(String number){
        List<Integer> userNumber = new ArrayList<>();

        userNumber.clear();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            userNumber.add(digit);
        }
        return userNumber;
    }
}
