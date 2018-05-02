package com.immooc.sell.dataobject.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.immooc.sell.utils.DataTransformSerialize;
import lombok.Data;

@Data
public class HomeData {

    private long orderId;

    @JsonSerialize(using = DataTransformSerialize.class)
    private String orderName;

}
