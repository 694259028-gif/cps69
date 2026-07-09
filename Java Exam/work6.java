void main() {
 IO.print("Enter prince of one dresses : " );
 double dresses = Double.parseDouble(IO.readln());
 IO.print("Enter number of Dresses to buy : " );
 double numDresses = Double.parseDouble(IO.readln());
 IO.print("Enter discout rate : " );
 double discount = Double.parseDouble(IO.readln());
 double totalCost = princeOneDresses * numDresses;
 double discoutAmoumt = discount / 100 * totalCost;
 double netPay = totalCost - discoutAmoumt;
 IO.println("Total Cost = " + totalCost );
 IO.println("discountAmoumt = %1f".formatted(discoutAmoumt));
 IO.println("Net Pay = " + netPay);
}
