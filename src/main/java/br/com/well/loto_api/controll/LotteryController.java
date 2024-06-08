package br.com.well.loto_api.controll;

import br.com.well.loto_api.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LotteryController {

    @Autowired
    private LotteryService lotteryService;

    @GetMapping("/")
    public String home() {
        return "home"; // nome da página HTML
    }

    @GetMapping("/loteria/megasena")
    public String getMegaSena(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("megasena"));
        return "result"; // nome da página HTML para exibir o resultado
    }

    @GetMapping("/loteria/diadesorte")
    public String getDiaDeSorte(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("diadesorte"));
        return "result";
    }

    @GetMapping("/loteria/duplasena")
    public String getDuplaSena(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("duplasena"));
        return "result";
    }

    @GetMapping("/loteria/lotofacil")
    public String getLotoFacil(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("lotofacil"));
        return "result";
    }

    @GetMapping("/loteria/lotomania")
    public String getLotoMania(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("lotomania"));
        return "result";
    }

    @GetMapping("/loteria/quina")
    public String getQuina(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("quina"));
        return "result";
    }

    @GetMapping("/loteria/supersete")
    public String getSuperSete(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("supersete"));
        return "result";
    }

    @GetMapping("/loteria/timemania")
    public String getTimeMania(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("timemania"));
        return "result";
    }

    @GetMapping("/loteria/maismilionaria")
    public String getMaisMilionaria(Model model) {
        model.addAttribute("result", lotteryService.getLotteryData("maismilionaria"));
        return "result";
    }
}
