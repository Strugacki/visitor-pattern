package interfaces;

import models.Alcohol;
import models.Petrol;
import models.Tobacco;

/**
 * Created by mhallman on 08.05.2017.
 */
public interface Visitor {

    double visit(Alcohol alcohol);

    double visit(Tobacco tobacco);

    double visit(Petrol petrol);
}
