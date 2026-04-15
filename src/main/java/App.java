public class App{
    public static boolean cancel(String orderId, double amount){
        if(orderId == null || orderId.isEmpty() || amount <= 0){
            return false;
        }
        return true;
    }
    public static boolean refund(String orderId, double amount){
        if(orderId == null || orderId.isEmpty() || amount <= 0){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("Hello devops");
    }
}
