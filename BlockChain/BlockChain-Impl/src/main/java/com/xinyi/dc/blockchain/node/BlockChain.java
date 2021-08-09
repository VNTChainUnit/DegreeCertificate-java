package com.xinyi.dc.blockchain.node;

public interface BlockChain {
    //测试服务，返回Hello name
    String hello(String name);

    //返回证书json，不存在返回""
    String getCertificate(String certificateNumber, String idnumber);

    //返回证书编号，不存在返回""
    String existCertificate(String name, String studentNumber, String school, String idnumber);

    //返回交易回执json，失败返回""
    String addCertificate(String school, String name, String idnumber, String degreeType, String major, String graduationDate, String studentNumber, String certificateNumber);

    //查询是否有这个证书，返回bool
    Boolean checkCertificate(String certificateNumber, String name, String school, String degreeType, String graduationDate, String major);

    //根据交易Hash返回交易回执json，不存在返回""
    String getTransaction(String transactionHash);
}
