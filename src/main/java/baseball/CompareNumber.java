package baseball;
import java.util.*;
public class CompareNumber {
    Integer[] strikeBall = new Integer[2];
    public int compareNumber(List<Integer> random, List<Integer> userNumber) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (random.get(i).equals(userNumber.get(i))) { // 스트라이크인 경우에
                strike += 1;
            } else if (random.contains(userNumber.get(i))) { // 볼인경우에
                ball += 1;
            }
        }
        strikeBall[0] = strike;
        strikeBall[1] = ball;
        return Result.result(strikeBall);
    }
}

