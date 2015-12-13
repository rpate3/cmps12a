


public class Test {

	public static void main(String[] args) {

		CQueue  my_favorites = new CQueue(14);
        int     i;

	for( i=0; i < my_favorites.size; i++ )
		 my_favorites.buffer[i] = (float) (1.1*(i+1));

        System.out.println( "My favorites" );
        my_favorites.print();
        my_favorites.shift();
        System.out.println( "My new favorites" );
        my_favorites.print();
    }

}
