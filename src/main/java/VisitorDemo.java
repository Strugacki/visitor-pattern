import impl.TaxVisitor;
import models.Alcohol;
import models.Petrol;
import models.Tobacco;

/**
 * Created by mhallman on 08.05.2017.
 */
public class VisitorDemo {

    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();

        Alcohol piwerko = new Alcohol(1.99);

        Tobacco malboraski = new Tobacco(15.0);

        Petrol ropaDoPassata = new Petrol(3.80);

        System.out.println(piwerko.accept(taxVisitor));
        System.out.println(malboraski.accept(taxVisitor));
        System.out.println(ropaDoPassata.accept(taxVisitor));

    }

}
