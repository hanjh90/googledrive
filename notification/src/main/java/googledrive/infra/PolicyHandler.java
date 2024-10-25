package googledrive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotiRepository notiRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_FileUpload(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener FileUpload : " + fileUploaded + "\n\n"
        );

        // Sample Logic //
        Noti.fileUpload(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileProcessed'"
    )
    public void wheneverFileProcessed_VideoCreate(
        @Payload FileProcessed fileProcessed
    ) {
        FileProcessed event = fileProcessed;
        System.out.println(
            "\n\n##### listener VideoCreate : " + fileProcessed + "\n\n"
        );

        // Sample Logic //
        Noti.videoCreate(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
