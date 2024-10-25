package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "indexings", path = "indexings")
public interface IndexingRepository
    extends PagingAndSortingRepository<Indexing, Long> {}
