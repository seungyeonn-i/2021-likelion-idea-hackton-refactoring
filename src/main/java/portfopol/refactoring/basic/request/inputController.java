package portfopol.refactoring.basic.request;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import portfopol.refactoring.basic.domain.MyData;
import portfopol.refactoring.basic.repository.MemoryDataRepository;

@Controller
@RequestMapping("/input")
@RequiredArgsConstructor
public class inputController {

    private final MemoryDataRepository memoryDataRepository;

    @GetMapping("/page1")
    public String getPage1() {
        return "/input/firstPage";
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

//        memoryDataRepository.save(myData);
        model.addAttribute("myData", myData);

        //db 저장
        return "/input/secondPage";
    }

    @GetMapping("/page2")
    public String getPage2() {
        //db 저장
        return "/input/secondPage";
    }

    @PostMapping("/page2")
    public String inputPage2(@RequestParam("content") String content, Model model) {

        MyData myData = new MyData();
        myData.setData(content);
        model.addAttribute("myData",myData);
        return "input/thirdPage";
    }


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
