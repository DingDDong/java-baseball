package baseball;
import java.util.ArrayList;
import java.util.List;
public class Play {
    public void playGame(){
        GameStart start = new GameStart();
        start.gameStart();
        MakeNumber randomNumber = new MakeNumber();
        InputView inputView = new InputView();
        List<Integer> computerNumber = new ArrayList<>();
        List<Integer> userNumber;
        ResultCalculator compareNumber = new ResultCalculator();
        ReStart chooseRetry = new ReStart();
        StringUtil listNumber = new StringUtil();
        boolean flag = true;
        int strike = 3;
        while(flag){
            if(strike == 3){
                computerNumber = randomNumber.makeNumber();
            }
            userNumber = listNumber.toArrayList(inputView.inputView());
            strike = compareNumber.resultCalculator(computerNumber,userNumber);
            if(strike == 3) {
                flag = chooseRetry.reStart(flag);
            }
        }
    }
}