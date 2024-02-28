package az.edu.ada.wm2.springmvc.sessionattributesdemo.controller;

import az.edu.ada.wm2.springmvc.sessionattributesdemo.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
@SessionAttributes({"order"})
public class ProductsController {

    @GetMapping({"/", "/list", ""})
    public String getProductsPage(Model model, @ModelAttribute Order order) {
        model.addAttribute("order", order);
        System.out.println(order);
        return "products/list";
    }

    @PostMapping("/addToOrder")
    public String addProductToOrder(@ModelAttribute Order order,
                                    @RequestParam("product") String productName,
                                    Model model) {

        if (!productName.isBlank())
            order.addProduct(productName);

        model.addAttribute("order", order);

        return "redirect:/product/list";
    }

    @ModelAttribute
    public Order order() {
        return new Order();
    }
}
