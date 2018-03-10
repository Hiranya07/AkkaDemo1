package com.geekcab.akka.prime.message;

/**
 * Created by Admin on 09-03-2018.
 */
import java.util.ArrayList;
import java.util.List;

public class Result
{
    private List<Long> results = new ArrayList<Long>();

    public Result()
    {
    }

    public List<Long> getResults()
    {
        return results;
    }
}
