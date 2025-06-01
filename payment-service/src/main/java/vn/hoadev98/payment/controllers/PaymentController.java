package vn.hoadev98.payment.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api"+"/v1")
public class PaymentController {
    @GetMapping("/payment-success")
    Object paymentSuccess() {
        return "Payment successful";
    }
}
