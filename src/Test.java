public class Test {
    public static void main(String[] args) {
        Product s1 = new Product("111","Coca", 12.000,"Vip");
        Product s2 = new Product("112","Caffe", 16.000,"Vip1");
        Product s3 = new Product("113","Soda", 17.000,"Vip2");
        Product s4 = new Product("114","Cam", 19.000,"Vip3");
        OrderItem p1 = new OrderItem(s1,23);
        OrderItem p2 = new OrderItem(s2,24);
        OrderItem p3 = new OrderItem(s3,25);
        OrderItem p4 = new OrderItem(s4,26);
        OrderItem[] itemp = {p1,p2,p3,p4};
        Order s = new Order(itemp);
        System.out.println(s.contains(s1));
        Product[] filteredProducts = s.filter("Vip1");

        for (Product product : filteredProducts) {
            System.out.println("Product Name: " + product.getId());
            System.out.println("Product Type: " + product.getType());
            // Hiển thị các thông tin khác về sản phẩm tại đây
        }
    }




}
