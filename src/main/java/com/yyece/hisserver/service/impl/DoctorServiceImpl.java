package com.yyece.hisserver.service.impl;

import com.yyece.hisserver.mapper.DoctorMapper;
import com.yyece.hisserver.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yingying.jiang
 * Date: 2020/7/27
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorMapper doctorMapper;

    @Override
    public boolean addDoctor(Map<String, Object> map) {
        return doctorMapper.addDoctor(map);
    }
}
