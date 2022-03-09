package com.tonechentaxinvoice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 登录用户名
     */
    private String uname;

    /**
     * 登录密码
     */
    private String pwd;

    /**
     * 用户姓名
     */
    private String nname;

    /**
     * 用户岗位
     */
    private String posts;

    /**
     * 备注
     */
    private String memo;


}
