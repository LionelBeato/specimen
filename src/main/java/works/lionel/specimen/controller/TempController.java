package works.lionel.specimen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import works.lionel.specimen.service.TempService;
import works.lionel.specimen.service.TempServiceImpl;

@RestController
public class TempController {

    private final TempService tempService;

    public TempController(TempService tempService){
        this.tempService = tempService;
    }

    @GetMapping("/sum/{x}/{y}")
    public Number getSum(@PathVariable Number x, @PathVariable Number y){
        return this.tempService.add(x, y);
    }

    @GetMapping("/hello")
    public String getHi(){
        return this.tempService.sayHi();
    }

}
