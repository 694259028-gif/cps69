void main() {
    IO.print("Salary :");
    double Salary = Double.parseDouble(IO.readln());
    IO.print(" deduction percent :");
    double deductionpercent = Double.parseDouble(IO.readln());
    double deduction = Salary * deductionpercent / 100;
    double netsalary = Salary - deduction;
    IO.println("Deduction = " + deduction);
    IO.println("Net Salary = " + netsalary);
}
