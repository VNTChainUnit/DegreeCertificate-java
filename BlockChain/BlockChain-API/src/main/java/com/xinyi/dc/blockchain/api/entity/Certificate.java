package com.xinyi.dc.blockchain.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Certificate {
    // 学校
    private String school;

    // 学生姓名
    private String name;

    // 身份证号
    private String idnumber;

    // 学位类别
    private String degreetype;

    // 专业
    private String major;

    // 毕业年月
    private String graduationdate;

    // 学号
    private String studentnumber;

    // 证书编号
    private String certificatenumber;

    //证书哈希
    private String hash;
}
