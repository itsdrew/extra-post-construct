package extra.post.construct;

import io.micronaut.function.FunctionBean;
import io.micronaut.function.executor.FunctionInitializer;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.function.Function;

@FunctionBean("extra-post-construct")
public class ExtraPostConstructFunction extends FunctionInitializer implements Function<ExtraPostConstruct, ExtraPostConstruct> {

    @PostConstruct
    public void initialize() {
        System.out.println("HELLO");
    }

    @Override
    public ExtraPostConstruct apply(ExtraPostConstruct msg) {
         return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        ExtraPostConstructFunction function = new ExtraPostConstructFunction();
        function.run(args, (context)-> function.apply(context.get(ExtraPostConstruct.class)));
    }
}

