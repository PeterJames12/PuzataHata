package military2;

/**
 * @author Igor Hnes on 10/20/17.
 */
public class Igor implements ContractService {

    @Override
    public void serveFiveYears() {
        System.out.println("Fuck, I have to serve five years!"
                + "\n"
                + "P.S. Igor");
    }

    @Override
    public void running() {
        System.out.println("10 km");
    }
}
