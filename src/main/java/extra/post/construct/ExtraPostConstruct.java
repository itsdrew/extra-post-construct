package extra.post.construct;

import io.micronaut.core.annotation.*;

@Introspected
public class ExtraPostConstruct {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

