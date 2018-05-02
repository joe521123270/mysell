package com.immooc.sell.dataobject;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.immooc.sell.utils.Date2LongSerialize;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;


@Data
public class ProductCategory {

    private Object obj = new Object();

    @JsonSerialize(using = Date2LongSerialize.class)
    private Date addTime;

}
