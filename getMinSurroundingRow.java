public static int getMinSurroundingRow(final Coordinate start, final Coordinate end)
{
    if(start.row <= end.row)
    {
        if(start.row - 1 >= SIZE)
        { 
            return start.row - 1;
        }
        else
        {
            return start.row;
        }
    }
    else
    {
        if(end.row - 1 >= SIZE)
        {
            return end.row - 1;
        }
        else
        {
            return end.row;
        }
    }
}