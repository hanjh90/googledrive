package googledrive.infra;

import googledrive.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "fileSelects",
    path = "fileSelects"
)
public interface FileSelectRepository
    extends PagingAndSortingRepository<FileSelect, Long> {}
