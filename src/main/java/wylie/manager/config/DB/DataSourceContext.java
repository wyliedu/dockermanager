package wylie.manager.config.DB;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 在这个方法中，DataSourceContext是一个封装了绑定数据源名称到当前线程中的类，
 * 因为设置数据源和获取数据源是这个线程中不同时刻操作的，所以使用ThreadLocal来操作
 */
public class DataSourceContext {

    //将ThreadLocal设置为静态的，可以让当前线程中所有的类都能够共享
    private static final ThreadLocal<DBTypeEnum> dataSourcePool = new ThreadLocal<>();

    private static final AtomicInteger counter = new AtomicInteger(-1);

    public static void setDataSource(DBTypeEnum dbType) {
        dataSourcePool.set(dbType);
    }

    public static DBTypeEnum getDataSource() {
        return dataSourcePool.get();
    }

    public static void master() {
        setDataSource(DBTypeEnum.MASTER);
        System.out.println("切换到master");
    }

    public static void slave() {
        setDataSource(DBTypeEnum.SLAVE1);  //单个从数据库
        //  轮询
/*        int index = counter.getAndIncrement() % 2;
        if (counter.get() > 9999) {
            counter.set(-1);
        }
        if (index == 0) {
            setDataSource(DBTypeEnum.SLAVE1);
            System.out.println("切换到slave1");
        }else {
            setDataSource(DBTypeEnum.SLAVE2);
            System.out.println("切换到slave2");
        }*/
    }

}