package mx.uv.listi._9.Saludar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludarPlantilla {

    @GetMapping("/Plantilla")
    public String plantilla(Model m) {
        m.addAttribute("PERSONA", "john doe");
        return "xxx";  
    }
    
}
