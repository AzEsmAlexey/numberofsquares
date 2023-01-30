import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int NumberSqrt = service.calcNumberSqrt(100, 20000);
        System.out.println(NumberSqrt);

    }
}