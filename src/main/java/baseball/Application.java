package baseball;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameStart start = new GameStart();
        start.gameStart();
        Play play = new Play();
        play.playGame();
    }
}
