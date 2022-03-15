public class Circle {
    public static void main (String[] args){
        char [][] coordinateSystem = new char[50][50]; // Data_Type[][] Array_Name = new int[Row_Size][Column_Size].
        for (int r=0;r<=49;r++) {
            for (int c = 0; c <= 49; c++) {
                coordinateSystem[r][c] = '.';
            }
        }
        //Array[ordinate from up to down][abscissa from left to right]
        System.out.print("Input the X value for the first circle: ");
        int XFirstCircleCenter = extra.Console.readInt();
        System.out.print("Input the Y value for the first circle: ");
        int YFirstCircleCenter = extra.Console.readInt();
        System.out.println("The center for the first circle: (" + XFirstCircleCenter + ";" + YFirstCircleCenter + ").");
        System.out.print("Please input the first circle's radius: ");
        int radiusFirst = extra.Console.readInt();
        System.out.println("The first circle radius is " + radiusFirst + ".");
        YFirstCircleCenter = 50 - YFirstCircleCenter;
        double X1;
        double Y1;
        for (double degree = 0; degree<=359;degree=degree+1){
            X1 = Math.cos(degree)*radiusFirst;
            X1 = Math.round(X1);
            Y1 = Math.sin(degree)*radiusFirst;
            Y1 = Math.round(Y1);
            coordinateSystem[YFirstCircleCenter - (int)Y1][XFirstCircleCenter + (int)X1]='x';
        }
        System.out.print("Input the X value for the second circle: ");
        int XSecondCircleCenter = extra.Console.readInt();
        System.out.print("Input the Y value for the second circle: ");
        int YSecondCircleCenter = extra.Console.readInt();
        System.out.println("The center for the second circle: (" + XSecondCircleCenter + ";" + YSecondCircleCenter + ").");
        System.out.print("Please input the second circle's radius: ");
        int radiusSecond = extra.Console.readInt();
        System.out.println("The second circle radius is " + radiusSecond + ".");
        YSecondCircleCenter = 50 - YSecondCircleCenter;
        double X2;
        double Y2;
        for (double degree = 0; degree<=359;degree=degree+1){
            X2 = Math.cos(degree)*radiusSecond;
            X2 = Math.round(X2);
            Y2 = Math.sin(degree)*radiusSecond;
            Y2 = Math.round(Y2);
            if (coordinateSystem[YSecondCircleCenter - (int)Y2][XSecondCircleCenter + (int)X2]=='x')
                coordinateSystem[YSecondCircleCenter - (int)Y2][XSecondCircleCenter + (int)X2]='X';
            else if (coordinateSystem[YSecondCircleCenter - (int)Y2][XSecondCircleCenter + (int)X2]=='.')
                coordinateSystem[YSecondCircleCenter - (int)Y2][XSecondCircleCenter + (int)X2]='y';
            else if (coordinateSystem[YSecondCircleCenter - (int)Y2][XSecondCircleCenter + (int)X2]=='X')
                coordinateSystem[YSecondCircleCenter - (int)Y2][XSecondCircleCenter + (int)X2]='X';
        }

        for (int r=0;r<=49;r++) {
            for (int c = 0; c <= 49; c++) {
                System.out.print(coordinateSystem[r][c]);
            }
            System.out.println();
        }

        // Let's calculate the distance between the centers of the two circles.
        double distance = 0;
        double radiusSum = radiusFirst + radiusSecond;
        if (YFirstCircleCenter==YSecondCircleCenter){
            distance = Math.abs(XSecondCircleCenter - XFirstCircleCenter);
            System.out.println("The distance between the centers of the circles is " + distance);
            if ((distance<radiusSum) && (distance!=0)){
                if (radiusFirst>=radiusSecond) {
                    if ((distance + radiusSecond) < radiusFirst)
                        System.out.println("One of the circles contains the other inside its area.");
                    else
                        System.out.println("The circles have 2 intersections.");
                }
                else if (radiusSecond>=radiusFirst) {
                    if ((distance + radiusFirst) < radiusSecond)
                        System.out.println("One of the circles contains the other inside its area.");
                    else
                        System.out.println("The circles have 2 intersections.");
                }
            }
            else if (distance==radiusSum)
                System.out.println("The circles have only 1 intersection.");
            else if ((distance==0) && (radiusFirst==radiusSecond))
                System.out.println("The circles are the same, i.e. they cover each other.");
            else if (distance>radiusSum)
                System.out.println("The circles don't intersect each other.");
        }
        else if (XFirstCircleCenter==XSecondCircleCenter) {
            distance = Math.abs(YSecondCircleCenter - YFirstCircleCenter);
            System.out.println("The distance between the centers of the circles is " + distance);
            if ((distance<radiusSum) && (distance!=0)){
                if (radiusFirst>=radiusSecond) {
                    if ((distance + radiusSecond) < radiusFirst)
                        System.out.println("One of the circles contains the other inside its area.");
                    else
                        System.out.println("The circles have 2 intersections.");
                }
                else if (radiusSecond>=radiusFirst) {
                    if ((distance + radiusFirst) < radiusSecond)
                        System.out.println("One of the circles contains the other inside its area.");
                }
            }
            else if (distance==radiusSum)
                System.out.println("The circles have only 1 intersection.");
            else if ((distance==0) && (radiusFirst==radiusSecond))
                System.out.println("The circles are the same, i.e. they cover each other.");
            else if (distance>radiusSum)
                System.out.println("The circles don't intersect each other.");
            else
                System.out.println("One of the circles contains the other inside its area.");
        }
        else {
            double XCathetus = Math.abs(XSecondCircleCenter - XFirstCircleCenter);
            double YCathetus = Math.abs(YSecondCircleCenter - YFirstCircleCenter);
            distance = Math.sqrt(Math.pow(XCathetus,2)+Math.pow(YCathetus,2)); // Pythagoras theorem.
            System.out.println("The distance between the centers of the circles is " + distance);
            if ((distance<radiusSum) && (distance!=0)) {
                if (radiusFirst>=radiusSecond) {
                    if ((distance + radiusSecond) < radiusFirst)
                        System.out.println("One of the circles contains the other inside its area.");
                    else
                        System.out.println("The circles have 2 intersections.");
                }
                else if (radiusSecond>=radiusFirst) {
                    if ((distance + radiusFirst) < radiusSecond)
                        System.out.println("One of the circles contains the other inside its area.");
                    else
                        System.out.println("The circles have 2 intersections.");
                }
            }
            else if (distance==radiusSum)
                System.out.println("The circles have only 1 intersection.");
            else if ((distance==0) && (radiusFirst==radiusSecond))
                System.out.println("The circles are the same, i.e. they cover each other.");
            else if (distance>radiusSum)
                System.out.println("The circles don't intersect each other.");
            else
                System.out.println("One of the circles contains the other inside its area.");
        }
    }
}
