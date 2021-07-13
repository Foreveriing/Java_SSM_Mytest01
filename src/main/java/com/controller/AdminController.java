package com.controller;


import com.pojo.Admin;
import com.service.AdminService;
import com.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(Admin admin){

        if (adminService.login(admin)!=null){
            return "admin/admin";
        }
        else {
            return "admin/tips";
        }
    }

}
