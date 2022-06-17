package portfopol.refactoring.basic.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Slf4j
@Controller
public class inputController {

    @ResponseBody
    @PostMapping(value = "/first-page",produces = "text/html")
    public String firstPage(
            @RequestParam Map<String,Object> paramMap) {

        log.info("year={}, month={}, day={}", paramMap.get("year"), paramMap.get("month"),paramMap.get("day"));
        return "ok";
    }

}
