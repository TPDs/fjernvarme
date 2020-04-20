package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller

public class HomeController {

    @GetMapping("/")
public String index() {
    return "Bin";

}

    @GetMapping("/actors")
    public String actors() {
        return "Actors";

    }

    @GetMapping("/movies")
    public String movies() {
        return "Movies";

    }

    @GetMapping("/calculaor")
    public String calculator() {
        return "calculator";

    }

    @PostMapping("/result")
    public String result(WebRequest wr, Model model) {
        String tal1 = wr.getParameter("value1");
        String tal2 = wr.getParameter("value2");

        assert tal1 != null;
        int tallet1 = Integer.parseInt(tal1);
        assert tal2 != null;
        int tallet2 = Integer.parseInt(tal2);

        int result = tallet1 + tallet2;

        model.addAttribute("sumresult",result);

        return "result";

    }


}
