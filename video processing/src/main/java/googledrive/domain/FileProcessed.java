package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileProcessed extends AbstractEvent {

    private Long id;

    public FileProcessed(Processing aggregate) {
        super(aggregate);
    }

    public FileProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
