package portfopol.refactoring.basic.request;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import portfopol.refactoring.basic.domain.DateData;
import portfopol.refactoring.basic.domain.KeywordData;
import portfopol.refactoring.basic.domain.MyData;
import portfopol.refactoring.basic.domain.SummaryData;
import portfopol.refactoring.basic.dataRepository.MemoryDataRepository;
import portfopol.refactoring.basic.user.User;

@Slf4j
@Controller
@RequestMapping("/input")
@RequiredArgsConstructor
public class inputController {

    private final MemoryDataRepository memoryDataRepository;

    @GetMapping("/page1")
    public String getPage1() {
        log.info("get1page");

        return "/input/firstPage";
    }

    @PostMapping("/page1")
    public String inputPage(@Validated @ModelAttribute DateData dateData,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {


        //성공 로직
        MyData myData = new MyData(0L,0L);
        myData.setYear(dateData.getYear());
        myData.setMonth(dateData.getMonth());
        myData.setDay(dateData.getDay());

        log.info(Integer.toString(dateData.getYear()));
        log.info(Integer.toString(dateData.getMonth()));
        log.info(Integer.toString(dateData.getDay()));

        MyData savedDate = memoryDataRepository.save(myData);

        //data id에 맞추어 저장
        //뒤로 갈 수록 데이터 덮어씌여지지 않는지 확인해야함
        //userdata 넘겨야함
        redirectAttributes.addAttribute("dateData",savedDate.getDataId());


        return "redirect:/input/page2";
    }

    @GetMapping("/page2")
    public String getPage2() {
        log.info("get2page");

        //db 저장
        return "/input/secondPage";
    }

    @PostMapping("/page2")
    public String inputPage2(@Validated @ModelAttribute SummaryData summaryData,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        MyData myData = new MyData(0L,0L);
        myData.setSummary(summaryData.getSummary());

        log.info(Long.toString(myData.getDataId()));
        log.info(myData.getSummary());

        MyData savedSummary = memoryDataRepository.save(myData);
        redirectAttributes.addAttribute("summaryData",savedSummary.getDataId());

        return "redirect:/input/page3";
    }

    @GetMapping("/page3")
    public String getPage3() {
        log.info("get3page");

        //db 저장
        return "/input/thirdPage";
    }

    @PostMapping("/page3")
    public String inputPage3(@Validated @ModelAttribute KeywordData keywordData,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        MyData myData = new MyData(0L,0L);
        myData.setKeyword(keywordData.getKeyword());

        MyData savedKeyword = memoryDataRepository.save(myData);
        redirectAttributes.addAttribute("keywordData", savedKeyword.getDataId());

        log.info(memoryDataRepository.findById(0L).toString());
        log.info(memoryDataRepository.findAll().toString());

        return "redirect:/input/page4";
    }
    @GetMapping("/page4")
    public String getPage4() {
        //db 저장
        log.info("get4page");
        return "/input/fourthPage";
    }

    @PostMapping("/page4")
    public String inputPage4(@Validated @ModelAttribute DateData dateData,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {

//        MyData myData = new MyData();
//        myData.setData(content);
//        model.addAttribute("myData",myData);
        return "redirect:/output/submit.html";
    }



}
