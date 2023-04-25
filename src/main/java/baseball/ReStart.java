package baseball;
import camp.nextstep.edu.missionutils.Console;

public class ReStart {
    Flag flag = new Flag(0);

    public void reStart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String coin = Console.readLine();

        if (!coin.equals("2") && !coin.equals("1")) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        else if (coin.equals("2")) {
            flag.setFlag(2);
        }
    }
}

