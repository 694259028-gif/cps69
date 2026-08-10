void main() {
  IO.print("Enter product : ");
  int product = Integer.parseInt(IO.readln());
  IO.print("Enter Quantity : ");
  int Quantity = Integer.parseInt(IO.readln());
  int total = product * Quantity;
  IO.println("total  is : " + total + "bath");
  int change = 1000 - total;
  IO.println("Change is : " + change + "bath");
  if (total > 1000) {
    IO.println("Not enough money!!");
  } else {
    int chang = 1000 - total;
    int b500 = change / 500;
    change = change % 500;
    int b100 = change / 100;
    change = change % 100;
    int b50 = change / 50;
    change = change % 50;
    int b20 = change / 20;
    change = change % 20;
    int b10 = change / 10;
    change = change % 10;
    int b5 = change / 5;
    change = change % 5;
    int b2 = change / 2;
    change = change % 2;
    IO.println("five-hundred note: " + b500 + "note(s)");
    IO.println("hundred note: " + b100 + "note(s)");
    IO.println("fifty note: " + b50 + "note(s)");
    IO.println("twenty  note: " + b20 + "note(s)");
    IO.println("ten note: " + b10 + "note(s)");
    IO.println("Five note: " + b5 + "note(s)");
    IO.println("two note: " + b2 + "note(s)");
    IO.println("one note: " + change + "note(s)");
  }
}