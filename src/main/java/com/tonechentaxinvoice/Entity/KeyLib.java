package com.tonechentaxinvoice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author JohnnyLeung
 * @since 2022-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class KeyLib implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 激活密钥
     */
    private String keyId;

    /**
     * 钥匙组ID
     */
    private String groupId;

    /**
     * 拥有激活密钥企业ID
     */
    private String ownEnterId;

    /**
     * 分配给企业的日期
     */
    private Date ownDate;

    /**
     * 变更key状态或企业的日期
     */
    private Date changeDate;

    /**
     * 激活生效日期
     */
    private Date actDate;

    /**
     * 激活失效日期
     */
    private Date endDate;

    /**
     * 密钥类型
     */
    private Integer keyType;

    /**
     * 密钥状态
     */
    private Integer act;

    /**
     * 密钥备注
     */
    private String memo;


}
