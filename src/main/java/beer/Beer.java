package beer;

/**
 * @author Igor Hnes on 10/20/17.
 */
public class Beer {

    private BeerName beerName;
    private BeerType beerType;

    public BeerName getBeerName() {
        return beerName;
    }

    public void setBeerName(BeerName beerName) {
        this.beerName = beerName;
    }

    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }
}
