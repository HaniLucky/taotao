package com.taotao.manager.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 *  BasePojo
 *	抽取共用的属性
 *	不希望直接创建实例，加上abstract
 *
 * @author Covet
 *
 */
public abstract class BasePojo  implements Serializable {

	// 创建时间
    private Date created;

    // 更新时间
    private Date updated;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
