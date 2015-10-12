package com.websystique.springbatch.writer;

import com.websystique.springbatch.QueueHolder;
import com.websystique.springbatch.dao.model.ExamResult;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Javanshir on 10/10/2015.
 */
public class InitQueueWriter implements ItemWriter {

    private QueueHolder holder;
    private int parallelism;

    public InitQueueWriter(QueueHolder holder, int parallelism) {
        this.holder = holder;
        this.parallelism = parallelism;
    }

    @Override
    public void write(List list) throws Exception {
        Map<String, BlockingQueue<ExamResult>> data = holder.getData();
        for (int i = 1; i <= parallelism; i++) {
            data.put("ESMA_FX_" + i, new LinkedBlockingQueue<ExamResult>());
        }
    }
}
