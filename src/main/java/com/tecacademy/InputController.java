package com.tecacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput() {
        // input.htmlに画面遷移
        return "input";
    }


    @GetMapping("/input/{previous}")
    public String getPrevious(@RequestParam("previous") String previous, Model model) {
        // input.htmlに画面遷移
        model.addAttribute("previous", previous);

        return "input";
    }
}