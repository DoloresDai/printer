import main.java.company.model.BlackAndWhitePrinter;
import main.java.company.model.ColourPrinter;
import main.java.company.model.Printer;

public class PolymorphicDemo {
    public static void main(String[] args) {
        (new Printer()).print();
        (new ColourPrinter()).print();
        (new BlackAndWhitePrinter()).print();
    }
}
