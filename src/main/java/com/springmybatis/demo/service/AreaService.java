package com.springmybatis.demo.service;

import com.springmybatis.demo.Model.qqArea;
import com.springmybatis.demo.entity.Areas;

import java.util.List;


public interface AreaService extends IBaseService<Areas> {
    Integer AddArea(List<qqArea> qqArea);
}
