package sample05;

public class OrderMessageImpl implements OrderMessage {
    private int orderId;

    private String message;

    private UserBean userBean;

    private ProductBean productBean;

    @Override
    public void getOrderMessage() {
        System.out.println("orderId = " + orderId);
        System.out.println("name = " + getUserBean().getName());
        System.out.println("phone = " + getUserBean().getPhone());
        System.out.println("productName = " + getProductBean().getProductName());
        System.out.println("productPrice = " + getProductBean().getProductPrice());
        System.out.println("message = " + message);
    }

    public int getOrderId() {
        return orderId;

    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public ProductBean getProductBean() {
        return productBean;
    }

    public void setProductBean(ProductBean productBean) {
        this.productBean = productBean;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("orderId=").append(orderId);
        sb.append(", message='").append(message).append('\'');
        sb.append(", userBean=").append(userBean);
        sb.append(", productBean=").append(productBean);
        return sb.toString();
    }
}
