package rbf.springframework.rbfpetclinic.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"", "/", "/index", "/index"})
    public String listOwners() {
        return "owners/index";
    }
}
