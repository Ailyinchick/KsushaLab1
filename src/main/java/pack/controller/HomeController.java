package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pack.Service.PlainService;

@Controller
public class HomeController {

    @Autowired
    PlainService plainService;

    @GetMapping(value = "/")
    public String homePage() {
        return "login";
    }

    @GetMapping(value = "/nature")
    public String nature(ModelMap modelMap) {
        modelMap.addAttribute("picture", "<img src=\"resources/images/nature.jpeg\" alt=\"nature\">");
        return "login";
    }

    @GetMapping(value = "/car")
    public String car(ModelMap modelMap) {
        modelMap.addAttribute("picture", "<img src=\"resources/images/jiga.jpg\" alt=\"jiga\">");
        return "login";
    }

    @GetMapping(value = "/bart")
    public String vart(ModelMap modelMap) {
        modelMap.addAttribute("picture", "<img src=\"resources/images/bart.jpg\" alt=\"bart\">");
        return "login";
    }

}
