package beer;

import java.util.Arrays;

/**
 * @author Igor Hnes on 10/20/17.
 */
public class BuildBeer {

    public static void main(String[] args) {

        Beer beer = new Beer();
        beer.setBeerName(BeerName.HEINICKEN);
        beer.setBeerType(BeerType.WHITE);

        System.out.println(beer.getBeerName());
        System.out.println(beer.getBeerType());

        final BeerName[] values = BeerName.values();
        System.out.println(Arrays.toString(values));
    }
}
