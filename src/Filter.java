import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer x : list) {
            if (x <= treshold) {
                logger.log("Элемент " + x + " проходит;");
                result.add(x);
            } else {
                logger.log("Элемент " + x + " не проходит;");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элементов(а) из " + list.size() + ";");
        return result;
    }

}
