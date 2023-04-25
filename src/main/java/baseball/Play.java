package baseball;
import java.util.ArrayList;
import java.util.List;
public class Play {
    public void playGame(){
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
