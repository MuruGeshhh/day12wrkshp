package sg.edu.nus.iss.day12wkshp;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.util.Calendar;;



@Controller
@RequestMapping(path= {"/indexresource", "/indexresource.html"})

public class indexResource {

    @GetMapping(produces = {"text/html"})
    public String index(Model model) {

        model.addAttribute("currTime", (new Date().toString()));

        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour",cal.get(Calendar.HOUR_OF_DAY));



        return "indexresource"; // MUST BE THE same as html name 
   }






    
}
