package cn.tedu.jsd2307enjoymall.pojo.entity;

/** * 商品实体类  */

import lombok.Data;

import java.util.Date;

@Data
public class Product {

    private Long id;             //id
    private String name;         //商品名
    private String type;         //类型
    private double price;        //价格
    private Integer viewCount;   //浏览量
    private String imgUrl;       //图片地址
    private Long createBy;       //创建者
    private Date createTime;     //创建时间

}
