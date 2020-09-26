package com.yyece.hisserver.controller;

import com.yyece.hisserver.entity.Result;
import com.yyece.hisserver.entity.ResultCode;
import com.yyece.hisserver.service.DoctorService;
import com.yyece.hisserver.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yingying.jiang
 * Date: 2020/7/27
 */
@RestController
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @Autowired
    private IdWorker idWorker;

    @PostMapping("addDoctor")
    public Result addDoctor(@RequestBody Map<String,Object> map){
        String account = "dr" + idWorker.nextId();
        map.put("account", account);
        boolean result = doctorService.addDoctor(map);
        try {
            if (result){
                return new Result(ResultCode.SUCCESS);
            }else {
                return new Result(ResultCode.FAIL);
            }
        }catch (Exception e){
            return new Result(ResultCode.SERVER_ERROR);
        }
    }
}
