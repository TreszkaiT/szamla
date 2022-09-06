package com.tresz.szamla.viewcontrollers;

import com.tresz.szamla.datas.components.ProductProperty;
import org.springframework.stereotype.Controller;

@Controller
public class ProductPropertyController {

    private ProductProperty productProperty;

    public ProductPropertyController(ProductProperty productProperty) {
        this.productProperty = productProperty;
    }

    public Double getProductVersion() {return productProperty.getVersion();};
}
