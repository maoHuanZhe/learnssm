package com.fgrapp.learnssm.pojo;

import lombok.Data;

/**
 * 字典
 *
 * @author FGR on 2019/11/5
 */
@Data
public class Dictionary {
    /**
     * 字典编号
     */
    private Integer dictID;
    /**
     * 字典集编号
     */
    private Integer dictSetID;
    /**
     * 字典值
     */
    private Integer dictValue;
    /**
     * 字典名称
     */
    private String dictName;
    /**
     * 备注
     */
    private String remark;
}
