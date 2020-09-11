package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class calculateController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam String VND, Model model){
      double ketqua;
      ketqua= Double.parseDouble(VND)/23000;
      String greet=Double.toString(ketqua);
      model.addAttribute("ketqua",ketqua);
      return "KetQua";
    };
}
