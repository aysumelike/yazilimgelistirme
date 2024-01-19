package com.example.BalkanciogluMarket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WebServiceUrunTest {

	@Test
	void testListele() {
		WebServiceUrun urunWebService = new WebServiceUrun();
		assertEquals(1, urunWebService.listele().size());
	}

	@Test
	void testEkle() {
		WebServiceUrun urunWebService = new WebServiceUrun();
		Urun eklenenUrun = new Urun("Çay", "2");
		assertEquals(eklenenUrun, urunWebService.ekle(eklenenUrun));
		assertEquals(1, urunWebService.listele().size());
	}

	@Test
	void testBul() {
		WebServiceUrun urunWebService = new WebServiceUrun();
		Urun bulunanUrun = urunWebService.bul("1");
		assertNotNull(bulunanUrun);
		assertEquals("Kahve", bulunanUrun.getUrunAd());
		assertEquals("1", bulunanUrun.getUrunNo());
	}

	@Test
	void testSil() {
		WebServiceUrun urunWebService = new WebServiceUrun();
        assertFalse(urunWebService.sil("3"));
        assertTrue(urunWebService.sil("1"));
	}

}
