package ever.repo;

import ever.dao.LogDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Create by Ever_Gao on 2018/5/16
 */

public interface EsRep extends ElasticsearchRepository <LogDoc,String>{
    List<LogDoc> findByAppId(String appId);
}
