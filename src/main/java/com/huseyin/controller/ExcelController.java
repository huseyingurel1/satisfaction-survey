package com.huseyin.controller;

import com.huseyin.excel.ResultExcelExporter;
import com.huseyin.model.Result;
import com.huseyin.repository.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class ExcelController {
    @Autowired
    private ResultRepo resultRepo;

    @GetMapping("/download")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        String headerKey="Content-Disposition";
        String headerValue="attachment; filename=Result_info.xlsx";

        response.setHeader(headerKey,headerValue);
        List<Result> listResult = resultRepo.findAll();
        ResultExcelExporter exp = new ResultExcelExporter(listResult);
        exp.export(response);
    }
}
