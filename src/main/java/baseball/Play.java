package baseball;
import java.util.ArrayList;
import java.util.List;
public class Play {
    public void playGame(){
        MakeNumber randomNumber = new MakeNumber();
        EnterNumber enterNumber = new EnterNumber();
        List<Integer> computer = new ArrayList<>();
        List<Integer> user = new ArrayList<>();
        CompareNumber compareNumber = new CompareNumber();
        ReStart chooseRetry = new ReStart();
        StringTolist listNumber = new StringTolist();
        Flag flag = new Flag(0);
        flag.setFlag(0);
        int STRIKE = 3;
        while(flag.getFlag() == 0){
            if(STRIKE == 3){
                computer = randomNumber.makeNumber();
            }
            STRIKE = 0;
            user = listNumber.toArraylist(enterNumber.enterNumber());
            STRIKE = compareNumber.compareNumber(computer,user);
            if(STRIKE == 3) {
                chooseRetry.reStart();
            }
        }
    }
}
