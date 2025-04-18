public class Shape {
    private String color="white";
    public Shape(){

    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
/*
    public void describe(int sideA,int sideB){
        System.out.println("sİDE A İS "+sideA+"side b is"+sideB);
    }
    public void describe(int sideA){
        System.out.println("sİDE A İS "+sideA);
    }
    public void describe(double sideA){
        System.out.println("radius A İS "+sideA);
    }

*/

    public void describe(){
        System.out.println("this is a shape and "+"its color is "+this.color);
    }
}
