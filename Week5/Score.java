void main() {
    int score1 = Integer.parseInt(IO.readln("Enter score1 : "));
    int score2 = Integer.parseInt(IO.readln("Enter score2 : "));
    int score3 = Integer.parseInt(IO.readln("Enter score3 : "));
    int bonus = Integer.parseInt(IO.readln("Enter bous : "));
    int Totalscore = score1 + score2 + score3;
    IO.println(" Totalscore = " + score1 + score2 + score3);
    int Totalwithbous = Totalscore + bonus;
    IO.println("Tot")
    float averagofwithbonus = Totalwithbous / 3;
}