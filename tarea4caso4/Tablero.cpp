#include <stdio.h>
#include <iostream>    
#include <algorithm>   
#include <vector>      

int param_x;
int area;

Tablero(int p_x)
{
    param_x = p_x;
    area = p_x * p_x;
    printf("Se creo tablero")
}

int getX()
{
    return param_x;
}

int getArea()
{
    return area;
}
