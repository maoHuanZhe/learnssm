package com.fgrapp.learnssm.controller;

import com.fgrapp.learnssm.pojo.Dictionary;
import com.fgrapp.learnssm.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * DictionaryContoller
 *
 * @author FGR on 2019/11/5
 */
@Controller
@RequestMapping("/dictonary")
public class DictonaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping("/")
    public String distView(){
        return "dist";
    }

    @RequestMapping("/getList")
    @ResponseBody
    public List<Dictionary> getList(int dictSetId){
        return dictionaryService.getList(dictSetId);
    }
}
