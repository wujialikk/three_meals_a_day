package com.example.carte.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

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
@TableName("CookBook")
public class CookbookDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单主键
     */
      @TableId(value = "CookbookId", type = IdType.AUTO)
    private String cookbookid;

    /**
     * 菜品类型id
     */
    @TableField("CuisineId")
    private String cuisineid;

    /**
     * 菜单类型
     */
    @TableField("CookbookType")
    private Integer cookbooktype;

    /**
     * 菜名
     */
    @TableField("CookbookName")
    private String cookbookname;

    /**
     * 图片路径
     */
    @TableField("CoverImageUrl")
    private String coverimageurl;

    /**
     * 菜单链接
     */
    @TableField("CookbookLink")
    private String cookbooklink;

    /**
     * 菜单视频
     */
    @TableField("CookbookVideoUrl")
    private String cookbookvideourl;

    /**
     * 菜单内容
     */
    @TableField("CookbookContent")
    private String cookbookcontent;

    /**
     * 菜单描述
     */
    private String describe;

    /**
     * 消耗时长
     */
    @TableField("TimeConsuming")
    private Integer timeconsuming;

    /**
     * 浏览次数
     */
    @TableField("Views")
    private Integer views;

    /**
     * 状态，1: 删除，0:有效
     */
    @TableField("Status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private Date createtime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private Date updatetime;

    /**
     * 总步骤
     */
    @TableField("Step")
    private Integer step;


}
