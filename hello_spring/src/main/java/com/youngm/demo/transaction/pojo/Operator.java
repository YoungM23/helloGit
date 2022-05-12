package com.youngm.demo.transaction.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.Data;

/**
 * @author zqh
 * @date 2022-05-12 15:20
 */
@Data
@TableName("operator")
public class Operator {
    
    Integer id;
    
    String operatorName;
    
    
}
