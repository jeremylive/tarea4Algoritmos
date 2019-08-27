#include <stdio.h>
#include <iostream>     
#include <algorithm>    
#include <vector>       

int f_x, f_y;

Figura(int x, int y)
{
    f_x = x;
    f_y = y;
}

int getX()
{
    return f_x;
}
int getY()
{
    return f_y;
}