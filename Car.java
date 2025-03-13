public class Car {
    final String carType;
    String color;
    String name;
    public Car(String carType,String color,String name){
        this.carType=carType;
        this.color=color;
        this.name=name;
    }
    public String getcolor(){
        return color;
    }
    public String getname(){
        return name;
    }
    public void printCar(){
        System.out.println(this);
    }
    public String toString(){
        return "品牌"+carType+"\n"
              +"颜色"+color+"\n"
              +"车名"+name+"\n";
    }

}
