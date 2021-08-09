package com.xinyi.dc.dcweb;

import com.xinyi.dc.blockchain.BlockChainClient;
import com.xinyi.dc.blockchain.api.entity.Certificate;
import com.xinyi.dc.blockchain.api.entity.TXReceipt;
import com.xinyi.dc.blockchain.api.service.BlockChainService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = BlockChainClient.class)
class BlockChainImplTests {

    @Autowired
    BlockChainService blockChainService;

    @Test
    void contextLoads() {
    }

    @Test
    void testNodeServer(){
        String res = blockChainService.test("vnt");
        Assertions.assertEquals(res,"Hello vnt");
    }

    @Test
    void testGetCertificate(){
        String certNumber = "zsbh202";
        String idNumber = "202";
        Certificate certificate = blockChainService.getCertificate(certNumber,idNumber);
        Assertions.assertEquals(certificate.getCertificateNumber(),certNumber);
        Assertions.assertEquals(certificate.getIdnumber(),idNumber);
    }

    @Test
    void testHasCertificate(){
        Certificate certificate  = new Certificate();
        certificate.setStudentNumber("xh202");
        certificate.setSchool("测试大学");
        certificate.setIdnumber("202");
        certificate.setName("xm");
        Assertions.assertTrue(blockChainService.hasCertificate(certificate));
        System.out.println(certificate);
    }

    @Test
    void testCheckCertificate(){
        Certificate certificate = blockChainService.getCertificate("zsbh202","202");
        Assertions.assertTrue(blockChainService.checkCertificate(certificate));
    }

    @Test
    void testGetTransaction(){
        String hash = "0x3fa7722d9b78b61859ffe33ffee7cf04ba5171aaf594869a16efdeffee56a494";
        TXReceipt txReceipt = blockChainService.getTXReceipt(hash);
        System.out.println(txReceipt);
        Assertions.assertEquals(txReceipt.getHash(),hash);
    }

}
