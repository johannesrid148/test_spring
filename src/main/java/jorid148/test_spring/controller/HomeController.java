package jorid148.test_spring.controller;
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "index";
    }
}
