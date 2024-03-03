public class MazeRunner {
  
  public static String walk(int[][] maze, String[] directions) {
    
    int x = 0;
    int y = 0;
    
    for (int i = 0; i < maze.length; i++){
      
      for (int j = 0; j < maze[0].length; j++){
        
        if(maze[i][j] == 2){
          
          x = j;
          y = i;
          
        }
      }   
    }
    
    for (int i = 0; i < directions.length; i++){
      
      if(directions[i] == "N") y--;
      if(directions[i] == "S") y++;
      if(directions[i] == "E") x++;
      if(directions[i] == "W") x--;
      
      if(x < 0 || x > maze.length - 1 || y < 0 || y > maze.length - 1 || maze[y][x] == 1) return "Dead";
      if(maze[y][x] == 0) continue;
      if(maze[y][x] == 3) return "Finish";
      
    } 
    
    return "Lost";
    
  }
}
