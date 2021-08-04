package com.xinyi.dc.blockchain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class TXReceipt {
    private String transactionHash;
    private String blockNumber;
}
