package com.springmybatis.demo.service.impl;

import com.springmybatis.demo.Model.qqArea;
import com.springmybatis.demo.dao.mapper.AreasMapper;
import com.springmybatis.demo.entity.Areas;
import com.springmybatis.demo.service.impl.AbstractService;
import com.springmybatis.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AreaServiceImpl extends AbstractService<Areas> implements AreaService {

    @Autowired
    private AreasMapper areasMapper;

    @Override
    public Integer AddArea(List<qqArea> qqareas) {
        List<Areas> areaModels = new ArrayList<Areas>();
        for (qqArea item : qqareas) {
            Areas entiy=new Areas();
            entiy.setAreaid(item.getId());
            entiy.setName(item.getName());
            entiy.setMergername(item.getFullname());
            entiy.setShortname(item.getName());
            entiy.setMergershortname(item.getFullname());
            entiy.setLat(String.valueOf(item.getLocation().getLat()));
            entiy.setLng(String.valueOf(item.getLocation().getLng()));
            entiy.setPinyin(String.join(",", item.getPinyin()));
            entiy.setFirstchar(item.getPinyin().get(0).substring(0,1));
            entiy.setLeveltype("1");
            entiy.setJianpin(item.getPinyin().get(0).substring(0,1)+item.getPinyin().get(1).substring(0,1));
            areaModels.add(entiy);
        }


        Integer n = areasMapper.insertList(areaModels);
        return n;
    }
}
