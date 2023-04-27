package baseball;
import camp.nextstep.edu.missionutils.Console;
import java.lang.Enum;
import java.util.*;
public class ReStart {
    public enum RestartEnum {
        RESTART("1"),
        EXIT("2");

        final private String tableValue;

        RestartEnum(String tableValue){
            this.tableValue = tableValue;
        }
        public String getTableValue() {
            return tableValue;
        }
    }
    Flag flag = new Flag(0);

    public boolean reStart(boolean flag) {
        RestartEnum restart = RestartEnum.valueOf("RESTART");
        RestartEnum exit = RestartEnum.valueOf("EXIT");

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String coin = Console.readLine();

        if (!restart.getTableValue().equals(coin) && !exit.getTableValue().equals(coin)) {
            throw new IllegalArgumentException("잘못된 값을 입력하였습니다.");
        }
        else if (exit.getTableValue().equals(coin)) {
            flag = false;
        }
        return flag;
    }
}

