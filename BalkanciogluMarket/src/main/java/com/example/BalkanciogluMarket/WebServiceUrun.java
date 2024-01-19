package com.example.BalkanciogluMarket;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/urun")
public class WebServiceUrun {
	private static final List<Urun> URUN_LIST = new ArrayList<>();

	static {
		URUN_LIST.add(new Urun("Kahve", "1"));
	}
	
	@GetMapping("/")
	public List<Urun> listele(){
		return URUN_LIST;
	}
	
	@PostMapping("/")
	public Urun ekle(@RequestBody Urun urun) {
		URUN_LIST.add(urun);
		return urun;
	}
	
    @GetMapping("/{urunNo}")
    public Urun bul(@PathVariable String urunNo) {
        for (Urun urun : URUN_LIST) {
            if (urun.getUrunNo() == urunNo) {
                return urun;
            }
        }
        return null;
    }
    
	@DeleteMapping("/{urunNo}")
	public boolean sil(@PathVariable String urunNo) {
		Urun urun = bul(urunNo);
		if (urun != null) {
			URUN_LIST.remove(urun);
			return true;
		}
		return false;
	}
}
