package  com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.entity.TypeEntity;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("findOrder")
    public String findOrder(Model model){
        model.addAttribute("order",orderService.findOrder());
        return "order";
    }

    @RequestMapping("toAdd2")
    public String toAdd2(Model model){
        List<TypeEntity> orderEntityList=orderService.findType();
        model.addAttribute("order",new OrderEntity());
        model.addAttribute("orderEntityList",orderEntityList);
        return  "add2";
    }



    @RequestMapping("saveOrder")
    public String saveOrder(OrderEntity orderEntity){
        orderService.saveOrder(orderEntity);
        return "redirect:findOrder";
    }

    @RequestMapping("deleteOrder")
    public String deleteOrder(Integer orderId){

        orderService.deleteOrder(orderId);

        return "redirect:findOrder";
    }

    @RequestMapping("findById2")
    public String findById2(Integer orderId,Model model){
        List<TypeEntity> orderEntityList=orderService.findType();
        model.addAttribute("order", orderService.findById2(orderId));
        model.addAttribute("orderEntityList",orderEntityList);
        return "add2";
    }

}
