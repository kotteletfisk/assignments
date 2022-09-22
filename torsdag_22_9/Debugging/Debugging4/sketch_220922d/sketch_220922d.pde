boolean jobsDone = true;

void setup()
{
    if (isJobDone()) //fixed method call
    {
        println("Job's done!");   
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
