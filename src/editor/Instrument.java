package editor;

import javafx.scene.input.InputEvent;

public interface Instrument
{
    /**
     * Обрабатывает событие и соответствующе изменяет холст
     * @param event событие для обработки
     * @param canvas холст который будет изменяться
     */
    public <T extends InputEvent> void handleEvent(T event, EditorCanvas canvas);
}
