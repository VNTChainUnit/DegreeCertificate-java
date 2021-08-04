package com.xinyi.dc.blockchain.service.impl;

import com.xinyi.dc.blockchain.api.service.BlockChain;
import com.xinyi.dc.blockchain.entity.Certificate;
import com.xinyi.dc.blockchain.entity.TXReceipt;
import com.xinyi.dc.blockchain.service.BlockChainService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class BlockChainServiceImpl implements BlockChainService {

    @DubboReference(version = "*")
    BlockChain blockChain;

    @Override
    public String test(String name) {
        return blockChain.hello(name);
    }

    @Override
    public Certificate getCertificate(String certificateNumber, String idnumber) {
        return null;
    }

    @Override
    public Boolean hasCertificate(Certificate certificate) {
        return null;
    }

    @Override
    public TXReceipt addCertificate(Certificate certificate) {
        return null;
    }

    @Override
    public Boolean checkCertificate(Certificate certificate) {
        return null;
    }

    @Override
    public TXReceipt getTXReceipt(String transactionHash) {
        return null;
    }
}
