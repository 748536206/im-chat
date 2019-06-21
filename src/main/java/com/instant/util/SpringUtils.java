package com.instant.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Description
 * <p>
 *     spring utils
 * </p>
 * DATE 2017/11/14.
 *
 * @author liweijian.
 */
@Component
public class SpringUtils implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(SpringUtils.class);

    private static ApplicationContext applicationContext;


    /**
     * Get bean by bean name
     * @param name bean name
     * @return bean
     */
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    /**
     * Get bean by bean type
     * @param clazz class object
     * @param <T> bean type
     * @return bean
     */
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    /**
     * Get bean by bean name and bean type
     * @param name bean name
     * @param clazz class object
     * @param <T> bean type
     * @return bean
     */
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtils.applicationContext == null) {
            SpringUtils.applicationContext = applicationContext;
        }
        logger.info("=============application context is {}================", applicationContext);
    }

    /**
     * Get ApplicationContext
     * @return application context
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}