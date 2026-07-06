void main() {
    IO.print("Enter wide : ");
    double wide = Double.parseDouble(IO.readln());
    IO.print("Enter lengthy : ");
    double lengthy = Double.parseDouble(IO.readln());
    double area = wide * lengthy / 360;
    IO.println("BSA = %.2f".formatted(area));
}