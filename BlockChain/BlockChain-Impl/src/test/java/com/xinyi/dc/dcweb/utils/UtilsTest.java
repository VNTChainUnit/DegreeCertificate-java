package com.xinyi.dc.dcweb.utils;

import com.xinyi.dc.blockchain.api.entity.Certificate;
import org.junit.jupiter.api.Test;
import com.alibaba.fastjson.JSON;
public class UtilsTest {

    @Test
    public void testFormat(){
        String jsonStr = "{\"school\":\"测试大学\",\"name\":\"xm\",\"idnumber\":\"202\",\"degreeType\":\"学士\",\"major\":\"major\",\"graduationDate\":\"2021-07\",\"studentNumber\":\"xh202\",\"certificateNumber\":\"zsbh202\"}";
        String originRet = "4a7dcc0388095e8d4df4f3a2b5325e32|c6c0930b35f5d610a50b9bc9d398291c|45d3020bb4f4eb629be08e946d072703|19c1a4f112cbcbcc0be72f5a8f320ac1|c232a839ee5600bdb41cbcb47a6cd32b|229a758155a32fd67d2750cb2179797b|abe5be275299ee9db03952a17ca5f1df|d763a1eb2d1e5a737dfc3d8af96430c1";
        Certificate certificate = JSON.parseObject(jsonStr, Certificate.class);
        System.out.println(certificate);

    }
}
