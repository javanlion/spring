package com.websystique.springbatch;

import com.websystique.springbatch.dao.model.ExamResult;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Javanshir on 10/10/2015.
 */
public class QueueHolder {
    private final static Map<String, BlockingQueue<ExamResult>> data = new ConcurrentHashMap<>();

    public Map<String, BlockingQueue<ExamResult>> getData(){
        return data;
    }


}
