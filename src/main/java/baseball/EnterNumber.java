package baseball;
import camp.nextstep.edu.missionutils.Console;
import java.util.*;
public class EnterNumber {
    List<Integer> userNumber = new ArrayList<>();
    CompareNumber compareNumber = new CompareNumber();
    public int enterNumber(List<Integer> computer) {
        Flag flag = new Flag(0);
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        try {
            if (number.length() != 3)
                throw new IllegalArgumentException("IllegalArgumentException");
            if (number.charAt(0) == number.charAt(1) || number.charAt(0) == number.charAt(2)
                    || number.charAt(1) == number.charAt(2))
                throw new IllegalArgumentException("IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            flag.setFlag(1);
            return 0; // exit 쓰지 말라했으니 어떤식으로 해결할지 생각해보기
        }
        userNumber.clear();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            userNumber.add(digit);
        }
        return compareNumber.compareNumber(computer, userNumber);
    }
}

