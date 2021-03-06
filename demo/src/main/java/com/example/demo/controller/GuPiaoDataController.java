package com.example.demo.controller;

import com.example.demo.dao.GuPiaoDataDao;
import com.example.demo.entities.GuPiaoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gupiao_data")
public class GuPiaoDataController {

    @Autowired
    private GuPiaoDataDao guPiaoDataDao;

    @RequestMapping("/findDataByCodeOrName/{input}/{pageNum}/{pageSize}")
    public List<GuPiaoData> find(@PathVariable("input") String input, @PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
        List<GuPiaoData> dataList = guPiaoDataDao.findDataByCodeOrName(input, pageNum, pageSize);
        return dataList;
    }

    @RequestMapping("/findDataByRegex/{input}/{selection}/{pageNum}/{pageSize}")
    public List<GuPiaoData> findByRegex(@PathVariable("input") String input, @PathVariable("selection") String selection, @PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
        List<GuPiaoData> dataList = guPiaoDataDao.findDataByRegex(input, selection, pageNum, pageSize);
        return dataList;
    }
}
