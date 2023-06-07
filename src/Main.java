public class Main {
    public static void main(String[] args) {
        // cần 1 biến để đếm số nguyên tố
        // 1 thuật toán để kiểm tra số nguyên tố
        // 1 biến để lưu số cần kiểm tra hiện tại
        int dem = 0;
        int n=2;
        while(dem<20){
            //check số nguyên tố
            if(checkPrime(n)){
                System.out.println("Số nguyên tố thứ "+(dem+1) + " là "+ n);
                dem++;
            }
            n++;
        }
    }
    public static boolean checkPrime(int so){
        boolean flag = true;
        if(so < 2){
            flag= false;
        }
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
           return true;
        } else {
          return false;
        }
    }
}
