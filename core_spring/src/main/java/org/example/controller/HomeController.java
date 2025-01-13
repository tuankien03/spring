package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home"; // Trả về tên view (sẽ được ánh xạ thành /WEB-INF/views/home.jsp)
    }
}