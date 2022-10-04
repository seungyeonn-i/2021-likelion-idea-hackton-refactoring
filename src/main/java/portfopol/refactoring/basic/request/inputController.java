package portfopol.refactoring.basic.request;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import portfopol.refactoring.basic.domain.DateData;
import portfopol.refactoring.basic.domain.MyData;
import portfopol.refactoring.basic.repository.MemoryDataRepository;

@Slf4j
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
    public String inputPage(@Validated @ModelAttribute DateData dateData,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {


        //성공 로직
        MyData myData = new MyData();
        myData.setYear(dateData.getYear());
        myData.setMonth(dateData.getMonth());
        myData.setDay(dateData.getDay());

        log.info(Integer.toString(dateData.getYear()));
        log.info(Integer.toString(dateData.getMonth()));

//        MyData savedDate = MemoryDataRepository.save(myData);

//        redirectAttributes.addAttribute("dateData",savedDate.getDataId())

        //db 저장
        return "redirect:/input/page2";
    }

    @GetMapping("/page2")
    public String getPage2() {
        //db 저장
        return "/input/secondPage";
    }

    @PostMapping("/page2")
    public String inputPage2(@Validated @ModelAttribute DateData dateData,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {

//        MyData myData = new MyData();
//        myData.setData(content);
//        model.addAttribute("myData",myData);
        return "redirect:/input/page3";
    }

    @GetMapping("/page3")
    public String getPage3() {
        //db 저장
        return "/input/thirdPage";
    }

    @PostMapping("/page3")
    public String inputPage3(@Validated @ModelAttribute DateData dateData,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {

//        MyData myData = new MyData();
//        myData.setData(content);
//        model.addAttribute("myData",myData);
        return "redirect:/input/page4";
    }
    @GetMapping("/page4")
    public String getPage4() {
        //db 저장
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
