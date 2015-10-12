package com.websystique.springbatch.processor;

import com.websystique.springbatch.dao.model.ExamResult;
import org.springframework.batch.item.ItemProcessor;

public class ExamResultItemUppercaseProcessor implements ItemProcessor<ExamResult, ExamResult> {


    @Override
    public ExamResult process(ExamResult result) throws Exception {

        String name;
        if ((name = result.getStudentName()) != null) {
            result.setStudentName(name.toUpperCase());
        }
        System.out.println("Uppercase Processing result :" + result);

        return result;
    }

}
