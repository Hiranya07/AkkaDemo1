package com.geekcab.akka.prime;

/**
 * Created by Admin on 09-03-2018.
 */
import akka.actor.UntypedActor;
import com.geekcab.akka.prime.message.Result;


public class PrimeListener extends UntypedActor
{
    @Override
    public void onReceive( Object message ) throws Exception
    {
        if( message instanceof Result )
        {
            Result result = ( Result )message;

            System.out.println( "Results: " );
            for( Long value : result.getResults() )
            {
                System.out.print( value + ", " );
            }
            System.out.println();

            // Exit
            getContext().system().shutdown();
        }
        else
        {
            unhandled( message );
        }
    }
}
