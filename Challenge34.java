import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Challenge34 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data_flipkart_product_sample.csv"); // data_flipkart_product_sample.csv
        BufferedReader br = new BufferedReader(fr);
        String line;
        Details d = new Details();
        Details d1[] = new Details[19922];
        int j = 0;
        try {
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] obj = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                d.setPid(obj[0]);
                d.setProduct_name(obj[1]);
                d.setBrand(obj[2]);
                d.setProduct_url(obj[3]);
                d.setRetail_price(Integer.parseInt(obj[4]));
                d.setDiscounted_price(Integer.parseInt(obj[5]));
                d.setProduct_rating(obj[6]);
                d1[j] = new Details(d.getPid(), d.getProduct_name(), d.getBrand(), d.getProduct_url(),
                        d.getRetail_price(), d.getDiscounted_price(), d.getProduct_rating());
                j++;
            }
        } catch (Exception e) {

        }
        br.close();
        fr.close();
        EcomAna s = new EcomAna();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Product_id :- ");
        String str = obj.next();

        long st = System.currentTimeMillis();
        s.binarySearch(d1, str);
        long en = System.currentTimeMillis();
        System.out.println("\nTime Taken(ms)- " + (en - st) + "\n");
    }
}
