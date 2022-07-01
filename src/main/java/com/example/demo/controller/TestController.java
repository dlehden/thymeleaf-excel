package com.example.demo.controller;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.TimeMapper;
import com.example.demo.service.TestService;
import com.example.demo.vo.OrdGroupVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
   
     private final TimeMapper  timeMapper;
     private final TestService testService;
    public TestController(TimeMapper timeMapper,TestService testService){
       this.timeMapper = timeMapper;
       this.testService = testService;
     }

    @GetMapping("/api/xml")
    public String hello(){
        //return "AB";
       return "xml설정" + timeMapper.getTime2();
    }

    @GetMapping("/api/interface")
    public String hello2(){
        //return "AB";
       return "interface설정" + timeMapper.getTime2();
    }
    @GetMapping("/api/resulttype-map")
    public String resulttype(){
        //return "AB";
        log.info(testService.getOrdMgt().get(0).get("CNTR_NO").toString());
       return "resulttype-map" + testService.getOrdMgt();
    }

    @GetMapping("/api/resulttype-vo")
    public String resulttype_vo(){
        List<OrdGroupVO> ordGroupVO = testService.getOrdMgt_group(); 
        log.info(ordGroupVO.get(0).getOrdMstVO().getHbl_no());
       return "resulttype-map" + ordGroupVO.toString();
    }
}
