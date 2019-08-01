/**
 * @create 2019-08-01 10:19
 * @desc config custom job factory
 **/
package com.american.vector.freeworld.servlet.factory;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomJobFactory extends AdaptableJobFactory{


    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {

        Object object = super.createJobInstance(bundle);
        autowireCapableBeanFactory.autowireBean(object);
        return object;
    }
}

