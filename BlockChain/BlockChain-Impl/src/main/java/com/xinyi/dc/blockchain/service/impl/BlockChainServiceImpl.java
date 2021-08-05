package com.xinyi.dc.blockchain.service.impl;

import com.xinyi.dc.blockchain.api.entity.Certificate;
import com.xinyi.dc.blockchain.api.entity.TXReceipt;
import com.xinyi.dc.blockchain.api.service.BlockChainService;
import org.springframework.stereotype.Service;

@Service
public class BlockChainServiceImpl implements BlockChainService {
    @Override
    public String test(String name) {
        return null;
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
