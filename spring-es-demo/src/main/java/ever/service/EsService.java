package ever.service;


import ever.dao.LogDoc;

import java.util.List;

/**
 * Create by Ever_Gao on 2018/5/17
 */
public interface EsService {
    List<LogDoc> findByAppId(String appId);
    void createIndex(Class clazz);
    void saveLogDoc(); //参数可以自定义，为了方便，参数在实现方法中添加
}
