boolean jobsDone = true; //updated value after done job

void setup()
{
    if (isJobDone())
    {
        println("Job's done!");   
    }
}

boolean isJobDone() //fixed return type
{
    return jobsDone;    
}
