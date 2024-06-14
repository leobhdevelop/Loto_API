package br.com.well.loto_api.controll;

import br.com.well.loto_api.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LotteryController {

    @Autowired
    private LotteryService lotteryService;

    @GetMapping("/loteria/megasena")
    public String getMegaSena() {
        return lotteryService.getLotteryData("megasena");
    }

    @GetMapping("/loteria/diadesorte")
    public String getDiaDeSorte() {
        return lotteryService.getLotteryData("diadesorte");
    }

    @GetMapping("/loteria/duplasena")
    public String getDuplaSena() {
        return lotteryService.getLotteryData("duplasena");
    }

    @GetMapping("/loteria/lotofacil")
    public String getLotoFacil() {
        return lotteryService.getLotteryData("lotofacil");
    }

    @GetMapping("/loteria/lotomania")
    public String getLotoMania () {
        return lotteryService.getLotteryData("lotomania");
    }

    @GetMapping("/loteria/quina")
    public String getQuina () {
        return lotteryService.getLotteryData("quina");
    }

    @GetMapping("/loteria/supersete")
    public String getSuperSete () {
        return lotteryService.getLotteryData("supersete");
    }

    @GetMapping("/loteria/timemania")
    public String getTimeMania () {
        return lotteryService.getLotteryData("timemania");
    }

    @GetMapping("/loteria/maismilionaria")
    public String getMaisMilionaria() {
        return lotteryService.getLotteryData("maismilionaria");
    }
}
