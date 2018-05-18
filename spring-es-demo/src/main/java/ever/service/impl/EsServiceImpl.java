package ever.service.impl;

import ever.dao.LogDoc;
import ever.repo.EsRep;
import ever.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by Ever_Gao on 2018/5/17
 */
@Service
public class EsServiceImpl implements EsService{

    @Autowired
    private EsRep rep;

    @Autowired
    private ElasticsearchTemplate template;

    @Override
    public List<LogDoc> findByAppId(String appId) {
        return rep.findByAppId(appId);
    }

    @Override
    public void createIndex(Class clazz) {
        template.createIndex(clazz);
    }

    @Override
    public void saveLogDoc(){
        LogDoc logDoc = new LogDoc("100","abc","abc");
        rep.save(logDoc);
    }

}
