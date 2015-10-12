package com.websystique.springbatch.writer;

import com.websystique.springbatch.QueueHolder;
import com.websystique.springbatch.dao.model.ExamResult;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by Javanshir on 10/10/2015.
 */
public class QueueWriter implements ItemWriter<ExamResult> {

    private QueueHolder holder;
    private int parallelism;

    public QueueWriter(QueueHolder holder, int parallelism) {
        this.holder = holder;
        this.parallelism = parallelism;
    }

    @Override
    public void write(List<? extends ExamResult> list) throws Exception {
        for (ExamResult examResult : list) {
            if (examResult.getStudentName().equals("DUMMY_NAME")) {
                for (int i = 1; i <= parallelism; i++) {
                    holder.getData().get("ESMA_FX_" + i).put(examResult);
                }
            } else {
                int partition = Math.abs(examResult.getStudentName().hashCode()) % parallelism;
                partition++;
                holder.getData().get("ESMA_FX_" + partition).put(examResult);
            }

        }
    }
}
