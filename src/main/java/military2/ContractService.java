package military2;

/**
 * @author Igor Hnes on 10/20/17.
 */
public interface ContractService {

    String name = "Alex";

    void serveFiveYears();

    default void running() {
        System.out.println("12 km");
    }
}
