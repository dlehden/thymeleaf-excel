package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.SampleMapper;
import com.example.demo.vo.OrdGroupVO;

@Service
public class TestService {
    private final SampleMapper sampleMapper;

    public TestService(SampleMapper sampleMapper){
        this.sampleMapper = sampleMapper;
    }

    public List<Map<String, Object>> getOrdMgt(){
        return sampleMapper.getOrdMgt();
    }

    public List<OrdGroupVO> getOrdMgt_group(){
        return sampleMapper.getOrdMgt_group();
    }
    
}
