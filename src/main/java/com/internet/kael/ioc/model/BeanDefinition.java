// Copyright 2020 ALO7 Inc. All rights reserved.

package com.internet.kael.ioc.model;

/**
 * @author Kael He(kael.he@alo7.com)
 * @since 1.0
 */
public interface BeanDefinition {
    /**
     * 获取Bean名称
     *
     * @return Bean名称
     * @since 1.0
     */
    String getName();

    /**
     * 设置Bean名称
     *
     * @param name Bean名称
     * @since 1.0
     */
    void setName(final String name);
    /**
     * 获取Bean的类名称
     *
     * @return 类名称
     * @since 1.0
     */
    String getClassName();

    /**
     * 设置类名称
     *
     * @param className 类名称
     * @since 1.0
     */
    void setClassName(final String className);

    /**
     * 获取作用域
     * @return 作用域
     * @since 3.0
     */
    String getScope();

    /**
     * 设置作用域
     * @param scope 作用域
     * @since 3.0
     */
    void setScope(final String scope);

    /**
     * 是否是延迟加载
     * @return 是否
     * @since 3.0
     */
    boolean isLazyInit();

    /**
     * 设置是否是延迟加载
     * @param lazyInit 是否是延迟加载
     * @since 3.0
     */
    void setLazyInit(final boolean lazyInit);

    /**
     * 获取初始化的方法名
     * @return 初始化的方法名
     * @since 4.0
     */
    String getInitMethodName();

    /**
     * 设置初始化的方法名
     * @param initMethodName 方法名
     * @since 4.0
     */
    void setInitMethodName(String initMethodName);

    /**
     * 获取销毁的方法名
     * @return 销毁的方法名
     * @since 4.0
     */
    String getDestroyMethodName();

    /**
     * 设置销毁的方法名
     * @param destroyMethodName 销毁的方法名
     * @since 4.0
     */
    void setDestroyMethodName(String destroyMethodName);

}
