package com.websystique.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	@SuppressWarnings("resource")
	public static void main(String areg[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-queue-context.xml");
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job1 = (Job) context.getBean("initJob");
		Job job2 = (Job) context.getBean("queueJob");

		try {
			JobExecution execution1 = jobLauncher.run(job1, new JobParameters());
			System.out.println("Job Exit Status 1: "+ execution1.getStatus());
			JobExecution execution2 = jobLauncher.run(job2, new JobParameters());
			System.out.println("Job Exit Status 2: "+ execution2.getStatus());

		} catch (JobExecutionException e) {
			System.out.println("Job ExamResult failed");
			e.printStackTrace();
		}
	}

}
