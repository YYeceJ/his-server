package com.yyece.hisserver.mapper;

import com.yyece.hisserver.entity.Result;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yingying.jiang
 * Date: 2020/7/27
 */
@Mapper
@MapperScan
public interface DoctorMapper {
    boolean addDoctor(Map<String,Object> map);
}
