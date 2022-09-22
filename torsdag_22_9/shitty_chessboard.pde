
int[][] board = new int[8][8];

int boardSize = 100; 

void setup ()
{
  fullScreen();
  background(255);
  
  // Load values in arrays
  for (int i = 0; i < 8 ; i++)
    for (int j = 0; j < 8; j++)
    {
      if ( j % 2 == 0)
      board[i][j] = 1;
      
      else board[i][j] = 0;
      
      println(board[i][j]);
    }
    
}

void draw()
{
  // draw piano like structure instead of chessboard
    for (int y = 0; y < 8; y++)
      for (int x = 0; x < 8; x++)
      {  
        if (board[y][x] == 0)
          fill(0);
          
        else
        {
          fill(255);
          stroke(0);
        }
               
        rect(x * boardSize, y * boardSize, boardSize, boardSize);
      }
}
