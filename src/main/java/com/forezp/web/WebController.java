package com.forezp.web;

import com.forezp.entity.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by fangzhipeng on 2017/4/19.
 */
@Controller
public class WebController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "index";
    }
    @GetMapping("/contact")
    public String showContan(){
        return "contact";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/results";
    }
    @RequestMapping("/userlogin")
    public String userLogin(HttpServletRequest request){
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        System.out.println("====userlogin===="+mobile+","+password);
        return "";
    }
    @RequestMapping("/userRegister")
    public String userRegister(HttpServletRequest request){

    }
}
