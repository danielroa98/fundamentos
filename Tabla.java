public class Tabla
{
  public static void main(String[] args)
  {
    for (int i=0; i>=-1 && i<=11; i++)
      {
        for (int j=0 ; j>=-1 && j<=11; j++)
          {
            System.out.format("    "+i*j);
          }
        System.out.println();
    }
  }
  /*
  C:\Users\danie\Favorites\Programacion\Fundamentos>java Tabla
    0    0    0    0    0    0    0    0    0    0    0    0
    0    1    2    3    4    5    6    7    8    9    10    11
    0    2    4    6    8    10    12    14    16    18    20    22
    0    3    6    9    12    15    18    21    24    27    30    33
    0    4    8    12    16    20    24    28    32    36    40    44
    0    5    10    15    20    25    30    35    40    45    50    55
    0    6    12    18    24    30    36    42    48    54    60    66
    0    7    14    21    28    35    42    49    56    63    70    77
    0    8    16    24    32    40    48    56    64    72    80    88
    0    9    18    27    36    45    54    63    72    81    90    99
    0    10    20    30    40    50    60    70    80    90    100    110
    0    11    22    33    44    55    66    77    88    99    110    121

    No pude cambiar los valores horizontales y verticales para que no sean 0
    */
}
