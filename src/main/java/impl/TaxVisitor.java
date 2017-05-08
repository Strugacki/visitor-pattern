package impl;

import interfaces.Visitor;
import models.Alcohol;
import models.Petrol;
import models.Tobacco;

/**
 * Created by mhallman on 08.05.2017.
 */
public class TaxVisitor implements Visitor{

    public double visit(Alcohol alcohol) {
        System.out.print("Alcohol product :: ");
        return alcohol.getPrice() * 0.18;
    }

    public double visit(Tobacco tobacco) {
        System.out.print("Tobacco product :: ");
        return tobacco.getPrice() * 0.25;
    }

    public double visit(Petrol petrol) {
        System.out.print("Petrol product :: ");
        return petrol.getPrice() * 0.5;
    }
}
