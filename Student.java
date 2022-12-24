import java.security.PublicKey;

class Student {
    String name;

    public double calculatingAvg(double[]data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double avg = sum / data.length;
        return avg;
    }

    public String judge(double avg){
        String result;
        if(avg >= 60) {
            result = "passed";
        }else{
            result = "failed";
        }
        return result;
    }

}

