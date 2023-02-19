package com.example.carte.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
@TableName("Material")
public class MaterialDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 原材料ID
     */
      @TableId(value = "MaterialId", type = IdType.AUTO)
    private String materialid;

    /**
     * 原材料
     */
    @TableField("MaterialName")
    private String materialname;

    /**
     * 单位
     */
    @TableField("Unit")
    private String unit;

    /**
     * 单价
     */
    @TableField("Price")
    private BigDecimal price;


}
