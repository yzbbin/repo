package com.itheima.controller;

import com.itheima.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/account")
public class HelloController {

    @RequestMapping("/serHello")
    public String serHello(){
        System.out.println("springMVC来啦....");
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account,Model model){

        model.addAttribute("account",account);
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/textForwardOrRedirect")
    public String textForwardOrRedirect(HttpServletRequest request, HttpServletResponse response){

        return "forward:WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/textModelAndView")
    public ModelAndView textModelAndView(Account account){
        ModelAndView mv = new ModelAndView();
//        Account account = new Account();
//        account.setUsername("hangsan");
//        account.setPassword("12345");
//        account.setMoney(200);

        mv.addObject("account",account);
        mv.setViewName("success");

        return mv;
    }

    @RequestMapping("/textAJax")
    public @ResponseBody Account textAJax(@RequestBody Account account){
        System.out.println(account);

        return account;
    }


}
