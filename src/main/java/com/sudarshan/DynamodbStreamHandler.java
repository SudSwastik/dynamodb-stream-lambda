package com.sudarshan;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.DynamodbEvent;

public class DynamodbStreamHandler implements RequestHandler<DynamodbEvent, String> {

    @Override
    public String handleRequest(DynamodbEvent ddbEvent, Context context) {

        ddbEvent.getRecords().forEach(record -> {
            System.out.println(record.toString());
        });

        return "Done";
    }
}