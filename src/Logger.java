import java.text.MessageFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.println(MessageFormat.format("[{0}, {1}] {2} ", currentTimeMillis(), num++ , msg));
    }
    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям
    private static Logger logger;

    // Храним ссылку на единственный объект класса
    private static Logger instance = null;
    private long start;

    // Скрыли конструктор
    private Logger() {
        this.start = System.currentTimeMillis();
    }
    // Пользователи которым нужен объект
    // нашего класса получают всегда один
    // и тот же объект, который мы храним
    // в приватном статичном поле, которое
    // мы заполняем в этом методе если оно
    // до того не было заполнено
    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public String toString() {
        return "Стартовал в " + start;
    }
    public Object currentTimeMillis(){
        Date today = new Date();
        String.format("%tc",new Date());
        return today;
    }
}
