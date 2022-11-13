public class maze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true}
                ,{true,true,true}
                ,{true,true,true}
        };
        count("",maze,0,0);

    }
    static void count(String p,boolean[][] maze,int r , int c){
//        if(r == 1 || c == 1) return 1;

//        int left = count(r-1,c);
//        int right = count(r,c-1);
//
//        return left + right;

        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) return;


maze[r][c] = false;

if(r < maze.length-1) count(p + 'D',maze,r+1,c);
if(c < maze[0].length-1) count(p + 'R',maze,r,c+1);
if(r > 0) count(p + 'U',maze,r-1,c);
if(c > 0) count(p + 'L',maze,r,c-1);

maze[r][c] = true;



    }
}
