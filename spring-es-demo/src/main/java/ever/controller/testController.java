package ever.controller;

import ever.dao.LogDoc;
import ever.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.List;

/**
 * Create by Ever_Gao on 2018/5/17
 */
@RestController
@RequestMapping("/es")
public class testController {

    @Autowired
    private EsService service;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity find(@RequestParam(value = "appId",required = false) String appId){
        List<LogDoc> rs = service.findByAppId(appId);
        return ResponseEntity.ok(rs);
    }

    @RequestMapping(value = "/createIndex", method = RequestMethod.GET)
    public ResponseEntity createIndex(){
        service.createIndex(LogDoc.class);
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "/saveLog", method = RequestMethod.GET)
    public ResponseEntity saveLog(){
        service.saveLogDoc();
        return ResponseEntity.ok("");
    }

}
