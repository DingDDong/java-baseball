package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Result {
    public static void result(Integer[] userNumber) {
        if(userNumber[0] == 0 && userNumber[1] == 0){
            System.out.println("낫싱");
        }
        else if(userNumber[0] == 0){
            System.out.println(userNumber[1] + "볼");
        }
        else if(userNumber[1] == 0){
            System.out.println(userNumber[0] + "스트라이크");
        }
        else if(userNumber[0] != 0 && userNumber[1] != 0){
            System.out.println(userNumber[1] + "볼 " + userNumber[0] + "스트라이크");
        }
        else if(userNumber[0] == 3){
            System.out.println(userNumber[0] + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }
}
