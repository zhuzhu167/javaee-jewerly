package cn.ykthink.jewelry.model.comm.po;

import io.swagger.models.auth.In;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * program: jewelry
 * description:库存PO
 * author: mi
 * create: 2019-05-05 18:02
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class StorePO extends BasePO{
    /**
     * 历史库存总量
     */
    private Integer storeTotal;
    /**
     * 库存剩余量
     */
    private Integer storeConsumption;
}
