package baseball;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class Result {
    public static int result(List<Integer> userNumber) {
        if(userNumber.get(0) == 0 && userNumber.get(1) == 0){
            System.out.println("낫싱");
        }
        else if(userNumber.get(0) == 0){
            System.out.println(userNumber.get(1) + "볼");
        }
        else if(userNumber.get(1) != 0 && userNumber.get(0) != 0){
            System.out.println(userNumber.get(1) + "볼 " + userNumber.get(0) + "스트라이크 ");
        }
        else if(userNumber.get(1) == 0){
            System.out.println(userNumber.get(0) + "스트라이크");
            if (userNumber.get(0) == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            }
        }
        return userNumber.get(0);
    }
}