package util;

public class Triangle {
    private Double side1;
    private Double side2;
    private Double side3;
    private Double angle1;
    private Double angle2;
    private Double angle3;

    public Triangle(Double side1, Double side2, Double side3, Double angle1, Double angle2, Double angle3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    public Double getSide3() {
        return side3;
    }

    public void setSide3(Double side3) {
        this.side3 = side3;
    }

    public Double getAngle1() {
        return angle1;
    }

    public void setAngle1(Double angle1) {
        this.angle1 = angle1;
    }

    public Double getAngle2() {
        return angle2;
    }

    public void setAngle2(Double angle2) {
        this.angle2 = angle2;
    }

    public Double getAngle3() {
        return angle3;
    }

    public void setAngle3(Double angle3) {
        this.angle3 = angle3;
    }

    public void defineTriangle(){
        if (getAngle1()==90 || getAngle2()==90 || getAngle3()==90){
            System.out.println("Triângulo Retangulo");
        }if(getAngle1()>90 || getAngle2()>90 || getAngle3()>90){
            System.out.println("Triângulo Obtusângulo");
        }if(getSide1()==getSide2()||getSide1()==getSide3()){
            System.out.println("Triângulo Isóceles");
        }if(getSide1()==getSide2()&&getSide2()==getSide3()){
            System.out.println("Triângulo Equilátero");
        }if(getSide1()!=getSide2()||getSide1()!=getSide3()){
            System.out.println("Triângulo Escaleno");
        }
    }
}
