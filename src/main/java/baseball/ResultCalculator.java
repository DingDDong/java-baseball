package baseball;
import java.util.*;
public class ResultCalculator {
    public int resultCalculator(List<Integer> random, List<Integer> userNumber) {
        List<Integer> strikeBallList = new ArrayList<>();
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (random.get(i).equals(userNumber.get(i))) {
                strike += 1;
            } else if (random.contains(userNumber.get(i))) {
                ball += 1;
            }
        }
        strikeBallList.add(0, strike);
        strikeBallList.add(1, ball);
        return Result.result(strikeBallList);
    }
}

