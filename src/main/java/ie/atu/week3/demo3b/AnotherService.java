package ie.atu.week3.demo3b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherService
{
    @GetMapping("/getDetails")
    public String getDetails()
    {
        return "This is another service";
    }
}
