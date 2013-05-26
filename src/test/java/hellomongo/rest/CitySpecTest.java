package hellomongo.rest;

import hellomongo.AppServer;
import org.junit.ClassRule;
import org.junit.Test;
import restx.tests.RestxSpecRule;

public class CitySpecTest {

    @ClassRule
    public static RestxSpecRule rule = new RestxSpecRule(
            AppServer.WEB_INF_LOCATION,
            AppServer.WEB_APP_LOCATION);

    @Test
    public void should_find_all_cities() throws Exception {
        rule.runTest("specs/city/should_find_all_cities.spec.yaml");
    }
    @Test
    public void should_create_city() throws Exception {
        rule.runTest("specs/city/should_create_city.spec.yaml");
    }
    @Test
    public void should_update_city() throws Exception {
        rule.runTest("specs/city/should_update_city.spec.yaml");
    }
    @Test
    public void should_not_update_city_with_no_id() throws Exception {
        rule.runTest("specs/city/should_not_update_city_with_no_id.spec.yaml");
    }
    @Test
    public void should_find_city_by_id() throws Exception {
        rule.runTest("specs/city/should_find_city_by_id.spec.yaml");
    }
    @Test
    public void should_delete_city() throws Exception {
        rule.runTest("specs/city/should_delete_city.spec.yaml");
    }
}
