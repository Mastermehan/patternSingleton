import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу;");
        logger.log("Просим пользователя ввести входные данные для списка;");
        System.out.println("Введите размер списка: ");
        int listSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу для значений: ");
        int upperBoundOfValues = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список;");
        Random random = new Random();
        List<Integer> source = IntStream.iterate(0,
                        i -> i < listSize,
                        i -> i + 1)
                .mapToObj(i -> random.nextInt(upperBoundOfValues))
                .collect(Collectors.toList());
                System.out.println("Вот случайный список: ");
                source.forEach(System.out::print);
                System.out.println(" ");
        logger.log("Просим пользователя ввести входные данные для фильтрации;");
        System.out.println("Введите порог для фильтра: ");
        int treshold = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(source);
        logger.log("Выводим результат на экран;");
        for (Integer x: result) {
            System.out.print( x + " ");
        }
        logger.log("Завершаем работу программы.");
    }
}


