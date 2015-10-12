package com.websystique.springbatch.partitioner;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Javanshir on 10/10/2015.
 */
public class QueuePartitioner implements Partitioner {

    @Override
    public Map<String, ExecutionContext> partition(int gridSize) {
        Map<String, ExecutionContext> result = new HashMap<>();
        for (int i = 1; i <= gridSize; i++) {
            ExecutionContext value = new ExecutionContext();
            value.put("queueName", "ESMA_FX_" + i);
            result.put("partition" + i, value);
        }
        return result;
    }
}