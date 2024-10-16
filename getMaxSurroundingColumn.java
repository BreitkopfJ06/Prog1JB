public static int getMaxSurroundingColumn(final Coordinate start, final Coordinate end)
{
    if(start.column >= end.column)
    {
        return start.column;
    }
    else
    {
        return end.column;
    }
}
