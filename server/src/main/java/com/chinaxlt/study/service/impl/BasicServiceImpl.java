package com.chinaxlt.study.service.impl;

import com.chinaxlt.study.dao.BasicDao;
import com.chinaxlt.study.pojo.Basic;
import com.chinaxlt.study.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicServiceImpl implements BasicService {

    @Autowired
    private BasicDao basicDao;

    public Basic findById(Long id) {
        return null;
    }
}
