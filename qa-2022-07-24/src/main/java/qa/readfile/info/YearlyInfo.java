package qa.readfile.info;

public class YearlyInfo {
    public int month;
    public int amount;
    public boolean isExpense;

    public YearlyInfo(int month, int amount, boolean isExpense) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }

    @Override
    public String toString() {
        return "YearlyInfo{" +
                "month=" + month +
                ", amount=" + amount +
                ", isExpense=" + isExpense +
                '}';
    }
}
