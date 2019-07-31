/**
 * @create 2019-07-31 16:46
 * @desc demo simple job
 **/
package com.american.vector.freeworld.servlet.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job{
    /**
     * 注意此处如果定义该类的属性应该定义比如dao或者service层的都没问题，常量比如final String str = ""也没问题
     * 但不应该定义int number 这种临界资源。
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //search data from db or outsource data provider
        System.out.println(Thread.currentThread().getName() + " executing job ......");
    }
}

