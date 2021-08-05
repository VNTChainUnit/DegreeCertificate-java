package com.xinyi.dc.blockchain.api.service;

import com.xinyi.dc.blockchain.api.entity.Certificate;
import com.xinyi.dc.blockchain.api.entity.TXReceipt;

public interface BlockChainService {
    String test(String name);
    Certificate getCertificate(String certificateNumber, String idnumber);
    Boolean hasCertificate(Certificate certificate);
    TXReceipt addCertificate(Certificate certificate);
    Boolean checkCertificate(Certificate certificate);
    TXReceipt getTXReceipt(String transactionHash);
}
