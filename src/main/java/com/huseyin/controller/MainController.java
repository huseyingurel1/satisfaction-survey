package com.huseyin.controller;

import com.huseyin.excel.ResultExcelExporter;
import com.huseyin.model.Result;
import com.huseyin.repository.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
