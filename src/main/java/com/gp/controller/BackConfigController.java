package com.gp.controller;

import com.gp.config.BackMode;
import com.gp.entity.OfflineEntity;
import com.gp.service.TestService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bkonfig")
public class BackConfigController {

    @Autowired
    private TestService testService;


    @RequestMapping(value="/test")
    public String test(){
        return "helo world!";
    }

    @RequestMapping(value  = "/DetectData")
    public BackMode DetectData(@RequestParam("reader") String sourceType, @RequestParam("writer") String targetType, @RequestParam("username") String username,
                               @RequestParam("password") String password, @RequestParam("jdbcUrl") String jdbcUrl, @RequestParam("table")String table){

        //1.判断参数是否为空
        if(StringUtils.isEmpty(sourceType)){
            return BackMode.emptyExamine(sourceType);
        }
        if(StringUtils.isEmpty(targetType)){
            return BackMode.emptyExamine(targetType);
        }
        if(StringUtils.isEmpty(username)){
            return BackMode.emptyExamine(username);
        }
        if(StringUtils.isEmpty(password)){
            return BackMode.emptyExamine(password);
        }
        if(StringUtils.isEmpty(jdbcUrl)){
            return  BackMode.emptyExamine(jdbcUrl);
        }
        if(StringUtils.isEmpty(table)){
            return BackMode.emptyExamine(table);
        }

        //2.连接数据库查询
        List<OfflineEntity> testquery = testService.testquery("1183");
        for (OfflineEntity test:testquery) {
            System.out.println(test.toString());
        }
       return null;
    }



}



