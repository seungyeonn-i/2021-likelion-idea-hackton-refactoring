package portfopol.refactoring.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mapping/")
public class MappingClassController {
    /**
     * 첫번째 페이지 저장 : POST    /
     * 두번째 페이지 저장 : POST    /pages
     * 세번째 페이지 저장 : POST    /pages
     * 네번째 페이지 저장 : POST    /pages
     * 마지막 페이지 조회 : GET     /pages/{userId}
     */

//
//    @GetMapping()
//    public String user() {
//        return "getUsers";
//    }
//
//    @PostMapping()
//    public String firstAddPage() {
//        return "post first-page";
//    }
//
//    @PostMapping()
//    public String secondAddPage() {
//        return "post second-page";
//    }
//
//    @PostMapping()
//    public String thirdAddPage() {
//        return "post third-page";
//    }
//
//    @PostMapping()
//    public String fourthAddPage() {
//        return "post fourth-page";
//    }
//
//    @GetMapping("/get")
//    public String findFirstPage(@PathVariable String year) {
//        return "get year = " + year;
//    }

}
