package com.xinyi.dc.blockchain.api.service;

import com.xinyi.dc.blockchain.api.entity.Certificate;
import com.xinyi.dc.blockchain.api.entity.TXReceipt;

public interface BlockChainService {
    /**
     * 测试Node环境是否正常
     * @param name
     * @return Hello name
     */
    String test(String name);

    /**
     * 获取证书
     * @param certificateNumber 证书编号
     * @param idnumber 身份证号
     * @return 证书实体/Null
     */
    Certificate getCertificate(String certificateNumber, String idnumber);

    /**
     * 检测是否有证书，填写证书编号
     * @param certificate 证书实体
     * @return
     */
    Boolean hasCertificate(Certificate certificate);

    /**
     * 增加证书
     * @param certificate 证书对象
     * @return 交易凭证|Null
     */
    TXReceipt addCertificate(Certificate certificate);

    /**
     * 检测证书是否正确
     * @param certificate 证书对象
     * @return
     */
    Boolean checkCertificate(Certificate certificate);

    /**
     * 获取交易凭证
     * @param transactionHash 交易Hash
     * @return 交易凭证|Null
     */
    TXReceipt getTXReceipt(String transactionHash);
}
