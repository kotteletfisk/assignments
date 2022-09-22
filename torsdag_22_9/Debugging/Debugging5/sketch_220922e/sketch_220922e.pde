boolean jobsDone = true;

void setup()
{
    if (isJobDone())
    {
        println("Job's done!"); // fixed statement ';'
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
