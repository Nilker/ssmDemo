package com.springmybatis.demo.controller;


import com.springmybatis.demo.Common.GenericController;
import com.springmybatis.demo.Common.SystemLog;
import com.springmybatis.demo.Redis.aop.GetCache;
import com.springmybatis.demo.entity.User;
import com.springmybatis.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping(value = "/user")
@Api(tags = "用户信息接口")
public class UserController extends GenericController {

//    log
    private static final Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


//    //返回jsp视图展示
//    @RequestMapping(value = "/getUserModel",method = RequestMethod.GET)
//    public ModelAndView getUsers1(@RequestParam Integer userId) {
//        ModelAndView modelAndView = new ModelAndView();
//        //调用service方法得到用户列表
//        List<User> users = userService.getUsers(userId);
//        //将得到的用户列表内容添加到ModelAndView中
//        modelAndView.addObject("users",users);
//        //设置响应的jsp视图
//        modelAndView.setViewName("getUsers");
//        logger.info("===============================成功查询用户列表！");
//        return modelAndView;
//    }


    //返回json格式数据，形式1
    //@GetCache()
    @RequestMapping(value = "/getUserJson1",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(httpMethod = "Get",value = "获取用户byID",produces = MediaType.APPLICATION_JSON_VALUE)
    @SystemLog(methods = "获取用户",module = "用户")
    public List getUsers2(@RequestParam Integer userId, HttpServletRequest request, HttpServletResponse response) {
        //调用service方法得到用户列表
        List<User> users = userService.getUsers(userId);
        logger.info("===============================成功查询用户列表！");
        return users;
    }




//    //返回json格式数据，形式2（自定义了返回的格式）
//    @RequestMapping(value = "/getUserJson2",method = RequestMethod.GET)
//    public void getUsers3(@RequestParam Integer userId, HttpServletRequest request, HttpServletResponse response) {
//        //调用service方法得到用户列表
//        List<User> users = userService.getUsers(userId);
//        logger.info("===============================成功查询用户列表！");
//        renderSuccessString(response, users);
//    }
}
