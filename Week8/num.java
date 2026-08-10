void main() {
    IO.print("Enter  number1 : ");
    int number1 = Integer.parseInt(IO.readln());
    IO.print("Enter number2 : ");
    int number2 = Integer.parseInt(IO.readln());
    IO.println(" current -> number1 = " + number1 + "number2 = " + number2);
    int number3 = number2;
    number1 = number3;
    number2 = number1;
    IO.println("Now -> number1 = " + number1 + " number2 = " + number2);
}