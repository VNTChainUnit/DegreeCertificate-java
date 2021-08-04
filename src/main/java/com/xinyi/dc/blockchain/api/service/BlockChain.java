package com.xinyi.dc.blockchain.api.service;

public interface BlockChain {
    String hello(String name);
    String getCertificate(String certificateNumber, String idnumber);
    String existCertificate(String name, String studentNumber, String school, String idnumber);
    String addCertificate(String school, String name, String idnumber, String degreeType, String major, String graduationDate, String studentNumber, String certificateNumber);
    String checkCertificate(String certificateNumber, String name, String school, String degreeType, String graduationDate, String major);
    String getTransactionNumber(String transactionHash);
}
