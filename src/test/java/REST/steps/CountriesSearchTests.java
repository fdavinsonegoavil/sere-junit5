package REST.steps;


import REST.tests.CountriesSearchSteps;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;

public class CountriesSearchTests {
    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @Test
    public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS() {
        countriesSearchSteps.searchCountryByCode("US");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("United States of America");
    }

    @Test
    public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN(){
        countriesSearchSteps.searchCountryByCode("IN");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("India");
    }

    @Test
    public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR(){
        countriesSearchSteps.searchCountryByCode("BR");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("Brazil");
    }
}
