package com.tecacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @GetMapping("/output")
    public String postOutput() {
        // input.htmlに画面遷移
        return "output";
    }

    @PostMapping("/output")
    public String postForm(@RequestParam("previous") String previous, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("previous", previous);
        // outpput.htmlに画面遷移
        return "output";
    }
}