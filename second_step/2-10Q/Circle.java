class Circle{
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;
    
    area = (int) (radius * radius * pi);
    area /= 100;
    
    
    System.out.println(radius);
    System.out.println(area);
  }
}
