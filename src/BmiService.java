public class BmiService {
    public int calculate (double height, double weight) {
        double index = weight / (height * height);
        int indexBmi = (int) index;
        return indexBmi;
    }
}
