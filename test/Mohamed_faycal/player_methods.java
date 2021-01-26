//Simple movements of the player
public void checkMovements()
{
  int x=getX();
  int y=getY();
  if(Greenfoot.isKeyDown("up"))
  {
    if(checkCollisions(0,-1,border.class))//check collisions with world's border
    {
      move(0);
    }
    else
    {
      setImage("");
      setLocation(x,y-1);
    }
  }
  if(Greenfoot.isKeyDown("down"))
  {
    if(checkCollisions(0,1,border.class))
    {
      move(0);
    }
    else
    {
      setImage("");
      setLocation(x,y+1);
    }
  }
  if(Greenfoot.isKeyDown("right"))
  {
    if(checkCollisions(1,0,border.class))
    {
      move(0);
    }
    else
    {
      setImage("");
      setLocation(x+1,y);
    }
  }
  if(Greenfoot.isKeyDown("left"))
  {
    if(checkCollisions(-1,0,border.class))
    {
      move(0);
    }
    else
    {
      setImage("");
      setLocation(x-1,y);
    }  
  }
}
//check collision with other objects of any class
public boolean checkCollisions(int x,int y,class cls)
{
  Actor actor = getOneObjectAtOffset(x,y,cls);
  return actor != null; //return true if actor!=null (when using it in a condition write if(checkCollisions(x,y,cls))
}
