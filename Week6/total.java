void main() {
IO.print( "Enter your numberone :");
int numberone = Integer.parseInt(IO.readln());
   IO.print("Enter your numbertwo :");
int numbertwo = Integer.parseInt(IO.readln());
if(numberone>numbertwo) {
     int totalnumber = numberone-numbertwo;
     IO.println(totalnumber);
}
else {
     int total = numberone+numbertwo;
     IO.println( total );
    }
}