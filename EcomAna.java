public class EcomAna {
  static void binarySearch(Details[] d, String x) {
    int p = 0;
    int temp = 0;
    int l = 0, r = d.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;
      int res = x.compareTo(d[m].getPid());
      if (res == 0) {
        p = m;
        temp = 1;
      }
      if (res > 0)
        l = m + 1;
      else
        r = m - 1;
    }
    if (temp != 1)
      System.out.println("\nNo product is available with the specific Product id");
    else
      System.out
          .println("\n**" + d[p].getPid() + " (Productid) , " + d[p].getProduct_name() + " (Name) , " + d[p].getBrand()
              + " (Brand) , " + d[p].getProduct_url() + " (URL) , " + d[p].getRetail_price() + " (Retail Price) , "
              + d[p].getDiscounted_price() + " (Dis. Price) , " + d[p].getProduct_rating() + " (Rating) **");
  }
}
