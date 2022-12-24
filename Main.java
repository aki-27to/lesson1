public class Main {
    public static void main(String[] args) {
        //クラス名＋オブジェクト名　new演算子から読み込んで代入
        //インスタンス化が完了
        Student a001 = new Student();
        //オブジェクト名.フィールド名、フィールドに値の代入
        a001.name = "sato";
        double[] data = {70,65,40,90,30,29};

        double avg = a001.calculatingAvg(data);
        String result = a001.judge(avg);

        //平均値を表示させ、名前とjudge関数の結果（result）を表示。
        System.out.println(avg);
        System.out.println(a001.name+""+result);
    }
}
