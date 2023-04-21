package baseball;
import net.bytebuddy.asm.Advice;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("숫자 야구 게임을 시작합니다.");
        MakeNumber randomNumber = new MakeNumber();
        List<Integer> computer = randomNumber.makeNumber();
        EnterNumber enterNumber = new EnterNumber();
        enterNumber.enterNumber(computer);
        Result resultPrinter = new Result();


    }
}
