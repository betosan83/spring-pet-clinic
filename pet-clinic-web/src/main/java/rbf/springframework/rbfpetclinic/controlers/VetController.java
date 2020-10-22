package rbf.springframework.rbfpetclinic.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/", "/index", "/index"})
    public String listVets() {
        return "vets/index";
    }
}