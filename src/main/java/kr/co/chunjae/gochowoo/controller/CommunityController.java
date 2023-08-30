package kr.co.chunjae.gochowoo.controller;

import kr.co.chunjae.gochowoo.model.Community;
import kr.co.chunjae.gochowoo.model.User;
import kr.co.chunjae.gochowoo.service.CommunityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/community")
public class CommunityController {
    CommunityService communityService;
    @GetMapping()
    public String showCommunityPage(Model model) {
        List<Community> communityList = communityService.getAllBoard();
        model.addAttribute("communityList", communityList);

        return "views/community/community";
    }
    @GetMapping("/write")
    public String showWritePage(HttpSession session) {
        User user = (User)session.getAttribute("user");
        if (user == null) return "redirect:/user/login";
        return "views/community/writeBoard";
    }

}