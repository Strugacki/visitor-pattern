package models;

import interfaces.Visitable;
import interfaces.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by mhallman on 08.05.2017.
 */
@Data
@AllArgsConstructor
public class Petrol implements Visitable{

    double price;

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
