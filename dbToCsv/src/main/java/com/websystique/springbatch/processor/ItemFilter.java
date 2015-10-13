package com.websystique.springbatch.processor;

import com.websystique.springbatch.dao.model.ExamResult;
import org.springframework.batch.item.ItemProcessor;

public class ItemFilter implements ItemProcessor<ExamResult, ExamResult> {


    @Override
    public ExamResult process(ExamResult result) throws Exception {
        System.out.println("Filter Processing result :" + result);

		/*
         * Only return results which are more than 80%
		 * 
		 */
        if (result.getPercentage() < 80) {
//            throw new RuntimeException("Percentage is too low: " + result.getPercentage() + " " + Thread.currentThread().getName());
//            System.out.println(("Percentage is too low: " + result.getPercentage() + " " + Thread.currentThread().getName()));
            return null;
        }

        return result;
    }

}
