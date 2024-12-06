package cn.tedu.jsd2307enjoymall.controller;

import cn.tedu.jsd2307enjoymall.common.response.JsonResult;
import cn.tedu.jsd2307enjoymall.pojo.param.ProductParam;
import cn.tedu.jsd2307enjoymall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/** * 2.商品管理控制器 */

@RestController
@RequestMapping("/v1/product")
public class ProductController {
    @Autowired
    IProductService service;

//-----------------------------------//

    /**  1.添加商品
     * @param  productParam 商品DTO类
     * @return JsonResult
     */

    @PostMapping("add-new")
    public JsonResult addNewProduct(@RequestBody ProductParam productParam){
        service.regProduct(productParam);
        return JsonResult.ok();
    }

    /** 2.删除商品
     * @param id 接收前端的商品id
     * @return JsonResult
     */
    @GetMapping("delete-product/{id}")
    public JsonResult deleteProduct(@PathVariable Long id){
        service.removeProduct(id);
        return JsonResult.ok();
    }

    /*
     *//** 3.编辑商品
     * @param id 接收前端的商品id
     * @return JsonResult
     *//*
    @GetMapping("")
    public JsonResult updateProduct(@PathVariable Long id){
        //
        return JsonResult.ok();
    }

    *//** 4.商品分类管理
     * @param productDTO 接收前端的商品任何dto属性查询分类商品
     * @return
     *//*
    @GetMapping("")
    public JsonResult selectProductSort(ProductDTO productDTO){
        //
        return JsonResult.ok();
    }

    *//** 5.商品搜索和过滤功能
     * @param productDTO 接收前端的商品属性 搜索过滤商品
     * @return JsonResult
     *//*
    @GetMapping("")
    public JsonResult ProductSearchFiltering(ProductDTO productDTO){
        //
        return JsonResult.ok();
    }

    *//** 6.商品图片管理
     * @param id 接收前端的商品id 添加/修改/ 图片
     * @return
     *//*
    @GetMapping("")
    public JsonResult ProductPictureManage(@PathVariable Long id){
        //
        return JsonResult.ok();
    }

    *//** 7.商品图片删除
     * @param id 接收前端的商品id 添加/修改/ 图片
     * @return
     *//*
    @PostMapping("")
    public JsonResult ProductPictureDelete(@PathVariable Long id){
        //
        return JsonResult.ok();
    }*/
}
