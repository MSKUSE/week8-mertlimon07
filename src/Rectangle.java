public class Rectangle extends Shape {

    private int sideA=0,sideB=0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("sidea"+sideA+"sideb"+sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle=(Rectangle) obj;
        if(this.sideA==rectangle.getSideA() && this.sideB==rectangle.sideB &&this.getColor()==rectangle.getColor()
        ){return true;

        }
        else{return false;}
    }
}
