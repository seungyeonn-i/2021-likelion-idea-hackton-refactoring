package portfopol.refactoring.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class checkViewController {

    @RequestMapping("/response-v1")
    public String responseV1(Model model) {
        model.addAttribute("data", model.getAttribute("year"));
        return "response/submit";
    }
}
