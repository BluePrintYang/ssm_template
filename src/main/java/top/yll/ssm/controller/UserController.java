package top.yll.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.yll.ssm.model.User;
import top.yll.ssm.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    public String findAll(Model model){

        List<User> userList = userService.findAll();
        for (User user:userList){
            System.out.println("id: "+user.getId());
            System.out.println("name: "+user.getName());
        }
        model.addAttribute("userList",userList);
        return "usrList";
    }


}
