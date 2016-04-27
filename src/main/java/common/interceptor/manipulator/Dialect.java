/*
 * Copyright (c) 2016 Qunar.com. All Rights Reserved.
 */
package common.interceptor.manipulator;

/**
 * @author chichen  Date: 16-4-20 Time: 下午3:57
 */
public interface Dialect {

    String getLimitString(String sql, int offset, int limit);
}
