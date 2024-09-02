import java.util.ArrayList;

public class ControlFlow {
	public static void main(String[] args) {
		ArrayList<String> listTest = new ArrayList<String>();
		
		listTest.add( "first item" );
		listTest.add( "second item" );
		listTest.add( "third item" );

		System.out.println(listTest.get( 2 ));
                
                for (String item : listTest) {
                    System.out.println(item);
                }
			
	}
}