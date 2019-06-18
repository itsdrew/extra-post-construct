package extra.post.construct;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class ExtraPostConstructFunctionTest {

    @Inject
    ExtraPostConstructClient client;

    @Test
    public void testFunction() throws Exception {
    	ExtraPostConstruct body = new ExtraPostConstruct();
    	body.setName("extra-post-construct");
        assertEquals("extra-post-construct", client.apply(body).blockingGet().getName());
    }
}
