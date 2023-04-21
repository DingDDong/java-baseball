package baseball;

import camp.nextstep.edu.missionutils.Console;

public class ReStart {
    public void reStart(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String coin = Console.readLine();
        Flag flag = new Flag;
        if (coin.equals("2")){
            flag.setFlag(1);
        }
    }
}
