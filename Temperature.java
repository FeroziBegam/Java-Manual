class Temperature{
public static double CelsiustoFahrenheit(double celsius){
  return(celsius*1.8)+32;
}
public static double FahrenheittoCelsius(double fahrenheit) {
 return (fahrenheit-32)*0.5;
}
public static void main(String[] args){
double celsius=100;
double fahrenheit=100;
System.out.println(celsius+"C is equal to"+CelsiustoFahrenheit(celsius)+"F");
System.out.println(fahrenheit+"C is equal to"+FahrenheittoCelsius(fahrenheit)+"C");

 }
}