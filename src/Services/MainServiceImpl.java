package Services;

import java.util.Scanner;

public class MainServiceImpl implements MainService {
    private int countNow = 20;
    private boolean test = true;
    private String ans;

    AIServiceImpl aiService = new AIServiceImpl();
    TextServiceImpl textService = new TextServiceImpl();

    @Override
    public void newGame() {
        while (test) {
            reset();
            System.out.println(textService.newGame());
            waitSec();
            while (countNow > 0) {
                System.out.println(textService.computerMoveText(aiService.move(countNow)));
                countNow = countNow - aiService.move(countNow);
                System.out.println(textService.countText(countNow));
                System.out.println(textService.playerMoveText());
                countNow = countNow - playerMove();
                System.out.println(textService.countText(countNow));
                if (countNow <= 0) {
                    System.out.println(textService.endGameText());
                    System.out.println(textService.play());

                    test = getAns();
                }
            }
        }
    }

    @Override
    public Integer playerMove() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int playerMove = scanner.nextInt();
            if (playerMove <= 0 || playerMove > 3) {
                System.out.println(textService.errorCount());
            } else {
                return playerMove;
            }
        }
    }

    @Override
    public boolean getAns() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ans = scanner.nextLine();
            if (ans.equals("Да") || ans.equals("да")) {
                return true;
            } else if (ans.equals("Нет") || ans.equals("нет")) {
                return false;
            } else System.out.println(textService.errorAns());
        }
    }

    @Override
    public void waitSec() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void reset() {
        countNow = 20;
    }

}