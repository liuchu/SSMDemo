package pojo;

import java.util.List;

/**
 * Created by chuliu on 2017/8/7.
 */
public class Order {

    private int id;
    private String code;
    private List<OrderItem> orderItems;

    public Order() {
    }

    public Order(int id, String code, List<OrderItem> orderItems) {
        this.id = id;
        this.code = code;
        this.orderItems = orderItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
