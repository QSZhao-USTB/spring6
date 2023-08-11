package cn.zqs.spring6.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDao {

    public void saveOrder() {
        System.out.println("insert a new order");
    }


}
