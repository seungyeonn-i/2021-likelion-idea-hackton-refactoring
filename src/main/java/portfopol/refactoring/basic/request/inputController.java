package portfopol.refactoring.basic.request;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import portfopol.refactoring.basic.domain.MyData;

@Controller
@RequestMapping("/input")
@RequiredArgsConstructor
public class inputController {

    private final JpaRepository jpaRepository;

    @GetMapping("/page1")
    public String getPage1() {
        return "firstPage";
    }

    @PostMapping("/page1")
    public String inputPage1(@RequestParam("year") int year,
                           @RequestParam("month") int month,
                           @RequestParam("day") int day,
                             Model model) {

        MyData myData = new MyData();
        myData.setYear(year);
        myData.setMonth(month);
        myData.setDay(day);

        jpaRepository.save(myData);
        model.addAttribute("myData", myData);

        //db 저장
        return "secondPage";
    }

//    @ResponseBody
//    @RequestMapping("/second-page")
//    public String inputPage2(@RequestParam("content") String content) {
//        log.info("content = {}", content);
//        //db 저장
//        return "ok";
//    }
//
//    @ResponseBody
//    @RequestMapping("/third-page")
//    public String inputPage3(@RequestParam("summary") String summary) {
//        log.info("summary = {}", summary);
//        //db 저장
//        return "ok";
//    }
//
//
//    @ResponseBody
//    @RequestMapping("/fourth-page") //data get 해오기
//    public String inputPage4(@RequestParam("summary") String summary) {
//        log.info("summary = {}", summary);
//        //db 저장
//        return "ok";
//    }







}
