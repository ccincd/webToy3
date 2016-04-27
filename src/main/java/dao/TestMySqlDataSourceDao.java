package dao;

import org.springframework.stereotype.Repository;

/**
 * testDataSourceDao
 *
 * @author chichen Date: 16-2-2 Time: 下午3:00
 */
@Repository
public interface TestMySqlDataSourceDao {

    /**
     * 测试dataSource连接
     *
     * @return 记录数
     */
    int countSmallToys();
}
