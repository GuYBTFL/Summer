// Copyright 2020 ALO7 Inc. All rights reserved.

package com.internet.kael.ioc.core;

import com.google.common.collect.ImmutableList;
import com.internet.kael.ioc.bean.Apple;
import com.internet.kael.ioc.context.JsonApplicationContext;
import com.internet.kael.ioc.model.DefaultBeanDefinition;
import com.internet.kael.ioc.util.JsonConverter;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Kael He(kael.he@alo7.com)
 * @since 1.0
 */
public class BeanFactoryTest {

    public static final  BeanFactory BEAN_FACTORY = new JsonApplicationContext("apple.json");

    /**
     *
     * @since 1.0
     */
    @Test
    public void getBeanByName() {
        Apple apple = (Apple) BEAN_FACTORY.getBean("apple");
        apple.introduce();
    }

    /**
     *
     * @since 1.0
     */
    @Test
    public void generateAppleJson() {
        DefaultBeanDefinition bd = new DefaultBeanDefinition();
        bd.setName("apple");
        bd.setClassName("com.internet.kael.bean.Apple");

        List<DefaultBeanDefinition> beanDefinitions = ImmutableList.of(bd);
        System.out.println(JsonConverter.serialize(beanDefinitions));
    }

    @Test
    public void getBeanByNameAndType() {
        Apple apple = BEAN_FACTORY.getBean("apple", Apple.class);
        apple.introduce();
    }

    @Test
    public void containsBean() {
        Assert.assertTrue(BEAN_FACTORY.containsBean("apple"));
        Assert.assertFalse(BEAN_FACTORY.containsBean("other"));
    }

}
