package hellomongo.rest;

import hellomongo.domain.City;
import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.jongo.JongoCollection;

import javax.inject.Named;

@Component @RestxResource
public class CityResource {
    private final JongoCollection cities;

    public CityResource(@Named("cities") JongoCollection cities) {
        this.cities = cities;
    }

    @GET("/cities")
    public Iterable<City> findCities() {
        return cities.get().find().as(City.class);
    }
}
