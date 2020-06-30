package vexpress.pricing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricingController {
  @GetMapping("/price")
  public double getPrice(
      @RequestParam final String fromZip,
      @RequestParam final String toZip,
      @RequestParam final double weight) {
    return weight * Math.PI;
  }
}
