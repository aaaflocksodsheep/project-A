package com.yang.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor // Lombok 문법 추가
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
        String list(Model model) {

        List<Item> result =itemRepository.findAll();
        model.addAttribute("items", result);

            return "list.html";
    }

    @GetMapping("/write")
    String write() {
        return "write.html";
    }

    @PostMapping("/add")
    String addPost(@RequestParam  String title, String price) {

//        System.out.println(title);
//        System.out.println(price);

        return "redirect:/list";
    }
}
