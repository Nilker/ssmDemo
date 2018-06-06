package com.springmybatis.demo.controller;

import com.springmybatis.demo.Common.SystemLog;
import com.springmybatis.demo.Model.qqArea;
import com.springmybatis.demo.entity.Areas;
import com.springmybatis.demo.service.AreaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/area")
public class areaController {


    @Autowired
    private AreaService areaService;


    @RequestMapping(value = "qq", method = RequestMethod.GET)
    @ApiOperation(httpMethod = "Get", value = "爬取腾讯位置数据", produces = MediaType.APPLICATION_JSON_VALUE)
    @SystemLog(methods = "添加省份", module = "area")
    public void addAreaFromQQ() {
        //String url="http://apis.map.qq.com/ws/district/v1/list?key=YS2BZ-KPEWQ-3XY5G-G6OSW-UD3PE-5HFMI";
        //String con= HttpClientHelper.getInstance().doGet(url);
        List<qqArea> obj = com.alibaba.fastjson.JSON.parseArray("        [\n" +
                "            {\n" +
                "                \"id\": \"110000\",\n" +
                "                \"name\": \"北京\",\n" +
                "                \"fullname\": \"北京市\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"bei\",\n" +
                "                    \"jing\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 39.90469,\n" +
                "                    \"lng\": 116.40717\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    0,\n" +
                "                    15\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"120000\",\n" +
                "                \"name\": \"天津\",\n" +
                "                \"fullname\": \"天津市\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"tian\",\n" +
                "                    \"jin\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 39.0851,\n" +
                "                    \"lng\": 117.19937\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    16,\n" +
                "                    31\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"130000\",\n" +
                "                \"name\": \"河北\",\n" +
                "                \"fullname\": \"河北省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"he\",\n" +
                "                    \"bei\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 38.03599,\n" +
                "                    \"lng\": 114.46979\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    32,\n" +
                "                    44\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"140000\",\n" +
                "                \"name\": \"山西\",\n" +
                "                \"fullname\": \"山西省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"shan\",\n" +
                "                    \"xi\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 37.87343,\n" +
                "                    \"lng\": 112.56272\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    45,\n" +
                "                    55\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"150000\",\n" +
                "                \"name\": \"内蒙古\",\n" +
                "                \"fullname\": \"内蒙古自治区\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"nei\",\n" +
                "                    \"meng\",\n" +
                "                    \"gu\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 40.81733,\n" +
                "                    \"lng\": 111.76522\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    56,\n" +
                "                    67\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"210000\",\n" +
                "                \"name\": \"辽宁\",\n" +
                "                \"fullname\": \"辽宁省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"liao\",\n" +
                "                    \"ning\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 41.83571,\n" +
                "                    \"lng\": 123.42925\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    68,\n" +
                "                    81\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"220000\",\n" +
                "                \"name\": \"吉林\",\n" +
                "                \"fullname\": \"吉林省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"ji\",\n" +
                "                    \"lin\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 43.89616,\n" +
                "                    \"lng\": 125.3268\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    82,\n" +
                "                    90\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"230000\",\n" +
                "                \"name\": \"黑龙江\",\n" +
                "                \"fullname\": \"黑龙江省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"hei\",\n" +
                "                    \"long\",\n" +
                "                    \"jiang\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 45.74208,\n" +
                "                    \"lng\": 126.66285\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    91,\n" +
                "                    103\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"310000\",\n" +
                "                \"name\": \"上海\",\n" +
                "                \"fullname\": \"上海市\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"shang\",\n" +
                "                    \"hai\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 31.23037,\n" +
                "                    \"lng\": 121.4737\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    104,\n" +
                "                    119\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"320000\",\n" +
                "                \"name\": \"江苏\",\n" +
                "                \"fullname\": \"江苏省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"jiang\",\n" +
                "                    \"su\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 32.06071,\n" +
                "                    \"lng\": 118.76295\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    120,\n" +
                "                    132\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"330000\",\n" +
                "                \"name\": \"浙江\",\n" +
                "                \"fullname\": \"浙江省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"zhe\",\n" +
                "                    \"jiang\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 30.26555,\n" +
                "                    \"lng\": 120.1536\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    133,\n" +
                "                    143\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"340000\",\n" +
                "                \"name\": \"安徽\",\n" +
                "                \"fullname\": \"安徽省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"an\",\n" +
                "                    \"hui\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 31.86157,\n" +
                "                    \"lng\": 117.28565\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    144,\n" +
                "                    159\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"350000\",\n" +
                "                \"name\": \"福建\",\n" +
                "                \"fullname\": \"福建省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"fu\",\n" +
                "                    \"jian\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 26.09982,\n" +
                "                    \"lng\": 119.29659\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    160,\n" +
                "                    168\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"360000\",\n" +
                "                \"name\": \"江西\",\n" +
                "                \"fullname\": \"江西省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"jiang\",\n" +
                "                    \"xi\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 28.67417,\n" +
                "                    \"lng\": 115.91004\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    169,\n" +
                "                    179\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"370000\",\n" +
                "                \"name\": \"山东\",\n" +
                "                \"fullname\": \"山东省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"shan\",\n" +
                "                    \"dong\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 36.66826,\n" +
                "                    \"lng\": 117.02076\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    180,\n" +
                "                    196\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"410000\",\n" +
                "                \"name\": \"河南\",\n" +
                "                \"fullname\": \"河南省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"he\",\n" +
                "                    \"nan\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 34.76571,\n" +
                "                    \"lng\": 113.75322\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    197,\n" +
                "                    214\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"420000\",\n" +
                "                \"name\": \"湖北\",\n" +
                "                \"fullname\": \"湖北省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"hu\",\n" +
                "                    \"bei\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 30.54539,\n" +
                "                    \"lng\": 114.34234\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    215,\n" +
                "                    231\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"430000\",\n" +
                "                \"name\": \"湖南\",\n" +
                "                \"fullname\": \"湖南省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"hu\",\n" +
                "                    \"nan\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 28.11266,\n" +
                "                    \"lng\": 112.9834\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    232,\n" +
                "                    245\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"440000\",\n" +
                "                \"name\": \"广东\",\n" +
                "                \"fullname\": \"广东省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"guang\",\n" +
                "                    \"dong\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 23.13171,\n" +
                "                    \"lng\": 113.26627\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    246,\n" +
                "                    266\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"450000\",\n" +
                "                \"name\": \"广西\",\n" +
                "                \"fullname\": \"广西壮族自治区\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"guang\",\n" +
                "                    \"xi\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 22.81521,\n" +
                "                    \"lng\": 108.32754\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    267,\n" +
                "                    280\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"460000\",\n" +
                "                \"name\": \"海南\",\n" +
                "                \"fullname\": \"海南省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"hai\",\n" +
                "                    \"nan\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 20.01997,\n" +
                "                    \"lng\": 110.34863\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    281,\n" +
                "                    299\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"500000\",\n" +
                "                \"name\": \"重庆\",\n" +
                "                \"fullname\": \"重庆市\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"chong\",\n" +
                "                    \"qing\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 29.56471,\n" +
                "                    \"lng\": 106.55073\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    300,\n" +
                "                    337\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"510000\",\n" +
                "                \"name\": \"四川\",\n" +
                "                \"fullname\": \"四川省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"si\",\n" +
                "                    \"chuan\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 30.65089,\n" +
                "                    \"lng\": 104.07572\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    338,\n" +
                "                    358\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"520000\",\n" +
                "                \"name\": \"贵州\",\n" +
                "                \"fullname\": \"贵州省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"gui\",\n" +
                "                    \"zhou\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 26.5982,\n" +
                "                    \"lng\": 106.70722\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    359,\n" +
                "                    367\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"530000\",\n" +
                "                \"name\": \"云南\",\n" +
                "                \"fullname\": \"云南省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"yun\",\n" +
                "                    \"nan\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 25.0453,\n" +
                "                    \"lng\": 102.70973\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    368,\n" +
                "                    383\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"540000\",\n" +
                "                \"name\": \"西藏\",\n" +
                "                \"fullname\": \"西藏自治区\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"xi\",\n" +
                "                    \"zang\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 29.64725,\n" +
                "                    \"lng\": 91.11748\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    384,\n" +
                "                    390\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"610000\",\n" +
                "                \"name\": \"陕西\",\n" +
                "                \"fullname\": \"陕西省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"shan\",\n" +
                "                    \"xi\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 34.26486,\n" +
                "                    \"lng\": 108.95424\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    391,\n" +
                "                    400\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"620000\",\n" +
                "                \"name\": \"甘肃\",\n" +
                "                \"fullname\": \"甘肃省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"gan\",\n" +
                "                    \"su\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 36.05942,\n" +
                "                    \"lng\": 103.82634\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    401,\n" +
                "                    414\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"630000\",\n" +
                "                \"name\": \"青海\",\n" +
                "                \"fullname\": \"青海省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"qing\",\n" +
                "                    \"hai\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 36.62087,\n" +
                "                    \"lng\": 101.78011\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    415,\n" +
                "                    422\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"640000\",\n" +
                "                \"name\": \"宁夏\",\n" +
                "                \"fullname\": \"宁夏回族自治区\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"ning\",\n" +
                "                    \"xia\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 38.47117,\n" +
                "                    \"lng\": 106.25867\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    423,\n" +
                "                    427\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"650000\",\n" +
                "                \"name\": \"新疆\",\n" +
                "                \"fullname\": \"新疆维吾尔自治区\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"xin\",\n" +
                "                    \"jiang\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 43.79343,\n" +
                "                    \"lng\": 87.6271\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    428,\n" +
                "                    450\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"710000\",\n" +
                "                \"name\": \"台湾\",\n" +
                "                \"fullname\": \"台湾省\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"tai\",\n" +
                "                    \"wan\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 25.030724,\n" +
                "                    \"lng\": 121.520076\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    451,\n" +
                "                    470\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"810000\",\n" +
                "                \"name\": \"香港\",\n" +
                "                \"fullname\": \"香港特别行政区\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"xiang\",\n" +
                "                    \"gang\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 22.27534,\n" +
                "                    \"lng\": 114.16546\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    471,\n" +
                "                    488\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"820000\",\n" +
                "                \"name\": \"澳门\",\n" +
                "                \"fullname\": \"澳门特别行政区\",\n" +
                "                \"pinyin\": [\n" +
                "                    \"ao\",\n" +
                "                    \"men\"\n" +
                "                ],\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 22.19875,\n" +
                "                    \"lng\": 113.54913\n" +
                "                },\n" +
                "                \"cidx\": [\n" +
                "                    489,\n" +
                "                    492\n" +
                "                ]\n" +
                "            }\n" +
                "        ]", qqArea.class);

        Integer num = areaService.AddArea(obj);

    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ApiOperation(httpMethod = "Get", value = "获取二级area", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addAreaByApi() {
        List<Areas> ll = areaService.selectPage(1,5);
        List<Areas> lis = areaService.selectByEqField("id", "20", 1, 100);
    }
}
