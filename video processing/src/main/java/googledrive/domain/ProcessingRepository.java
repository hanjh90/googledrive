package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "processings",
    path = "processings"
)
public interface ProcessingRepository
    extends PagingAndSortingRepository<Processing, Long> {}
