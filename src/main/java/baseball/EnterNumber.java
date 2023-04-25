package baseball;
import camp.nextstep.edu.missionutils.Console;
import java.util.*;
public class EnterNumber {
    public int enterNumber(List<Integer> computer) {
        List<Integer> userNumber = new ArrayList<>();
        CompareNumber compareNumber = new CompareNumber();
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        if (number.length() != 3)
            throw new IllegalArgumentException("IllegalArgumentException");
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') {
                throw new IllegalArgumentException("IllegalArgumentException");
            }
        }
        if (number.charAt(0) == number.charAt(1) || number.charAt(0) == number.charAt(2)
                || number.charAt(1) == number.charAt(2))
            throw new IllegalArgumentException("IllegalArgumentException");
        userNumber.clear();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            userNumber.add(digit);
        }
        return compareNumber.compareNumber(computer, userNumber);
    }
}

