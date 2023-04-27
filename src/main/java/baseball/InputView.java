package baseball;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputView() {
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        if (number.length() != 3)
            throw new IllegalArgumentException("3자리 숫자가 아닙니다.");
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) <= '0' || number.charAt(i) > '9') {
                throw new IllegalArgumentException("1~9까지의 숫자 3자리를 입력해 주세요.");
            }
        }
        if (number.charAt(0) == number.charAt(1) || number.charAt(0) == number.charAt(2)
                || number.charAt(1) == number.charAt(2))
            throw new IllegalArgumentException("중복된 숫자가 입력되었습니다.");
        return number;
    }
}