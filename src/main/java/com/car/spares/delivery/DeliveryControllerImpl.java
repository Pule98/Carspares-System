package com.car.spares.delivery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeliveryControllerImpl implements IDeliveryController{
    @GetMapping("/deliveryregistration")
    @Override
    public String showDeliveryPage(Model model) {
        return "deliveryServiceRegistration_page";
    }
}
