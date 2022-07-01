package com.example.demo.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.OrdGroupVO;

@Mapper
public interface SampleMapper {
    public List<Map<String, Object>> getOrdMgt();

    public List<OrdGroupVO> getOrdMgt_group();
}