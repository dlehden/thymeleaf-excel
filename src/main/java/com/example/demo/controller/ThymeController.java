package com.example.demo.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.vo.OrdCntrVO;
import com.example.demo.vo.OrdMstVO;


@Controller
public class ThymeController {

    @RequestMapping("/")
   public String indexPage(Model model){
        OrdCntrVO ordCntrVO = new OrdCntrVO();
        ordCntrVO.setCntr_no("ABC");
        ordCntrVO.setCntr_type("20GP");
        OrdCntrVO ordCntrVO2 = new OrdCntrVO();
        ordCntrVO2.setCntr_no("ABC2");
        ordCntrVO2.setCntr_type("20GP");

        List<OrdCntrVO> ordCntrVOs  = new ArrayList<>(); 
        ordCntrVOs.add(ordCntrVO);
        ordCntrVOs.add(ordCntrVO2);
        // log.info(ordCntrVO.getCntr_no()+"ABC");
        // model.addAttribute("ordcntrvo", ordCntrVOs);
        return "index";
    }

    @RequestMapping(value="/excel/cntrs" , method=RequestMethod.POST)
   public String excelUploadCntrData(Model model){
        OrdCntrVO ordCntrVO = new OrdCntrVO();
        OrdMstVO ordMstVO = new OrdMstVO();

        ordMstVO.setHbl_no("hbl_no");
        ordMstVO.setSvc_type("FCL");
        ordCntrVO.setCntr_no("ABC");
        ordCntrVO.setCntr_type("20GP");
        OrdCntrVO ordCntrVO2 = new OrdCntrVO();
        ordCntrVO2.setCntr_no("ABC2");
        ordCntrVO2.setCntr_type("20GP");

        List<OrdCntrVO> ordCntrVOs  = new ArrayList<>(); 
        ordCntrVOs.add(ordCntrVO);
        ordCntrVOs.add(ordCntrVO2);
        // log.info(ordCntrVO.getCntr_no()+"ABC");
         model.addAttribute("ordcntrvo", ordCntrVOs);
         model.addAttribute("ordmstvo", ordMstVO);
         return "/index :: #cntrList";
    }

    @RequestMapping(value="/cntrs" , method=RequestMethod.POST)
    @ResponseBody
  public  String saveCntrs(OrdMstVO ordMstVO ){
        System.out.println(ordMstVO.getHbl_no());
        // OrdCntrVO ordCntrVO = new OrdCntrVO();
        // OrdMstVO ordMstVO = new OrdMstVO();

        // ordMstVO.setHbl_no("hbl_no");
        // ordMstVO.setSvc_type("FCL");
        // ordCntrVO.setCntr_no("ABC");
        // ordCntrVO.setCntr_type("20GP");
        // OrdCntrVO ordCntrVO2 = new OrdCntrVO();
        // ordCntrVO2.setCntr_no("ABC2");
        // ordCntrVO2.setCntr_type("20GP");

        // List<OrdCntrVO> ordCntrVOs  = new ArrayList<>(); 
        // ordCntrVOs.add(ordCntrVO);
        // ordCntrVOs.add(ordCntrVO2);
        // // log.info(ordCntrVO.getCntr_no()+"ABC");
        //  model.addAttribute("ordcntrvo", ordCntrVOs);
        //  model.addAttribute("ordmstvo", ordMstVO);
         return "/index :: #cntrList";
    }


    @RequestMapping(value="/excel/read" , method=RequestMethod.POST)
   public String excelRead(@RequestParam("file1") MultipartFile file, Model model) throws TikaException, IOException { // 2

        try (InputStream is = file.getInputStream();) {
                    System.out.println("ABC");
           
        } catch (Exception e) {
            throw new TikaException("ERROR");
        }
         return "index";
    }

}