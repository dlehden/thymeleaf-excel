package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.SampleMapper;
import com.example.demo.vo.OrdGroupVO;
import com.example.dto.OrdMstDTO;

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

    //@Transactional //걸면 한개라도 틀리면 전부 롤백
    public int setTestInsert(){
        OrdMstDTO ordMstDTO = new OrdMstDTO();
        ordMstDTO.setORD_MNGT_NO("ABCNEW3");
        ordMstDTO.setINS_USRID("한글");
        ordMstDTO.setFL_TYPE("FCL");
        ordMstDTO.setORD_REQ_YMD("20220722");
        ordMstDTO.setSVC_TYPE("FCL");
        sampleMapper.insert_test(ordMstDTO);


         ordMstDTO = new OrdMstDTO();
        ordMstDTO.setORD_MNGT_NO("ABCNEW2");
        ordMstDTO.setINS_USRID("한글");
        ordMstDTO.setFL_TYPE("FCL");
        ordMstDTO.setORD_REQ_YMD("20220722");
        ordMstDTO.setSVC_TYPE("FCL");
        sampleMapper.insert_test(ordMstDTO);

        return 1;
    }
    
}
