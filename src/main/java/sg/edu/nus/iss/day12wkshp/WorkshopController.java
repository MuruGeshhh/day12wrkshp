package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WorkshopController {

    @RequestMapping(path={"/workshop"})
    public String test(){

        return "workshop";
    }

    @RequestMapping(path={"/processNumber"})

    public String testResults(
        @RequestParam(name= "inputNumber", defaultValue = "1") Integer unit,
    Model model){


        List<Integer> lstint = new ArrayList<>();

        int loopValue = Integer.parseInt(unit.toString());

        int loop = 1;
        while (loop <= loopValue){


            int result = (int) ((Math.random() * loopValue) + 1 );

            if(!lstint.contains(Integer.valueOf(result))){
                lstint.add(Integer.valueOf(result));
                loop++;
            }
        }

        for(int i =0; i<lstint.size();i++){

            System.out.print(">>>" + lstint.get(i));
            System.out.println();
        }

       model.addAttribute("numbers", lstint);
        
       return "workshopresult" ;





    }






}




    






    

