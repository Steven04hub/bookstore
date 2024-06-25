package com.example.entity;

import java.io.Serializable;

public class Books implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 商品名称 */
    private String name;
    /** 商品描述 */
    private String description;
    /** 商品主图 */
    private String img;
    private Double price;
    private String unit;
    private Integer count;
    private Integer typeId;
    private Integer businessId;
}