class Car{
    String brand;
    int speed;
    void displayInfo(){
        System.out.println("Brand:"+brand+"Speed:"+speed);
    }
}class main{
    public static void main(String[]args ){
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 120;
        car1.displayInfo();
        //object 2
        Car car2 = new Car();
        car2.brand = "TATA";
        car2.speed = 140;
        car2.displayInfo();
    }
}
