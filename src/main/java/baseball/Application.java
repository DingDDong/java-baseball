package baseball;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("숫자 야구 게임을 시작합니다.");
        MakeNumber randomNumber = new MakeNumber();
        EnterNumber enterNumber = new EnterNumber();
        ReStart chooseRetry = new ReStart();
        Flag flag = new Flag(0);
        flag.setFlag(0);
        int i;
        while(flag.getFlag() == 0){
            List<Integer> computer = randomNumber.makeNumber();
            i = 0;
            i = enterNumber.enterNumber(computer);
            if(i == 3) {
                chooseRetry.reStart();
            }
        }
    }
}
