package extra.post.construct;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface ExtraPostConstructClient {

    @Named("extra-post-construct")
    Single<ExtraPostConstruct> apply(@Body ExtraPostConstruct body);

}
