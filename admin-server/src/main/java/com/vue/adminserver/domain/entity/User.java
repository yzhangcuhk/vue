package com.vue.adminserver.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author caishaodong
 * @since 2020-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    @NotBlank(message = "姓名不能为空")
    @Length(max = 8, message = "姓名不能超过8个字")
    private String name;

    /**
     * 手机号
     */
    @NotBlank(message = "手机号不能为空")
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    @Length(min = 6, max = 16, message = "密码在6到16个字之间")
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 住址
     */
    private String address;

    /**
     * 状态（0：正常，1：注销，2：冻结）
     */
    private Integer status;

    /**
     * 是否删除（0：正常，1：删除）
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
