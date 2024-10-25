package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProcessingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Processing>> {

    @Override
    public EntityModel<Processing> process(EntityModel<Processing> model) {
        return model;
    }
}
