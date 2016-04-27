/*
 * Copyright (c) 2016 chenchi.me. All Rights Reserved.
 */
package common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author chichen  Date: 16-4-27 Time: 下午2:52
 */
public abstract class PrintableBean {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
