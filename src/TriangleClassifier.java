public class TriangleClassifier {
    public static   String findKindOfTriangle(int a, int b, int c){

        if (a==b && b==c){
            return "tam giac deu";

        }
        if (a == b || b == c || a == c){
            return "tam giac can";
        }
        else return "tam giac thuong";

    }
}
