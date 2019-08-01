/**
 * @create 2019-07-31 17:04
 * @desc job config
 **/
package com.american.vector.freeworld.servlet.config;

import com.american.vector.freeworld.servlet.factory.CustomJobFactory;
import com.american.vector.freeworld.servlet.job.SimpleJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConfiguration {

    /**
     * 如果有多个job 则定义多个这个方法。
     * @return
     */
    @Bean
    public JobDetailFactoryBean initJobDetailFactoryBean() {
        JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();
        jobDetailFactoryBean.setJobClass(SimpleJob.class);
        return jobDetailFactoryBean;
    }

    @Bean
    public CronTriggerFactoryBean initCronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setJobDetail(jobDetailFactoryBean.getObject());
        cronTriggerFactoryBean.setCronExpression("0/3 * * * * ?");
        return cronTriggerFactoryBean;
    }

    @Bean
    public SchedulerFactoryBean initSchedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean, CustomJobFactory customJobFactory) {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers(cronTriggerFactoryBean.getObject());
        schedulerFactoryBean.setJobFactory(customJobFactory);
        return schedulerFactoryBean;
    }
}

