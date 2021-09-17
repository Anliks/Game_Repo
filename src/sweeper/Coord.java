package sweeper;

public class Coord {
    public int x;
    public int y;

    public Coord(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
   @Override
    public boolean equals(Object O_O) {
        if (O_O instanceof Coord) {
            Coord to = (Coord)O_O;
            return to.x == x && to.y == y;
        }
     return super.equals(O_O);
   }


}
