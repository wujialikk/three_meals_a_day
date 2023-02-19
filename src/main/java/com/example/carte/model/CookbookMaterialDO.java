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
@TableName("CookBook_Material")
public class CookbookMaterialDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
      @TableId(value = "CookBook_Material_ID", type = IdType.AUTO)
    private String cookbookMaterialId;

    /**
     * 菜单主键
     */
    @TableField("CookBookId")
    private String cookbookid;

    /**
     * 原材料主键
     */
    @TableField("MaterialId")
    private String materialid;

    /**
     * 规格
     */
    @TableField("Num")
    private String num;

    /**
     * 是否主料，1:主料，0:次料
     */
    @TableField("IsMain")
    private Integer ismain;


}
