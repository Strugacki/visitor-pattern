package interfaces;

/**
 * Created by mhallman on 08.05.2017.
 */
public interface Visitable {

    double accept(Visitor visitor);

}
