public class gen{

    public static < A > void printArray(A[] ele) {
        for ( A ele1 : ele){
            System.out.println(ele1 );
        }
        System.out.println();
    }
    public static void main( String args[] ) {
        Integer[] Arr1 = { 10, 20, 30, 40, 50 };
        Character[] Arr2 = {'A','B','H','I','S','H','E','K'};

        System.out.println( "Integer Array" );
        printArray( Arr1  );

        System.out.println( "Character Array" );
        printArray( Arr2 );
    }
}
