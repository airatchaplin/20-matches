package Services;

public class AIServiceImpl implements AIServise {

    @Override
    public Integer move(int count) {
        if (count == 20) {
            return 3;
        } else if (count < 5) {
            return count - 1;
        } else {
            return (count - 5) % 4;
        }
    }
}