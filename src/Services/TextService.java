package Services;

public interface TextService {

    String newGame();

    String playerMoveText();

    String computerMoveText(int count);

    String countText(int count);

    String endGameText();

    String errorCount();

    String play();

    String errorAns();

}