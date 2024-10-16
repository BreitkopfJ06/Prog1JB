public static int getMinSurroundingColumn(final Coordinate start, final Coordinate end)
{
    if(start.column <= end.column)
    {
        if(start.column - 1 >= 1)
        { 
            return start.column - 1;
        }
        else
        {
            return start.column;
        }
    }
    else
    {
        if(end.column - 1 >= SIZE)
        {
            return end.column - 1;
        }
        else
        {
            return end.column;
        }
    }
}
