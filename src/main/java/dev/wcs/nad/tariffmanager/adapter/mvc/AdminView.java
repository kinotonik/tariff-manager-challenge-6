package dev.wcs.nad.tariffmanager.adapter.mvc;

import dev.wcs.nad.tariffmanager.identity.entity.User;
import dev.wcs.nad.tariffmanager.identity.user.UserRepository;
import dev.wcs.nad.tariffmanager.identity.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/public/admin")
public class AdminView {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String listUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "admin";
    }

}
