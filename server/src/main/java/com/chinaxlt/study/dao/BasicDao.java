package com.chinaxlt.study.dao;

import com.chinaxlt.study.pojo.Basic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BasicDao {

    Basic findById(Long id);

}
