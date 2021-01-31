public class Details {
    private String pid;
    private String product_name;
    private String brand;
    private String product_url;
    private int retail_price;
    private int discounted_price;
    private float product_rating;

    public Details() {

    }

    public Details(String pid, String name, String brand, String url, int retail, int discount, float rating) {
        this.pid = pid;
        this.product_name = name;
        this.brand = brand;
        this.product_url = url;
        this.retail_price = retail;
        this.discounted_price = discount;
        this.product_rating = rating;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equals(""))
            this.brand = null;
        else
            this.brand = brand;
    }

    public String getProduct_url() {
        return product_url;
    }

    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }

    public int getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(int retail_price) {
        this.retail_price = retail_price;
    }

    public int getDiscounted_price() {
        return discounted_price;
    }

    public void setDiscounted_price(int discounted_price) {
        this.discounted_price = discounted_price;
    }

    public float getProduct_rating() {
        return product_rating;
    }

    public void setProduct_rating(String product_rating) {
        try {
            if (product_rating.equals("No rating available")) {
                this.product_rating = 0;
            } else {
                this.product_rating = Float.parseFloat(product_rating);

            }
        } catch (NumberFormatException ex) {

        }

    }

}
