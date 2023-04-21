package baseball;
import camp.nextstep.edu.missionutils.Console;
import java.util.*;
public class EnterNumber {
    public void enterNumber(List<Integer> computer) {
        List<Integer> userNumber = new ArrayList<>();
        CompareNumber compareNumber = new CompareNumber();
        Flag flag = new Flag;
        flag.setFlag(0);
        while (flag.getFlag() == 0) {
            System.out.print("숫자를 입력해주세요 : ");
            String number = Console.readLine();
            try {
                if (number.length() != 3)
                    throw new IllegalArgumentException();
                if (number.charAt(0) == number.charAt(1) || number.charAt(0) == number.charAt(2)
                        || number.charAt(1) == number.charAt(2))
                    throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.exit(0); // exit 쓰지 말라했으니 어떤식으로 해결할지 생각해보기
            }
            for (int i = 0; i < number.length(); i++) {
                int digit = number.charAt(i) - '0';
                userNumber.add(digit);
            }
            compareNumber.compareNumber(computer, userNumber);
        }
    }

}

