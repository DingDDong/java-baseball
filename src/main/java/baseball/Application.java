package baseball;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("숫자 야구 게임을 시작합니다.");
        MakeNumber randomNumber = new MakeNumber();
        EnterNumber enterNumber = new EnterNumber();
        List<Integer> computer = new ArrayList<>();
        ReStart chooseRetry = new ReStart();
        Flag flag = new Flag(0);
        flag.setFlag(0);
        int i = 3;
        while(flag.getFlag() == 0){
            if(i == 3){
                computer = randomNumber.makeNumber();
            }
            i = 0;
            i = enterNumber.enterNumber(computer);
            if(i == 3) {
                chooseRetry.reStart();
            }
        }
    }
}
