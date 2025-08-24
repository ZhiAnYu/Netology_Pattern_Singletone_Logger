import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer num : source) {
            if (num >= treshold) {
                result.add(num);
                logger.log(String.format("Число %d проходит фильтр ", num));
            } else {
                logger.log(String.format("Число %d не проходит фильтр ", num));
            }
        }

        logger.log(String.format("Прошло %d элементов из %d ", result.size(), source.size()));
        logger.log("Выводим результат на экран: ");
        System.out.println("Отфильтрованный список: " + result.toString());
        return result;
    }
}