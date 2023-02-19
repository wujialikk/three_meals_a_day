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
@TableName("CookBook_Tag")
public class CookbookTagDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签主键
     */
      @TableId(value = "TagId", type = IdType.AUTO)
    private String tagid;

    /**
     * 标签内容
     */
    @TableField("TagText")
    private String tagtext;

    /**
     * 标签名称
     */
    @TableField("TagName")
    private String tagname;

    /**
     * 标签显示顺序
     */
    @TableField("Order")
    private Integer order;

    /**
     * 菜单主键
     */
    @TableField("CookBookId")
    private String cookbookid;


}
