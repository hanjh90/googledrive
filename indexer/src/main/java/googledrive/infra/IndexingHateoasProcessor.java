package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class IndexingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Indexing>> {

    @Override
    public EntityModel<Indexing> process(EntityModel<Indexing> model) {
        return model;
    }
}
