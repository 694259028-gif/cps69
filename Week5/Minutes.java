void main() {
    int hours = Integer.parseInt(IO.readln("Enter hours : "));
    int minutes = Integer.parseInt(IO.readln("Enter minutes :"));
    int totalminues = hours * 60 + minutes;
    IO.println("Totalminutes = " + totalminues + "Minutes");
}
