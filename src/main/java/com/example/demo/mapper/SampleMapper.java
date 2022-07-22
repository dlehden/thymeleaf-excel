package com.example.demo.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.OrdGroupVO;
import com.example.dto.OrdMstDTO;

@Mapper
public interface SampleMapper {
    public List<Map<String, Object>> getOrdMgt();

    public List<OrdGroupVO> getOrdMgt_group();

    @Insert("INSERT INTO ORD_CTS_MST(ORD_MNGT_NO,ORD_REQ_YMD,SVC_TYPE,FL_TYPE,INS_USRID) values  (#{ORD_MNGT_NO},#{ORD_REQ_YMD},#{SVC_TYPE},#{FL_TYPE},#{INS_USRID})")
    int insert_test(OrdMstDTO ordMstDTO);
}