public class Main
{
  public static void main(String[] args)
  {
    System.out.println(DistanceFormula(10, 10, 0, 0));

    System.out.println(QuadraticNegative(1, -1, -6));

    System.out.println(QuadraticPositive(1, -1, -6));
  }

  public static double DistanceFormula(double x1, double y1, double x2, double y2) {
    double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2-y1));
    return distance;
  }

  public static double QuadraticPositive(double a, double b, double c) {
    double discriminant = Math.sqrt(b * b - 4 * a * c);
    double solution = (-1 * b + discriminant) / (2 * a);
    return solution;
  }

  public static double QuadraticNegative(double a, double b, double c) {
    double discriminant = Math.sqrt(b * b - 4 * a * c);
    double solution = (-1 * b - discriminant) / (2 * a);
    return solution;
  }
}
