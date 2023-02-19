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
@TableName("Cuisine")
public class CuisineDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜系ID
     */
      @TableId(value = "CuisineId", type = IdType.AUTO)
    private String cuisineid;

    /**
     * 父级ID
     */
    @TableField("ParentId")
    private String parentid;

    /**
     * 菜系名称
     */
    @TableField("CuisineName")
    private String cuisinename;

    /**
     * 菜系显示顺序
     */
    @TableField("SortNo")
    private Integer sortno;


}
