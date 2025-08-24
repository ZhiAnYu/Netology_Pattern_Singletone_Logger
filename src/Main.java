import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        int N;
        int M;
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу ");

        Scanner scanner = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка ");
        System.out.print("Введите размер списка: ");
        N = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        M = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> source = createRandomArrayList(N, M);
        System.out.println("Вот случайный набор" + source.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию ");
        Filter filter = new Filter(f);
        filter.filterOut(source);

        logger.log("Завершаем программу ");

//       System.out.println(logger.getLoggerString());    // можно записать в файл.
    }

    private static List<Integer> createRandomArrayList(int n, int m) {
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n ; i++) {
            source.add(random.nextInt(m));
        }
        return source;
    }
}
