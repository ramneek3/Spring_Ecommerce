package com.example.ecommerce.webhook;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/webhooks/payment")
public class PaymentWebhookController {

    @PostMapping
    public String handleWebhook(@RequestBody Map<String, Object> payload) {
        return "Payment webhook received";
    }
}