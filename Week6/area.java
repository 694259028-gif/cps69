void main() {
    IO.print("Enter a number : ");
    int number = Integer.parseInt(IO.readln());
    if (number == 1) {
        IO.println("Enter the base of the triangle: ");
        double base = Double.parseDouble(IO.readln());
        IO.println("Enter the height of the triangle: ");
        double height = Double.parseDouble(IO.readln());
        double areaofthetriangle = 0.5 * base * height;
        IO.println(" Area of the triangle: " + areaofthetriangle);
    }

    else {
        IO.println("Enter the your weight: ");
        double weight = Double.parseDouble(IO.readln());
        IO.println("Enter the height in kilograms: ");
        double kilograms = Double.parseDouble(IO.readln());
        double yourBMIforweight = (double) weight / kilograms;
        IO.println("Enter your BMI: " + yourBMIforweight);
    }
}