package portfopol.refactoring.basic.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Controller
public class inputController {

    @ResponseBody
    @RequestMapping("/first-page")
    public String inputPage1(@RequestParam("year") String year,
                           @RequestParam("month") String month,
                           @RequestParam("day") String day) {
        log.info("year = {}, month = {}, day = {}", year, month, day);
        //db 저장
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/second-page")
    public String inputPage2(@RequestParam("content") String content) {
        log.info("content = {}", content);
        //db 저장
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/third-page")
    public String inputPage3(@RequestParam("summary") String summary) {
        log.info("summary = {}", summary);
        //db 저장
        return "ok";
    }


    @ResponseBody
    @RequestMapping("/fourth-page") //data get 해오기
    public String inputPage4(@RequestParam("summary") String summary) {
        log.info("summary = {}", summary);
        //db 저장
        return "ok";
    }







}
