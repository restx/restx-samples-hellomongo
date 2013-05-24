package hellomongo.rest;

import hellomongo.domain.City;
import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;

import static java.util.Arrays.asList;

@Component @RestxResource
public class CityResource {

    @GET("/cities")
    public Iterable<City> findCities() {
        return asList(new City().setName("Bordeaux"));
    }

}
