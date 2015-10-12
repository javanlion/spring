package com.websystique.springbatch.reader;

import com.websystique.springbatch.QueueHolder;
import com.websystique.springbatch.dao.model.ExamResult;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * Created by Javanshir on 10/10/2015.
 */
public class QueueReader implements ItemReader<ExamResult> {
    private QueueHolder holder;
    private String queueName;

    public QueueReader(QueueHolder holder, String queueName) {
        this.holder = holder;
        this.queueName = queueName;
    }

    @Override
    public ExamResult read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        ExamResult result = holder.getData().get(queueName).take();

        return "DUMMY_NAME".equals(result.getStudentName()) ? null : result;
    }
}
