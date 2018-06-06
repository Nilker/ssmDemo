package com.springmybatis.demo.controller;

import com.springmybatis.demo.Common.GenericController;
import com.springmybatis.demo.Common.HttpClientHelper;
import com.springmybatis.demo.Common.SystemLog;
import com.springmybatis.demo.Model.weiXinUserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping(value = "/app")
@Api(tags = "app接口")
public class appController extends GenericController {

    @RequestMapping(value = "/GetOpenId/{code}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(httpMethod = "Get", value = "根据小程序Code获取用户的OpenId", produces = MediaType.APPLICATION_JSON_VALUE)
    @SystemLog(methods = "获取微信OpenId", module = "AppModule")
    public String GetOpenId(@PathVariable String code) {
        String appId = "wx5cf8cf0b3205969c";
        String appSecret = "6de5fc33ce9b44b049aec3bcf6d0d55d";

        String userUrl = String.format("https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code", appId, appSecret, code);
        String strRep = HttpClientHelper.getInstance().doGet(userUrl);
        return strRep;
    }

    @RequestMapping(value = "/GetLocation", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(httpMethod = "Get", value = "根据坐标获取地理位置信息 eg:39.984154,116.307490")
    @SystemLog(methods = "获取位置信息", module = "AppModule")
    public void GetLocation(String location, HttpServletResponse response) {
        String qqKey = "YS2BZ-KPEWQ-3XY5G-G6OSW-UD3PE-5HFMI";
        String url = String.format("http://apis.map.qq.com/ws/geocoder/v1/?location=%s&get_poi=1&key=%s", location, qqKey);
        String context = HttpClientHelper.getInstance().doGet(url);
        renderString(response, context);
    }


    @RequestMapping(value = "/SaveUserInfo", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(httpMethod = "Post", value = "保存微信用户基本信息")
    @SystemLog(methods = "保存用户基本信息", module = "AppModule")
    //TODO
    public String SaveUserInfo(@ModelAttribute weiXinUserInfo info) {
        return info.toString();
    }
}
