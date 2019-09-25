package wylie.manager.config.DB;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAop {

    @Pointcut("!@annotation(wylie.manager.config.DB.Master) " +
            "&& (execution(* wylie.manager.mapper..*.select*(..)) " +
            "|| execution(* wylie.manager.mapper..*.get*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(wylie.manager.config.DB.Master) " +
            "|| execution(* wylie.manager.mapper..*.insert*(..)) " +
            "|| execution(* wylie.manager.mapper..*.add*(..)) " +
            "|| execution(* wylie.manager.mapper..*.update*(..)) " +
            "|| execution(* wylie.manager.mapper..*.edit*(..)) " +
            "|| execution(* wylie.manager.mapper..*.delete*(..)) " +
            "|| execution(* wylie.manager.mapper..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DataSourceContext.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DataSourceContext.master();
    }


    /**
     * 另一种写法：if...else...  判断哪些需要读从数据库，其余的走主数据库
     */
//    @Before("execution(* com.cjs.example.service.impl.*.*(..))")
//    public void before(JoinPoint jp) {
//        String methodName = jp.getSignature().getName();
//
//        if (StringUtils.startsWithAny(methodName, "get", "select", "find")) {
//            DataSourceContext.slave();
//        }else {
//            DataSourceContext.master();
//        }
//    }
}
