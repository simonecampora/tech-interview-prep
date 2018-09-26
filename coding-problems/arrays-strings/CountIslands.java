public class CountIslands{

  /*
  Problem:
  Complexity: O(rc) as we have to visit all cells
  */
  public static int CountIslands(char[][] grid){
    int count = 0;

    for(int c = 0; c < grid[0].length; c++){
        for(int r = 0; r < grid.length; r++){
            if(grid[r][c]=='X'){
                if((r == 0 || grid[r-1][c]=='O') && (c==0 || grid[r][c-1]=='O'))
                {
                   count++;
                }
            }
        }
    }
    return count;
  }

  public static void main(String [] args){
    //Testing different inputs

    char[][] map1 = new char[][] {{'O', 'O', 'O'},
                                  {'X', 'X', 'O'},
                                  {'X', 'X', 'O'},
                                  {'O', 'O', 'X'},
                                  {'O', 'O', 'X'},
                                  {'X', 'X', 'O'}};

    char[][] map2 =  new char[][] {{'X', 'O', 'O', 'O', 'O', 'O'},
                                   {'X', 'O', 'X', 'X', 'X', 'X'},
                                   {'O', 'O', 'O', 'O', 'O', 'O'},
                                   {'X', 'X', 'X', 'O', 'X', 'X'},
                                   {'X', 'X', 'X', 'O', 'X', 'X'},
                                   {'O', 'O', 'O', 'O', 'X', 'X'}};

    System.out.println(CountIslands(map1) + " = " + "3");
    System.out.println(CountIslands(map2) + " = " + "4");

  }
}
