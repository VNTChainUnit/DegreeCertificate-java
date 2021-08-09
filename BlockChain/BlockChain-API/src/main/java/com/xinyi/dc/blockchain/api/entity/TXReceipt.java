package com.xinyi.dc.blockchain.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class TXReceipt {
    // 区块高度
    private Integer blockNumber;
    // 区块Hash
    private String blockHash;
    // 交易来源
    private String from;
    // 交易发往
    private String to;
    // 交易花费
    private Integer gas;
    // 交易出价
    private String gasPrice;
    // 交易Hash值
    private String hash;
    // 交易nonce值
    private Integer nonce;
    // 交易序号
    private Integer transactionIndex;
    // 发送的vnt币
    private String value;

}
