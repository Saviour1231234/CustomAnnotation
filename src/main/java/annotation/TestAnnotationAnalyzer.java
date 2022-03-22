package annotation;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Arrays;

@Slf4j
public class TestAnnotationAnalyzer {
    public void analyze(Class<?> clazz) {

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                log.info("Method name : {} ", method.getName());
                log.info("Method return type :  {} ", method.getReturnType());
                log.info("Method parameter types :  {}", Arrays.toString(method.getParameterTypes()));
            }
        }
    }
}
