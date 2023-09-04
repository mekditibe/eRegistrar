package edu.miu.eRegistrar.Controller;

import edu.miu.eRegistrar.Entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ProductController {

    @GetMapping("/addproductpage")
    public ModelAndView productForm(@ModelAttribute("product") Product product){
        Map<String, Product> params = new HashMap<>();
        if(product == null){
            params.put("product", new Product());
        }
        params.put("product", product);
        return new ModelAndView("AddProduct",params);
    }


}
