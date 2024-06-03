@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	
    assertEquals("19 лет, ожидалось true", true, isAdult); // добавили сообщение об ошибке// Напиши код здесь
}
