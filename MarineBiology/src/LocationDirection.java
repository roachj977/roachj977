
public class LocationDirection {

	 private static final int ENV_ROWS = 10;      // rows in environment
	    private static final int ENV_COLS = 10;      // columns in environment


	    /** Start the Marine Biology Simulation program.
	     *  The String arguments (args) are not used in this application.
	     **/
	    public static void main(String[] args)
	    {
	        // Construct an empty environment and several fish in the context
	        // of that environment.
	        BoundedEnv env = new BoundedEnv(ENV_ROWS, ENV_COLS);
	       
	        Location loc1 = new Location(7, 3);
	        Location loc2 = new Location(7 , 4);
	        Direction dir1 = env.getDirection(loc1, loc2);
	        Direction dir2 = dir1.toRight(90);
	        Direction dir3 = dir2.reverse();
	        Location loc3 = env.getNeighbor(loc1, dir3);
	        Location loc4 = env.getNeighbor(new Location(5 , 2), dir1);
	        System.out.println(loc1);
	        System.out.println(loc2);
	        System.out.println(dir1);
	        System.out.println(dir2);
	        System.out.println(dir3);
	        System.out.println(loc3);
	        System.out.println(loc4);
	        System.out.println(dir3.inDegrees());
	       
	        }
	    }
	
