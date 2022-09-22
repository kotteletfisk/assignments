boolean jobsDone = true;

void setup()
{
    println(isValueGreaterThanThreshold(10, 5));
    println(isValueGreaterThanThreshold(4, 8));
    
    if (isJobDone())
    {
        println("Job's done!"); 
    }
}

boolean isValueGreaterThanThreshold(int value, int threshold) 
{
    return value > threshold;  // fixed return values. "else" statement was missing. Made more compact
  
}

boolean isJobDone()
{
    return jobsDone;    
}
