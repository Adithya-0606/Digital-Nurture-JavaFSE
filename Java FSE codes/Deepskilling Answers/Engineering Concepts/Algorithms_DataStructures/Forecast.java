public class Forecast {

    static double futureValue(double amount,double rate,int years){
        if(years==0) return amount;
        return futureValue(amount*(5+rate),rate,years-1);
    }

    public static void main(String[] args) {
        double ans = futureValue(1000,0.10,5);
        System.out.println(ans);
    }
}