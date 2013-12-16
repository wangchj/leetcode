public class MinimumPathSumSol2
{
    public int minPathSum(int[][] grid)
    {
        java.util.PriorityQueue<State> pq = new java.util.PriorityQueue<State>();
        pq.add(new State(0, 0, grid[0][0]));
        while(true)
        {
            State s = pq.poll();
            if(s.x == grid.length -1 && s.y == grid[0].length - 1)
                return s.dist;
            if(s.x < grid.length - 1)
                pq.add(new State(s.x + 1, s.y, s.dist + grid[s.x + 1][s.y]));
            if(s.y < grid[0].length - 1)
                pq.add(new State(s.x, s.y + 1, s.dist + grid[s.x][s.y + 1]));    
        }
        //return 0;
    }
    
    class State implements Comparable
    {
        int dist, x, y;
        State(int x, int y, int dist)
        {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
        
        public int compareTo(Object o)
        {
            State s = (State)o;
            if(dist < s.dist) return -1;
            if(dist > s.dist) return 1;
            return 0;
        }
    }
}