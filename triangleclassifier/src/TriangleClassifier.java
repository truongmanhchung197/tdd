public class TriangleClassifier {
    public static String TriangleClassifierTest(double firstEdge, double secondEdge, double thirdEdge) {
        String result="";
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0
                || firstEdge >= secondEdge + thirdEdge || secondEdge >= firstEdge + thirdEdge || thirdEdge >= firstEdge + secondEdge) {
            result = "khong phai la tam giac";
        } else {
            if (firstEdge == secondEdge && secondEdge == thirdEdge) {
                result = "tam giac deu";
            } else if (firstEdge == secondEdge || secondEdge == thirdEdge || firstEdge == thirdEdge) {
                result = "tam giac can";
            } else{
                result="tam giac thuong";
            }

        }
        return result;

    }
}
