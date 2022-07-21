package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.OrdCntrVO;

@Controller
public class DataTableSample {
    
    @RequestMapping("/datatable")
   public String indexPage(Model model){
        //System.out.println("ABC");
        return "datatablesample";
    }
        //data call json restapi testcontroller 넘김
}
