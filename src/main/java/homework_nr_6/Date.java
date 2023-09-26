package homework_nr_6;

public class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void setDate(int date) {
        this.date = date;
        int firstDateOfMonth = 1;
        int endDateOfMonth = 31;
        if(date >= firstDateOfMonth && date <= endDateOfMonth){
        System.out.println("Date is : " + date);
        } else {
        System.out.println("This value can't be used as date of month. Try another value.");
        }
    }
    public void setMonth(int month) {
        this.month = month;
        int firstMonth = 1;
        int endMonth = 12;
        if(month >= firstMonth && month <= endMonth){
        System.out.println("Month is : " + month);
        } else {
        System.out.println("This value can't be used as number of month. Try another value.");
        }
    }

    public void setYear(int year) {
        this.year = year;
        System.out.println("Year is : " + year);
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void dispalyDate() {
        switch (month){
        case (1):
        int firstDateOfMonth1 = 1;
        int endDateOfMonth1 = 31;
        if(date >= firstDateOfMonth1 && date <= endDateOfMonth1){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month January. Try another value.");
        }
        break;
        case (2):
        int firstDateOfMonth2 = 1;
        int endDateOfMonth2 = 28;
        if(date >= firstDateOfMonth2 && date <= endDateOfMonth2){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month February. Try another value.");
        }
        break;
        case (3):
        int firstDateOfMonth3 = 1;
        int endDateOfMonth3 = 31;
        if(date >= firstDateOfMonth3 && date <= endDateOfMonth3){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month March. Try another value.");
        }
        break;
        case (4):
        int firstDateOfMonth4 = 1;
        int endDateOfMonth4 = 30;
        if(date >= firstDateOfMonth4 && date <= endDateOfMonth4){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month April. Try another value.");
        }
        break;
        case (5):
        int firstDateOfMonth5 = 1;
        int endDateOfMonth5 = 31;
        if(date >= firstDateOfMonth5 && date <= endDateOfMonth5){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month May. Try another value.");
        }
        break;
        case (6):
        int firstDateOfMonth6 = 1;
        int endDateOfMonth6 = 30;
        if(date >= firstDateOfMonth6 && date <= endDateOfMonth6){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month June. Try another value.");
        }
        break;
        case (7):
        int firstDateOfMonth7 = 1;
        int endDateOfMonth7 = 31;
        if(date >= firstDateOfMonth7 && date <= endDateOfMonth7){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month July. Try another value.");
        }
        break;
        case (8):
        int firstDateOfMonth8 = 1;
        int endDateOfMonth8 = 31;
        if(date >= firstDateOfMonth8 && date <= endDateOfMonth8){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month August. Try another value.");
        }
        break;
        case (9):
        int firstDateOfMonth9 = 1;
        int endDateOfMonth9 = 30;
        if(date >= firstDateOfMonth9 && date <= endDateOfMonth9){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month September. Try another value.");
        }
        break;
        case (10):
        int firstDateOfMonth10 = 1;
        int endDateOfMonth10 = 31;
        if(date >= firstDateOfMonth10 && date <= endDateOfMonth10){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month October. Try another value.");
        }
        break;
        case (11):
        int firstDateOfMonth11 = 1;
        int endDateOfMonth11 = 30;
        if(date >= firstDateOfMonth11 && date <= endDateOfMonth11){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month November. Try another value.");
        }
        break;
        case (12):
        int firstDateOfMonth12 = 1;
        int endDateOfMonth12 = 30;
        if(date >= firstDateOfMonth12 && date <= endDateOfMonth12){
        System.out.println("Date is : " + date + "/" + month + "/" + year);
        } else {
        System.out.println("This value can't be used as date of month December. Try another value.");
        }
        break;
        default:
        System.out.println("This value can't be used as number of month of the year. Try another value.");
        }
    }
}
