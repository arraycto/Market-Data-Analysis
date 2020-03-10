package com.example.demo.controller;

import com.example.demo.dao.GuPiaoDataDao;
import com.example.demo.dao.JiJinDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GP_JJ_Sum_Controller {

    @Autowired
    private GuPiaoDataDao guPiaoDataDao;

    @Autowired
    private JiJinDataDao jiJinDataDao;

    @GetMapping("/gpjjlist")
    public String list(Model model) {
        Long gpcount = guPiaoDataDao.guPiaoCount();
        Long jjcount = jiJinDataDao.jiJinCount();
        model.addAttribute("gpcount", gpcount);
        model.addAttribute("jjcount", jjcount);
        return "dashboard";
    }
}
