package study.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehay@naver.com on 2018-08-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
