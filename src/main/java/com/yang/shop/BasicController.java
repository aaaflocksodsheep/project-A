package com.yang.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;
import java.util.Date;

@Controller
public class BasicController {

    @GetMapping("/") // url 입력, 메인 페이지
//    @ResponseBody
    String hello (){   // 함수
        return "index.html"; // HTML 파일 경로 적으면 된다
    }

    @GetMapping("/date")
    @ResponseBody
    String date(){
        return ZonedDateTime.now().toString();
    }


 }
