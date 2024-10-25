package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.FileIndexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Indexing_table")
@Data
//<<< DDD / Aggregate Root
public class Indexing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static IndexingRepository repository() {
        IndexingRepository indexingRepository = IndexerApplication.applicationContext.getBean(
            IndexingRepository.class
        );
        return indexingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void fileUpload(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Indexing indexing = new Indexing();
        repository().save(indexing);

        FileIndexed fileIndexed = new FileIndexed(indexing);
        fileIndexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(indexing->{
            
            indexing // do something
            repository().save(indexing);

            FileIndexed fileIndexed = new FileIndexed(indexing);
            fileIndexed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
