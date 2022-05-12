package com.youngm.demo.transaction.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zqh
 * @date 2022-05-12 15:19
 */
@Data
@TableName("station")
public class Station {
    @TableId("id")
    Integer id;
    
    @TableField("operator_id")
    Integer operatorId;
    
    @TableField("station_name")
    String stationName;
    
}
