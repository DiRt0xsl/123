package cn.tedu.jsd2307enjoymall.pojo.param;

import lombok.Data;

import java.util.Date;

/** * 商品DTO类 */

@Data
public class ProductParam {

    private String name;         //商品名
    private Date createTime;     //创建时间
    private String type;         //类型
    private double price;        //价格
    private String imgUrl;       //图片地址
    private Long createBy;       //创建者

}
