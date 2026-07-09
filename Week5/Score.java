void main() {
    double score1 = Double.parseDouble(IO.readln("Enter score1 : "));
    double score2 = Double.parseDouble(IO.readln("Enter score2 : "));
    double score3 = Double.parseDouble(IO.readln("Enter score3 : "));
    double bonusscore = Double.parseDouble(IO.readln("Enter bonusscore : "));
    double TotalScore = score1 + score2 + score3;
    double Totalbonusscore = score1 + score2 + score3 + bonusscore;
    double AvgtotalScoreWithBonus = Totalbonusscore / 3;
    IO.println(" Total score = " + TotalScore);
    IO.println("TOtal score with bonus = " + Totalbonusscore);
    IO.println(" Average of total score with bonus  = %2f".formatted(AvgtotalScoreWithBonus));
}