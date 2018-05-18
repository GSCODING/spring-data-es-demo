package ever.dao;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Create by Ever_Gao on 2018/5/16
 */

@Document(indexName = "ever",type = "LogDoc")
@Data
@ToString
public class LogDoc {
    @Id
    private String id;
    private String appId;
    private String platform;

    public LogDoc() {
    }

    public LogDoc(String id, String appId, String platform) {
        this.id = id;
        this.appId = appId;
        this.platform = platform;
    }

}

