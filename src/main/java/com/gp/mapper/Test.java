package com.gp.mapper;

import com.gp.entity.OfflineEntity;
import org.apache.ibatis.annotations.Mapper;



import java.util.List;

@Mapper
public interface Test {

    List<OfflineEntity> TestQuery(String param);
}
