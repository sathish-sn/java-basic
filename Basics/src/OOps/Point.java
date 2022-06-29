package OOps;

public class Point extends Object{
		private int x;
		private int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		/**
		 * @return the x
		 */
		public int getX() {
			return x;
		}

//		/**
//		 * @param x the x to set
//		 */
//		public void setX(int x) {
//			this.x = x;
//		}

		/**
		 * @return the y
		 */
		public int getY() {
			return y;
		}

//		/**
//		 * @param y the y to set
//		 */
//		public void setY(int y) {
//			this.y = y;
//		}

		@Override
		public String toString() {
			
			return "Point [x=" + this.x + ", y=" + this.y + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			
		  if(obj instanceof Point) {
			  Point p = (Point)obj;
			  boolean res = (this.x == p.x && this.y == p.y);
			  return res;
		  }
		  else 
			  return false;
		}
		
}
