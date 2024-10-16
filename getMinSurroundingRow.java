public static int getMinSurroundingRow(final Coordinate start, final Coordinate end)
{
    if(start.row <= end.row)
    {
        return start.row;
    }
    else
    {
        return end.row;
    }
}
