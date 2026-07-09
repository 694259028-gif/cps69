void main() {
    IO.print("Enter initial : ");
    double initial = Double.parseDouble(IO.readln());
    IO.println("Enter Months : ");
    double Months = Double.parseDouble(IO.readln());
    IO.print("MonthlySaving : ");
    double MonthlySaving =Double.parseDouble(IO.readln());
    IO.print("Interstpercent : ");
    double Interstpercent = Double.parseDouble(IO.readln());
    double TotalSaving = initial + MonthlySaving * Months;
    double Interest = TotalSaving * Interstpercent / 100;
    double FinalSaving = TotalSaving + Interest;

    IO.println(" Total saving before interst = %2f".formatted(TotalSaving));
    IO.println(" Interst= %2f".formatted(Interest));
    IO.println(" Final saving = %2f".formatted(FinalSaving));
}