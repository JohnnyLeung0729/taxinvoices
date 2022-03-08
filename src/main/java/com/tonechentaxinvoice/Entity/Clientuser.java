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
 * @since 2022-03-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Clientuser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 企业接口访问ID
     */
    private String idkey;

    /**
     * 企业名称
     */
    private String enterName;

    /**
     * 纳税人识别号
     */
    private String nsrsbh;

    /**
     * 企业注册日期
     */
    private Date regdate;

    /**
     * 企业类型
     */
    private Integer enterType;

    /**
     * 企业状态
     */
    private Integer act;

    /**
     * 企业备注
     */
    private String memo;

    /**
     * 企业营业执照上传地址

     */
    private String idPic;

    /**
     * 企业法人身份证正面上传地址
     */
    private String jpIdPicF;

    /**
     * 企业法人身份证背面上传地址
     */
    private String jpIdPicB;

    /**
     * 企业信息改变日期
     */
    private Date changedate;


}
