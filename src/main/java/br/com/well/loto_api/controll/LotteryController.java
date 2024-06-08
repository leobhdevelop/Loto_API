package br.com.well.loto_api.controll;

import br.com.well.loto_api.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loteria")
public class LotteryController {



    @Autowired
    private LotteryService lotteryService;

    @GetMapping("/megasena")
    public String getMegaSena() {
        return lotteryService.getLotteryData("megasena");
    }

    @GetMapping("/diadesorte")
    public String getDiaDeSorte() {
        return lotteryService.getLotteryData("diadesorte");
    }

    @GetMapping("/duplasena")
    public String getDuplaSena() {
        return lotteryService.getLotteryData("duplasena");
    }

    @GetMapping("/lotofacil")
    public String getLotoFacil() {
        return lotteryService.getLotteryData("lotofacil");
    }

    @GetMapping("/lotomania")
    public String getLotoMania() {
        return lotteryService.getLotteryData("lotomania");
    }

    @GetMapping("/quina")
    public String getQuina() {
        return lotteryService.getLotteryData("quina");
    }

    @GetMapping("/supersete")
    public String getSuperSete() {
        return lotteryService.getLotteryData("supersete");
    }

    @GetMapping("/timemania")
    public String getTimeMania() {
        return lotteryService.getLotteryData("timemania");
    }

    @GetMapping("/maismilionaria")
    public String getMaisMilionaria() {
        return lotteryService.getLotteryData("maismilionaria");
    }
}
