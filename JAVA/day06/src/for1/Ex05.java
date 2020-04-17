package for1;

public class Ex05 {
	public static void main(String[] args) {
		
		/*
		 * 		#
		 * 		# #
		 * 		# # #
		 * 		# # # #
		 * 		# # # # #
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
		/*
		 * 		        #
		 * 		      # #
		 * 		    # # #
		 * 		  # # # #
		 * 		# # # # #
		 */
		System.out.println("=============================\n");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " : ");
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("==============================\n");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " : ");
			for (int j = 0; j < 5; j++) {
				if(j < 4 - i)  	System.out.print("  ");
				else 			System.out.print("# ");
			}
			System.out.println();
		}		
	}
}