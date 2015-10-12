package com.websystique.springbatch.reader;


import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * Created by Javanshir on 10/10/2015.
 */
public class DummyReader implements ItemReader {

    boolean sendNull = false;

    @Override
    public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if(! sendNull) {
            sendNull = true;
            return new Object();
        }
        return null;
    }
}
