package REST.tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.rest.SerenityRest.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class MeliServiceTest {
    @Test
    public void testObtenerDepartamentos() {
        // Realizar la solicitud
        SerenityRest.when().get("https://www.mercadolibre.com.ar/menu/departments");

        // Verificar el código de estado
        SerenityRest.then().statusCode(200);

        // Verificar el tamaño de la lista de departamentos
        SerenityRest.then().assertThat().body("departments.size()", greaterThan(0));

        // Verificar que el nombre del primer departamento sea "Tecnología"
        SerenityRest.then().assertThat().body("departments[0].name", is("Tecnología"));

        // Opcionalmente, puedes extraer la respuesta para realizar más validaciones
        //String responseBody = SerenityRest.lastResponse().getBody().asString();
        //assertThat(responseBody).isNotNull();

        // Realizar más validaciones según sea necesario
    }
}
