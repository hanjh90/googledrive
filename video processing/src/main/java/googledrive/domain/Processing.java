package googledrive.domain;

import googledrive.VideoProcessingApplication;
import googledrive.domain.FileProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Processing_table")
@Data
//<<< DDD / Aggregate Root
public class Processing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        FileProcessed fileProcessed = new FileProcessed(this);
        fileProcessed.publishAfterCommit();
    }

    public static ProcessingRepository repository() {
        ProcessingRepository processingRepository = VideoProcessingApplication.applicationContext.getBean(
            ProcessingRepository.class
        );
        return processingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void fileUpload(FileIndexed fileIndexed) {
        //implement business logic here:

        /** Example 1:  new item 
        Processing processing = new Processing();
        repository().save(processing);

        FileProcessed fileProcessed = new FileProcessed(processing);
        fileProcessed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileIndexed.get???()).ifPresent(processing->{
            
            processing // do something
            repository().save(processing);

            FileProcessed fileProcessed = new FileProcessed(processing);
            fileProcessed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
