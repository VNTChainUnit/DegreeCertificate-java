package com.xinyi.dc.blockchain.service.impl;

import com.alibaba.fastjson.JSON;
import com.xinyi.dc.blockchain.api.entity.Certificate;
import com.xinyi.dc.blockchain.api.entity.TXReceipt;
import com.xinyi.dc.blockchain.api.service.BlockChainService;
import com.xinyi.dc.blockchain.node.BlockChain;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class BlockChainServiceImpl implements BlockChainService {

    @DubboReference(version = "*",timeout = 10000,retries = 0)
    BlockChain blockChain;

    @Override
    public String test(String name) {
        return blockChain.hello(name);
    }

    @Override
    public Certificate getCertificate(String certificateNumber, String idnumber) {
        String jsonStr = blockChain.getCertificate(certificateNumber, idnumber);
        if(jsonStr.equals("")){
            return null;
        }
        else{
            return JSON.parseObject(jsonStr, Certificate.class);
        }
    }

    @Override
    public Boolean hasCertificate(Certificate certificate) {
        String certificateNumber = blockChain.existCertificate(certificate.getName(),certificate.getStudentNumber(),
                certificate.getSchool(),certificate.getIdnumber());
        if(certificateNumber.equals("")){
            return false;
        }
        else {
            certificate.setCertificateNumber(certificateNumber);
            return true;
        }
    }

    @Override
    public TXReceipt addCertificate(Certificate certificate) {
        String jsonRes = blockChain.addCertificate(certificate.getSchool(),certificate.getName(),
                certificate.getIdnumber(),certificate.getDegreeType(),certificate.getMajor(),
                certificate.getGraduationDate(),certificate.getStudentNumber(),
                certificate.getCertificateNumber());
        if(jsonRes.equals(""))return null;
        else return JSON.parseObject(jsonRes,TXReceipt.class);
    }

    @Override
    public Boolean checkCertificate(Certificate certificate) {
        return blockChain.checkCertificate(certificate.getCertificateNumber(),
                certificate.getName(), certificate.getSchool(),certificate.getDegreeType(),certificate.
                        getGraduationDate(),certificate.getMajor());
    }

    @Override
    public TXReceipt getTXReceipt(String transactionHash) {
        String jsonRes = blockChain.getTransaction(transactionHash);
        if(jsonRes.equals("")){
            return null;
        }
        else return JSON.parseObject(jsonRes,TXReceipt.class);
    }
}
