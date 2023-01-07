package com.wjc.maker.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class BaseEntity {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer version;
    private Integer isDelete;

}
