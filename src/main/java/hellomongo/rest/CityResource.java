package hellomongo.rest;

import com.google.common.base.Optional;
import hellomongo.domain.City;
import org.bson.types.ObjectId;
import restx.Status;
import restx.annotations.*;
import restx.factory.Component;
import restx.jongo.JongoCollection;

import javax.inject.Named;

import static restx.common.MorePreconditions.checkEquals;

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

    @POST("/cities")
    public City createCity(City city) {
        cities.get().save(city);
        return city;
    }

    @GET("/cities/{oid}")
    public Optional<City> findCityById(String oid) {
        return Optional.fromNullable(cities.get().findOne(new ObjectId(oid)).as(City.class));
    }

    @PUT("/cities/{oid}")
    public City updateCity(String oid, City city) {
        checkEquals("oid", oid, "city.key", city.getKey());
        cities.get().save(city);
        return city;
    }

    @DELETE("/cities/{oid}")
    public Status deleteCity(String oid) {
        cities.get().remove(new ObjectId(oid));
        return Status.of("deleted");
    }

}
