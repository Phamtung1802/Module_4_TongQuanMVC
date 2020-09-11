package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;
import java.util.*;

@Controller
public class TuDien {
    @GetMapping("/search")
    public String search(@RequestParam String word, Model model){
        HashMap<String,String> tudien=new HashMap<String,String>();
        tudien.put("tao", "apple");
        tudien.put("cam","orange");
        tudien.put("nho","grape");
        tudien.put("dao","peach");
        tudien.put("banana","chuoi");
        tudien.put("pine","thong");
        tudien.put("cashew"," hat dieu");

        String ketqua="";
        if (tudien.containsKey(word)){
            ketqua=tudien.get(word);
        }else {
            ketqua="khong co";
        }
        model.addAttribute("ketqua",ketqua);

        return "result";
    }
}
