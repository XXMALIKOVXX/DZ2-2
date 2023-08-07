import org.example.BmiService;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BodyMassa = 98;
        int Height = (int)1.87;
                int bmi = service.calculate(BodyMassa,Height);
        System.out.println("индекс массы="+bmi);
    }
}