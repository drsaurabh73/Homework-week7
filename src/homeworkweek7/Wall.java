package homeworkweek7;

public class Wall {// class with the name Wall
    double width;
    double height;

    public Wall() { }
//
        public Wall(double width, double heitht){
            if (width > 0 && heitht < 0) {
                this.width = width;
                this.height = 0;
            } else if (width < 0 && heitht > 0) {
                this.width = 0;
                this.height = 0;
            } else if (width < 0 && heitht < 0) {
                this.width = 0.0;
                this.height = 0.0;
            } else {
                this.width = width;
                this.height = heitht;
            }


    }


    public static void main(String[] args) {

        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());


    }
//Method named getWidth without any parameters, it needs to return the value of width field
    public double getWidth() {
        return width;
    }
  //  Method named getHeight without any parameters, it needs to return the value of height field
    public double getHeight() {
        return height;
    }
//Method named setWidth with one parameter of type double
    public void setWidth(double width) {
        if (width < 0.0) {
            this.width = 0.0;
        } else
            this.width = width;
    }
//Method named setHeight with one parameter of type double
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;
    }
//Method named getArea without any parameters, it needs to return the area of the wall
    public double getArea() {
        return this.width * this.height;
    }


}



