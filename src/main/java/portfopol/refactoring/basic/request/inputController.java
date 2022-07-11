package portfopol.refactoring.basic.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Controller
public class inputController {

    @ResponseBody

    //조회
    @GetMapping(value = "/first",produces = "text/html")
    public String firstPage(
            @RequestParam Map<String,Object> paramMap) {

        log.info("year={}, month={}, day={}", paramMap.get("year"), paramMap.get("month"),paramMap.get("day"));
//        return paramMap.get("year").toString() + " " + paramMap.get("month").toString();
        return "ok";

    }


    @ResponseBody
    @PostMapping(value = "/second-page", produces = "text/html")
    public String secondPage(@RequestParam Map<String, Object> paraMap) {
        log.info("content={}", paraMap.get("content"));
        return "ok";
    }

}
