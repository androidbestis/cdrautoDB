package com.gp.service;

import com.gp.entity.OfflineEntity;
import com.gp.mapper.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private Test test;

    public List<OfflineEntity> testquery(String param){
        return test.TestQuery(param);
    }

}
