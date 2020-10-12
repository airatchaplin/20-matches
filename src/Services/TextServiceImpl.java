package Services;

public class TextServiceImpl implements TextService {
    @Override
    public String newGame() {
        return " ***** Новая Игра! *****";
    }

    @Override
    public String playerMoveText() {
        return " - Ход Игрока. Введите количество спичек: ";
    }

    @Override
    public String computerMoveText(int count) {
        return " - Ход компьютера. Количество выбранных компьютером спичек: ".concat(String.valueOf(count));
    }

    @Override
    public String countText(int count) {
        return "На столе осталось " + count + " спичек.";
    }

    @Override
    public String endGameText() {
        return " ***** Игра окончена. Вы проиграли!!! ***** ";
    }

    @Override
    public String errorCount() {
        return "Неверное колличество, введите число от 1 до 3.";
    }

    @Override
    public String play() {
        return " ***** Попробуешь еще обыграть меня? - Да / Нет *****";
    }

    @Override
    public String errorAns() {
        return "Я вас не понимаю, напишите Да или Нет !";
    }

}