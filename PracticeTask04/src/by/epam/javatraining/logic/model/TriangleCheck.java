package by.epam.javatraining.logic.model;

public class TriangleCheck {

	public static boolean isTriangle (int x_Point1, int y_Point1, int x_Point2, int y_Point2, int x_Point3, int y_Point3){
        if (x_Point1 == x_Point2){
            if (x_Point1 == x_Point3) {
                return false;
            }
            return true;
        }
        else if (y_Point1 == y_Point2) {
            if (y_Point1 == y_Point3) {
                return false;
            }
            return true;
        }
        return true;
    }
	
    public static boolean isRightAngled (int x_Point1, int y_Point1, int x_Point2, int y_Point2, int x_Point3, int y_Point3){
        if (x_Point1 == x_Point2 || y_Point1 == y_Point2){
            if (x_Point1 == x_Point3 || y_Point1 == y_Point3){
                return true;
            }
            else if (x_Point2 == x_Point3 || y_Point2 == y_Point3) {
                return true;
            }
            return false;
        }
        else if (y_Point1 == y_Point3 && x_Point2 == x_Point3) {
            return true;
        }
        else if (x_Point1 == x_Point3 && y_Point2 == y_Point3) {
            return true;
        }
        return false;
    }
    
}
