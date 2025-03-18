
public class BonusService {
        @Test
        void shouldCalculateForRegisteredAndOverLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1_000_000;
            boolean registered = true;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
}
