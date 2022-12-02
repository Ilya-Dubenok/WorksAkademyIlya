package home_work_3.calcs.api;

/**
 * Добавил этот интерфейс, чтобы можно было протестировать всех оптом
 */
public interface ICounter extends ICalculator{

    /**
     * Возвращает количество выполненных операций
     * @return
     */
    long getCountOperation();

}
