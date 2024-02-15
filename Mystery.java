    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package mystery;

    /**
     *
     * @author OcampoG4446
     */
    public class Mystery 
    {
     /*  public static void main( String[] args )
       {
          int y;
          int total = 0;

          for (int x = 1; x<=10;x++ ) 
          {
             y = x * x;
             System.out.println( y );
             total += y;
              System.out.println(x%2==1?"****":"++++++++");
          } // end while

          System.out.printf( "Total is %d\n", total );
       } // end main
    */
         public static void main( String[] args )
       {
          int row = 10;
          int column;
          int totalCount=0;

          //nested while loops
          while ( row >= 1 ) 
          {
             column = 1;

             //multiply this amount of loops time the previous loop
             while ( column <= 5) 
             {
                System.out.print( row % 2 == 1 ? "<" : ">" );
                ++totalCount;
                ++column;
             } // end while

             --row;//decrements the row
             System.out.println();

          } // end while
          System.out.println(totalCount);
       } // end main
    } // end class Mystery
