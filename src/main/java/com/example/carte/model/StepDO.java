package com.example.carte.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hhh
 * @since 2023-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Step")
public class StepDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 步骤ID
     */
      @TableId(value = "StepId", type = IdType.AUTO)
    private String stepid;

    /**
     * 菜单ID
     */
    @TableField("CookBookId")
    private String cookbookid;

    /**
     * 图片路径
     */
    @TableField("imgUrl")
    private String imgurl;

    /**
     * 步骤描述
     */
    private String txt;

    /**
     * 步骤显示顺序
     */
    @TableField("Order")
    private Integer order;


}
