package com.xinyi.dc.dcweb;

import com.xinyi.dc.blockchain.api.service.BlockChainService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlockChainImplTests {

    @Autowired
    BlockChainService blockChainService;

    @Test
    void contextLoads() {
    }

    @Test
    void testNodeServer(){
        String res = blockChainService.test("vnt");
        Assert.assertEquals(res,"Hello vnt");
    }

}
