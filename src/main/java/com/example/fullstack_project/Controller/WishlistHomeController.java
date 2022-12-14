package com.example.fullstack_project.Controller;

import com.example.fullstack_project.Service.WishlistService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;


@Controller
public class WishlistHomeController {

  private WishlistService service = new WishlistService();

  @GetMapping("/wishlist")
  public String index() {
    return "index";
  }

  @PostMapping("/wishlist")
  public String wishlist(WebRequest payload) {
    service.wishlist(payload);
    //System.out.println(req.getParameter("id"));
    //System.out.println(payload.getParameter("name"));

    return ("redirect:/");

  }
}