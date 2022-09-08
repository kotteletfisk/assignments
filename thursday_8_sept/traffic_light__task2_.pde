void setup()
{
  size(400, 400);
  frameRate(2);
}


boolean green = true;

void draw()
{
  // Body of traffic light
  fill(100);
  rect(150, 100, 100, 200);
  
  
  // top green light
  if (green)
  {
    fill(0, 255, 0);
  }
  
  else fill(150);
  {
    ellipse(200, 140, 50, 50);
  }
  
  
  // Bottom red light
  if (!green && frameCount >= 15)
  {
    fill(255, 0, 0);
  }
 
  else fill(150);
  
  ellipse(200, 260, 50, 50);
  
  
  // Middle yellow light
  if (green && frameCount < 4)
  {
    fill(255, 255, 0);
  }
  
  else if (!green && (frameCount > 10 && frameCount < 15))
  {
    fill(255, 255, 0);
  }
  
  else fill(150);
  
  ellipse(200, 200, 50, 50);
  
  // Animation loop
  if (frameCount > 20)
  {
    green = true;
    frameCount = 0;
  }
  
  else if (frameCount > 10 )
  {
    green = false;
  }
}
